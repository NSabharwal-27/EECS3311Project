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

    public HashMap<String, DataSet> analysisExecute(){
        
     // Example: Country = Canada, from 2000 to 2020
        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;
        
        HashMap<String, DataSet> data = new HashMap<String, DataSet>();
        
        DataSet averageForestArea = calculateAverageForestArea(countryCode, startYear, endYear);
        //System.out.println(String.format("Average forest area: %.2f", averageForestArea));
        
        data.put("Average Forest Area", averageForestArea);
        return data;
    }
    
    private static DataSet calculateAverageForestArea(String countryCode, int startYear, int endYear)
    {
        DataSet rawData = FetchData.fetchData(countryCode, FOREST_AREA_CODE, startYear, endYear);
        return CalculateAverage.calculate(rawData);
    }
}
