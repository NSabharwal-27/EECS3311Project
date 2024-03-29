package analysis;

import java.util.HashMap;

import fetchData.DataSet;
import fetchData.FetchData;

/*
 * 1 Series Graph
 * The ratio between:
 *      1.C02 emissions
 *      2.GDP per capita
 */

public class Analysis_Type3 implements AnalysisStrategy{

        final static String CO2_EMISSIONS_CODE = "EN.ATM.CO2E.PC";
        final static String GDP_CODE = "NY.GDP.PCAP.CD";
        
        public HashMap<String, DataSet> analysisExecute(int start, int end, String country){
            
            String countryCode = country;
            int startYear = start;
            int endYear = end;
            
            HashMap<String, DataSet> data = new HashMap<String, DataSet>();
            
            DataSet ratio = calculateCO2ToGDPRatio(countryCode, startYear, endYear);
            //System.out.println(ratio);
            
            data.put("C02 to GDP Ratio", ratio);
            
            return data;
        }
        
        public static DataSet calculateCO2ToGDPRatio(String countryCode, int startYear, int endYear)
        {
            DataSet rawDataCO2 = FetchData.fetchData(countryCode, CO2_EMISSIONS_CODE, startYear, endYear);
            DataSet rawDataGDP = FetchData.fetchData(countryCode, GDP_CODE, startYear, endYear);
            
            //Larger numbers divided by smaller numbers
            return CalculateRatio.calculate(rawDataGDP, rawDataCO2);
        }
}

