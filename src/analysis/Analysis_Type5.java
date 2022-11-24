package analysis;

import java.util.HashMap;

import fetchData.DataSet;
import fetchData.FetchData;

public class Analysis_Type5 {

    final static String GOV_EXPENDITURE = "SE.XPD.TOTL.GD.ZS";
    
    public HashMap<String, DataSet> analysisExecute(int start, int end, String country){
        
        String countryCode = country;
        int startYear = start;
        int endYear = end;
        
        HashMap<String, DataSet> data = new HashMap<String, DataSet>();
        DataSet toReturn = new DataSet();
        double govExpenditure = calculateAverageGovExpenditure(countryCode, startYear, endYear);
        
        toReturn.put(0, govExpenditure);
        //System.out.println(String.format("Average government expenditure: %.2f", govExpenditure));
        
        data.put("Government Expenditure", toReturn);
        return data;
    }

    private static double calculateAverageGovExpenditure(String countryCode, int startYear, int endYear) {
        
        DataSet rawData = FetchData.fetchData(countryCode, GOV_EXPENDITURE, startYear, endYear);
        return CalculateAverage.calculate(rawData);
    }
}
