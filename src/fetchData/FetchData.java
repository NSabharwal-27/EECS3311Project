package fetchData;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class FetchData {
   
    private static HttpURLConnection connection;

    /**
     * Fetches data from WorldBank.org for the specified country code, indicator,
     * and year range. Returns a HashMap<Integer, Double> in the format (year,
     * value).
     * 
     * @param countryCode - Official country code as per WorldBank
     * @param indicator   - Official indicator code as per WorldBank
     * @param startYear   - Start year for data, represented as an integer. e.g. 1970
     *
     * @param endYear     - End year for data, represented as an integer. e.g. 2015
     * @return HashMap<Integer, Double> in the format of <year, value>. A year with
     *         an undefined value returns null as the value.
     */
    public static DataSet fetchData(String countryCode, String indicator, int startYear, int endYear) {
        String mappedCode = mapCode(countryCode);
        String urlString = String.format("http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json",
                mappedCode, indicator, startYear, endYear);

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            if (connection.getResponseCode() == 200) { // Successful

                // Read response into JsonArray
                String info = "";
                Scanner urlScanner = new Scanner(url.openStream());
                while (urlScanner.hasNext()) {
                    info += urlScanner.nextLine();
                }
                urlScanner.close();
                JsonArray jsonArray = new JsonParser().parse(info).getAsJsonArray();
                DataSet data = new DataSet(jsonArray, countryCode, indicator, startYear, endYear);
                connection.disconnect();
                return data;
            } else { // Unsuccessful connection
                System.out.println("Connection Error: " + connection.getResponseCode() + " URL: " + urlString);
                return null;
            }
        } catch (Exception E) {
            return null;
        }
    }
    
    private static String mapCode(String countryCode) {
        String toReturn = "";
        
        switch (countryCode) {
            case "Canada":
                toReturn = "CAN";
                break;
            case "China":
                toReturn = "CHN";
                break;
            case "Brazil":
                toReturn = "BRA";
                break;
            case "France":
                toReturn = "FRA";
                break;
            case "USA":
                toReturn = "USA";
                break;
        }
   
        return toReturn;
    }
}
