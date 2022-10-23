package analysis;

import java.util.HashMap;
import fetchData.FetchData;

public class Analysis_Type5 {

    final static String GOV_EXPENDITURE = "SE.XPD.TOTL.GD.ZS";
    
    public static void main(String[] args) {
        
        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;
        
        double nullCounter = 0.0;
        double average = 0.0;
        
        HashMap<Integer, Double> forestArea = getForestArea(countryCode, GOV_EXPENDITURE, startYear, endYear);
        
        for(int i = startYear = 2000; i <= endYear; i++) {
            if(forestArea.get(i) == null) {
                average += 0;
                nullCounter++;
            }
            else {
                average += forestArea.get(i);
            }
        }
        
        System.out.println("Average is: " + (average / ((endYear - startYear) - nullCounter)));
    }

    private static HashMap<Integer, Double> getForestArea(String countryCode, String forestAreaCode,
            int startYear, int endYear) {
        
        HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, forestAreaCode, startYear, endYear);
        return rawData;
    }
}
