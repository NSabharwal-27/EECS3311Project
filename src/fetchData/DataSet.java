package fetchData;

import java.util.TreeMap;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

// A class representing the data set returned from a single JSON request.
public class DataSet {

    TreeMap<Integer, Double> map;
    public String countryCode;
    public String indicator;
    public int startYear, endYear;

    /*
     * Empty Data Set
     */
    public DataSet() {
        map = new TreeMap<>();
    }

    /*
     * Create a DataSet from JSON Array. Include parameters used in data fetch.
     */
    public DataSet(JsonArray jsonArray, String countryCode, String indicator, int startYear, int endYear) {
        this.countryCode = countryCode;
        this.indicator = indicator;
        this.startYear = startYear;
        this.endYear = endYear;

        map = new TreeMap<>();
        int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();

        // For each year in JSON results
        JsonObject object;
        int year;
        Double value = null;
        for (int i = 0; i < sizeOfResults; i++) {
            object = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject();
            year = object.get("date").getAsInt(); // Get year as int
            value = (object.get("value").isJsonNull() ? null : object.get("value").getAsDouble()); 
            map.put(year, value);
        }
    }

    public void putPair(Pair pair) {
        put(pair.getKey(), pair.getValue());
    }

    public void put(int key, Double value) {
        map.put(key, value);
    }

    public Double get(int key) {
        return map.get(key);
    }

    public DataSetIterator getIterator() {
        return new DataSetIterator(this);
    }

    public String toString() {
        DataSetIterator iterator = this.getIterator();
        String string = "";
        Pair pair;

        while (iterator.hasNext()) {
            pair = iterator.next();
            string += pair.getKey() + " : " + pair.getValue() + "\n";
        }

        return string;
    }

    public String toStringRounded() {
        DataSetIterator iterator = this.getIterator();
        String string = "";
        Pair pair;

        while (iterator.hasNext()) {
            pair = iterator.next();
            string += pair.getKey() + " : " + String.format("%.6f", pair.getValue()) + "\n";
        }
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        DataSet other = (DataSet) obj;
        return this.map.equals(other.map);
    }

    public int size() {
        return map.size();
    }
}
