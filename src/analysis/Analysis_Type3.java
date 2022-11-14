package analysis;

import fetchData.DataSet;
import fetchData.FetchData;

/*
 * 1 Series Graph
 * The ratio between:
 *      1.C02 emissions
 *      2.GDP per capita
 */

public class Analysis_Type3 {

        final static String CO2_EMISSIONS_CODE = "EN.ATM.CO2E.PC";
        final static String GDP_CODE = "NY.GDP.PCAP.CD";
        
        public static void main(String[] args) {
            
            String countryCode = "CAN";
            int startYear = 2000;
            int endYear = 2020;
            
            DataSet ratio = calculateCO2ToGDPRatio(countryCode, startYear, endYear);
            System.out.println(ratio);
        }
        
        public static DataSet calculateCO2ToGDPRatio(String countryCode, int startYear, int endYear)
        {
            DataSet rawDataCO2 = FetchData.fetchData(countryCode, CO2_EMISSIONS_CODE, startYear, endYear);
            DataSet rawDataGDP = FetchData.fetchData(countryCode, GDP_CODE, startYear, endYear);
            
            //Larger numbers divided by smaller numbers
            return CalculateRatio.calculate(rawDataGDP, rawDataCO2);
        }
}

