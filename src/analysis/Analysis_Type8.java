package analysis;

import fetchData.DataSet;
import fetchData.FetchData;

public class Analysis_Type8 {

    final static String GOV_EXPENDITURE_EDUCATION = "SE.XPD.TOTL.GD.ZS";
    final static String CURRENT_HEALTH_EXPENDITURE = "SH.XPD.CHEX.GD.ZS";

    public static void main(String[] args) {

        String countryCode = "CAN";
        int startYear = 2000;
        int endYear = 2020;

        DataSet govEducation = getExpenditureData(countryCode, GOV_EXPENDITURE_EDUCATION, startYear, endYear);
        DataSet govHealth = getExpenditureData(countryCode, CURRENT_HEALTH_EXPENDITURE, startYear, endYear);

        System.out.println("Education expenditure:");
        System.out.println(govEducation);

        System.out.println("Health expenditure:");
        System.out.println(govHealth);
    }

    private static DataSet getExpenditureData(String countryCode, String expenditureCode,
            int startYear, int endYear) {
        DataSet rawData = FetchData.fetchData(countryCode, expenditureCode, startYear, endYear);
        return rawData;
    }

}
