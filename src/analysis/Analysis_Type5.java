package analysis;

import fetchData.DataSet;
import fetchData.FetchData;

public class Analysis_Type5 {

    final static String GOV_EXPENDITURE = "SE.XPD.TOTL.GD.ZS";
    
    public static void main(String[] args) {
        
        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;
        
        double govExpenditure = calculateAverageGovExpenditure(countryCode, startYear, endYear);
        System.out.println(String.format("Average government expenditure: %.2f", govExpenditure));
    }

    private static double calculateAverageGovExpenditure(String countryCode, int startYear, int endYear) {
        
        DataSet rawData = FetchData.fetchData(countryCode, GOV_EXPENDITURE, startYear, endYear);
        return CalculateAverage.calculate(rawData);
    }
}
