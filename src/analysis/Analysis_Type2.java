package analysis;

import fetchData.DataSet;
import fetchData.FetchData;

// 2 Series Graph
// Annual percentage change of 
//      1. PM2.5 air pollution, mean annual exposure (as mg / cubic meter)
//      2. Forest area (as % of land area) 

public class Analysis_Type2 {

    final static String POLLUTION_CODE = "EN.ATM.PM25.MC.M3";
    final static String FOREST_AREA_CODE = "AG.LND.FRST.ZS";

    public static void main(String[] args) {

        // Example: Country = Canada, from 2000 to 2020
        String countryCode = "USA";
        int startYear = 2000;
        int endYear = 2020;

        // PM2.5 air pollution, mean annual exposure (as mg / cubic meter)
        DataSet pollutionAnnualPercentage = calculateAnnualPercentageChangePollution(countryCode, startYear, endYear);
        System.out.println("\nAnnual Percentage Change of Pollution for: " + countryCode + "\n----------------------");
        System.out.println(pollutionAnnualPercentage);

        // Forest area (as % of land area)
        System.out.println("\n\n-----------------\n\n");
        DataSet forestAreaAnnualPercentage = calculateAnnualPercentageChangeForestArea(countryCode, startYear, endYear);
        System.out.println("\nAnnual Percentage Change of Forest Area for: " + countryCode + "\n----------------------");
        System.out.println(forestAreaAnnualPercentage);
    }
    
    public static DataSet calculateAnnualPercentageChangePollution(String countryCode, int startYear, int endYear) {
        DataSet rawData = FetchData.fetchData(countryCode, POLLUTION_CODE, startYear, endYear); // Data from fetch
        return CalculateAnnualPercentageChange.calculate(rawData);
    }
    public static DataSet calculateAnnualPercentageChangeForestArea(String countryCode, int startYear, int endYear) {
        DataSet rawData = FetchData.fetchData(countryCode, FOREST_AREA_CODE, startYear, endYear); // Data from fetch
        return CalculateAnnualPercentageChange.calculate(rawData);
    }
}
