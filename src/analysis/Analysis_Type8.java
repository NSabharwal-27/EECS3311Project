package analysis;

import java.util.HashMap;

import fetchData.DataSet;
import fetchData.FetchData;

public class Analysis_Type8 implements AnalysisStrategy{

    final static String GOV_EXPENDITURE_EDUCATION = "SE.XPD.TOTL.GD.ZS";
    final static String CURRENT_HEALTH_EXPENDITURE = "SH.XPD.CHEX.GD.ZS";

    public HashMap<String, DataSet> analysisExecute(){

        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;
        
        HashMap<String, DataSet> data = new HashMap<String, DataSet>();

        DataSet govEducation = getExpenditureData(countryCode, GOV_EXPENDITURE_EDUCATION, startYear, endYear);
        DataSet govHealth = getExpenditureData(countryCode, CURRENT_HEALTH_EXPENDITURE, startYear, endYear);

        /*
         * System.out.println("Education expenditure:");
         * System.out.println(govEducation);
         * 
         * System.out.println("Health expenditure:");
         * System.out.println(govHealth);
         */
        
        data.put("Government Health Expenditure", govHealth);
        data.put("Government Education Expenditure", govEducation);
        
        return data;
    }

    private static DataSet getExpenditureData(String countryCode, String expenditureCode,
            int startYear, int endYear) {
        DataSet rawData = FetchData.fetchData(countryCode, expenditureCode, startYear, endYear);
        return rawData;
    }

}
