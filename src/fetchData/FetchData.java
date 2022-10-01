package fetchData;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FetchData {
	public static void main(String[] args) {
		
		//Example Fetch
		System.out.println(fetchData("CAN", "EN.ATM.PM25.MC.M3", 2005, 2020));
		System.out.println(fetchData("CAN", "AG.LND.FRST.ZS", 2005, 2020));
	}

	/**
	 * Fetches data from WorldBank.org for the specified country code, indicator,
	 * and year range. Returns a HashMap<Integer, Double> in the format (year, value).
	 * 
	 * @param countryCode - Official country code as per
	 * @param indicator   - Official indicator code as per
	 * @param startYear   - Start year for data, represented as an integer. e.g. 1970
	 * @param endYear     - End year for data, represented as an integer. e.g. 2015
	 * @return HashMap<Integer, Double> in the format of <year, value>. A year with an undefined value returns null as the value.
	 */
	public static HashMap<Integer, Double> fetchData(String countryCode, String indicator, int startYear, int endYear) {
		String urlString = String.format("http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json",
			countryCode, indicator, startYear, endYear);
		HttpURLConnection connection;
		HashMap<Integer, Double> results = new HashMap<Integer, Double>();

		try {
			URL url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			if (connection.getResponseCode() == 200) { //Successful

				//Read response into JsonArray
				String info = "";
				Scanner urlScanner = new Scanner(url.openStream());
				while (urlScanner.hasNext()) {
					info += urlScanner.nextLine();
				}
				urlScanner.close();
				JsonArray jsonArray = new JsonParser().parse(info).getAsJsonArray();
				int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();

				//For each year in JSON results
				JsonObject object;
				int year;
				Double value = null;
				for (int i = sizeOfResults - 1; i >= 0; i--) { //Read backwards to get increasing order.
					object = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject();
					year = object.get("date").getAsInt(); //Get year as int
					value = (object.get("value").isJsonNull() ? null : object.get("value").getAsDouble()); //Get double value, or Null if undefined for specific year
					results.put(year, value);
				}
				connection.disconnect();
				return results;
			} else { //Unsuccessful connection
				System.out.println("Connection Error: " + connection.getResponseCode() + " URL: " + urlString);
				return null;
			}
		} catch (Exception E) {
			return null;
		}
	}
}
