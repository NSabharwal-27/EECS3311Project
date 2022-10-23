package analysis;

import java.util.HashMap;

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
            
            HashMap<Integer, Double> gdpPerCapita = calculateGDP(countryCode, GDP_CODE, startYear, endYear);
            HashMap<Integer, Double> c02Emissions = getCO2Emission(countryCode, CO2_EMISSIONS_CODE, startYear, endYear);
            
            for(int i = startYear; i <= endYear; i++) {
                System.out.println(i + ": " + String.format("%.2f", gdpPerCapita.get(i)) + " : " + c02Emissions.get(i));
            }
        
        }

        private static HashMap<Integer, Double> getCO2Emission(String countryCode, String co2EmissionsCode,
                int startYear, int endYear) {
            
            HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, co2EmissionsCode, startYear, endYear);
            return rawData;
        }

        private static HashMap<Integer, Double> calculateGDP(String countryCode, String gdpCode, int startYear,
                int endYear) {
            
            HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, gdpCode, startYear, endYear);
            return rawData;
        }
}

