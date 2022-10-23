package analysis;

import java.util.HashMap;
import fetchData.FetchData;

/**
 * 1-series pie chart graph, the average of
 *     1. Forest area (as % of land area) for the selected years
 *      
 *     The rest percentage would be land for all other uses
 */

public class Analysis_Type4 {
    
    final static String FOREST_AREA_CODE = "AG.LND.FRST.ZS";

    public static void main(String[] args) {
        
     // Example: Country = Canada, from 2000 to 2020
        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;
        
        double averageForestArea = calculateAvergeForestArea(countryCode, FOREST_AREA_CODE, startYear, endYear);
        System.out.println(String.format("Average forest area: %.2f", averageForestArea));
        
    }
    
    private static double calculateAvergeForestArea(String countryCode, String indicatorCode, int startYear, int endYear){
        
        HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, indicatorCode, startYear, endYear);
        
        double totalForestArea = 0;
        int actualYearCount = rawData.size();
        
        for(int i = startYear; i <= endYear; i++) {
            if (rawData.get(i) != null) {
                totalForestArea += rawData.get(i);
            }
            else {
                totalForestArea += 0;
                actualYearCount--;
            }
        }
        
        double averageForestArea = totalForestArea/actualYearCount;
        
        return averageForestArea;
    }

}
