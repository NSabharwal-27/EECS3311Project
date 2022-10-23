package analysis;

import java.util.HashMap;

import fetchData.FetchData;

public class Analysis_Type8 {

    final static String GOV_EXPENDITURE_EDUCATION = "SE.XPD.TOTL.GD.ZS";
    final static String CURRENT_HEALTH_EXPENDITURE = "SH.XPD.CHEX.GD.ZS";
    
    public static void main(String[] args) {
        
        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;
        
        HashMap<Integer, Double> govEducation = getExpenditureData(countryCode, GOV_EXPENDITURE_EDUCATION, startYear, endYear);
        HashMap<Integer, Double> govHealth = getExpenditureData(countryCode, CURRENT_HEALTH_EXPENDITURE, startYear, endYear);
        
        for(int i = startYear; i <= endYear; i++) {
            System.out.println(i + ": Education expenditure: " + String.format("%.4f", govEducation.get(i)));
            System.out.println(i + ": Health expenditure: " + String.format("%.4f", govHealth.get(i)));
        }
    }

    private static HashMap<Integer, Double> getExpenditureData(String countryCode, String expenditureCode,
            int startYear, int endYear) {
        
        HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, expenditureCode, startYear, endYear);
        return rawData;
    }
    
}
