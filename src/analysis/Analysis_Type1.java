package analysis;

import fetchData.DataSet;
import fetchData.FetchData;
import java.util.HashMap;

// 3 Series Graph
// The annual percentage change of  
// 		1. CO2 emissions (as metric tons per capita)
//		2. Energy use (as kg of oil equivalent per capita)
// 		3. PM2.5 air pollution, mean annual exposure 
// 			(as micrograms per cubic meter) (3-series graph)
// note:The change rate for the first selected year would be 
// 		with respect to the previous year. For example, if you 
// 		select as a range 2018 – 2021 the annual change rate 
// 		for 2018 would be between 2017 and 2018.

public class Analysis_Type1 implements AnalysisStrategy {

	final static String CO2_EMISSIONS_CODE = "EN.ATM.CO2E.PC";
	final static String ENERGY_USE_CODE = "EG.USE.PCAP.KG.OE";
	final static String POLLUTION_CODE = "EN.ATM.PM25.MC.M3";

	public HashMap<String, DataSet> analysisExecute(int start, int end, String country) {

		HashMap<String, DataSet> data = new HashMap<String, DataSet>();

		// Example: Country = Canada, from 2000 to 2020
		String countryCode = country;
		int startYear = start;
		int endYear = end;

		// CO2 emissions (as metric tons per capita)
		DataSet CO2EmissionsAnnualPercentage = calculateAnnualPercentageChangeCO2(countryCode, startYear, endYear);
		System.out.println("\nAnnual Percentage Change of CO2 Emissions for: " + countryCode + "\n----------------------");
		System.out.println(CO2EmissionsAnnualPercentage);

		// Energy use (as kg of oil equivalent per capita)
		System.out.println("\n\n-----------------\n\n");
		DataSet EnergyUseAnnualPercentage = calculateAnnualPercentageChangeEnergy(countryCode, startYear, endYear);
		System.out.println("\nAnnual Percentage Change of Energy Use for: " + countryCode + "\n----------------------");
	    System.out.println(EnergyUseAnnualPercentage);

		// PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)
		System.out.println("\n\n-----------------\n\n");
		DataSet pollutionAnnualPercentage = calculateAnnualPercentageChangePollution(countryCode, startYear, endYear);
		System.out.println("\nAnnual Percentage Change of Pollution for: " + countryCode + "\n----------------------");
	    System.out.println(pollutionAnnualPercentage);

		data.put("C02 Annual emissions percentage", CO2EmissionsAnnualPercentage);
		data.put("Annual Pollution Percentage", pollutionAnnualPercentage);
		
		return data;
	}

	/**
	 * Returns a DataSet of the calculated annual percentage
	 * changes in form (year, percentChange). For a year with an undefined
	 * percentage change, percentChange = null.
	 */
	public static DataSet calculateAnnualPercentageChangeCO2(String countryCode, int startYear, int endYear)
	{
		DataSet rawData = FetchData.fetchData(countryCode, CO2_EMISSIONS_CODE, startYear, endYear); // Data from fetch
		return CalculateAnnualPercentageChange.calculate(rawData);
	}
	
	/**
     * Returns a DataSet of the calculated annual percentage
     * changes in form (year, percentChange). For a year with an undefined
     * percentage change, percentChange = null.
     */
	public static DataSet calculateAnnualPercentageChangeEnergy(String countryCode, int startYear, int endYear)
	{
        DataSet rawData = FetchData.fetchData(countryCode, ENERGY_USE_CODE, startYear, endYear); // Data from fetch
        return CalculateAnnualPercentageChange.calculate(rawData);
    }
	
	/**
     * Returns a DataSet of the calculated annual percentage
     * changes in form (year, percentChange). For a year with an undefined
     * percentage change, percentChange = null.
     */
	public static DataSet calculateAnnualPercentageChangePollution(String countryCode, int startYear, int endYear)
	{
        DataSet rawData = FetchData.fetchData(countryCode, POLLUTION_CODE, startYear, endYear); // Data from fetch
        return CalculateAnnualPercentageChange.calculate(rawData);
    }
	
}
