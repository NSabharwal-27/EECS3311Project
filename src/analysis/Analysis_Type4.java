package analysis;

import java.util.HashMap;

import fetchData.DataSet;
import fetchData.FetchData;

/**
 * 1-series pie chart graph, the average of
 *     1. Forest area (as % of land area) for the selected years
 *     The rest percentage would be land for all other uses
 */

public class Analysis_Type4 {
    
    final static String FOREST_AREA_CODE = "AG.LND.FRST.ZS";

    public HashMap<String, DataSet> analysisExecute(int start, int end, String country){
        
     // Example: Country = Canada, from 2000 to 2020
        String countryCode = country;
        int startYear = start;
        int endYear = end;
        
        HashMap<String, DataSet> data = new HashMap<String, DataSet>();
        DataSet toReturn = new DataSet();
        
        Double averageForestArea = calculateAverageForestArea(countryCode, startYear, endYear);
        toReturn.put(0, averageForestArea);
        //System.out.println(String.format("Average forest area: %.2f", averageForestArea));
        
        
        data.put("Average Forest Area", toReturn);
        return data;
    }
    
    private static Double calculateAverageForestArea(String countryCode, int startYear, int endYear)
    {
        DataSet rawData = FetchData.fetchData(countryCode, FOREST_AREA_CODE, startYear, endYear);
        return CalculateAverage.calculate(rawData);
    }
}
