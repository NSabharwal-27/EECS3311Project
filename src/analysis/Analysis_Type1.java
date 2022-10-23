package analysis;

import java.util.HashMap;
import fetchData.FetchData;

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

public class Analysis_Type1 {

	final static String CO2_EMISSIONS_CODE = "EN.ATM.CO2E.PC";
	final static String ENERGY_USE_CODE = "EG.USE.PCAP.KG.OE";
	final static String POLLUTION_CODE = "EN.ATM.PM25.MC.M3";

	public static void main(String[] args) {

		// Example: Country = Canada, from 2000 to 2020
		String countryCode = "CAN";
		int startYear = 2000;
		int endYear = 2020;

		// CO2 emissions (as metric tons per capita)
		HashMap<Integer, Double> CO2EmissionsAnnualPercentage = calculateAnnualPercentageChange(countryCode,
				CO2_EMISSIONS_CODE, startYear, endYear);
		System.out.println("\nAnnual Percentage Change of CO2 Emissions for: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", CO2EmissionsAnnualPercentage.get(i)) + " %");
		}

		// Energy use (as kg of oil equivalent per capita)
		System.out.println("\n\n-----------------\n\n");
		HashMap<Integer, Double> EnergyUseAnnualPercentage = calculateAnnualPercentageChange(countryCode,
				ENERGY_USE_CODE, startYear, endYear);
		System.out
				.println("\nAnnual Percentage Change of Energy Use for: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", EnergyUseAnnualPercentage.get(i)) + " %");
		}

		// PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)
		System.out.println("\n\n-----------------\n\n");
		HashMap<Integer, Double> pollutionAnnualPercentage = calculateAnnualPercentageChange(countryCode,
				POLLUTION_CODE, startYear, endYear);
		System.out.println("\nAnnual Percentage Change of Pollution for: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", pollutionAnnualPercentage.get(i)) + " %");
		}
	}

	/**
	 * Returns a HashMap<Integer, Double> of the calculated annual percentage
	 * changes in form (year, percentChange). For a year with an undefined
	 * percentage change, percentChange = null.
	 */
	private static HashMap<Integer, Double> calculateAnnualPercentageChange(String countryCode, String indicatorCode,
			int startYear, int endYear) {

		/**
		 * Skips years that have no recorded value (null). Keeps track of the latest
		 * year with a value, to perform calculation across years with no data.
		 * 
		 * e.g. If 2000 and 2005 have values but the years in between do not: - Keeps
		 * track of year 2000 as having the last recorded value. - Calculates the annual
		 * percent change, then divides by the years that have passed to get average
		 * annual percent change across the years
		 **/

		HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, indicatorCode, startYear, endYear); // Data from fetch
		HashMap<Integer, Double> percentages = new HashMap<Integer, Double>(); // For the calculated annual percent change

		// Print raw data as reference (To later be removed)
		System.out.println("Raw Data:\n");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", rawData.get(i)));
		}

		Double[] lastYearWithData = new Double[2]; //Keeps track of the last year with a recorded value.
		Double percentageChange;

		// Set the lastYearWithData with a previous year to be able to calculate the start year percentage
		// Fetches the value of the previous year and loads it into lastYearWithData if  != null
		// otherwise loops through the past 10 years to get till it find a year with a non-null value 
		HashMap<Integer, Double> preStartingYear = FetchData.fetchData(countryCode, indicatorCode, startYear-1, startYear-1);
		int i = 1;
		while(preStartingYear.get(startYear-i) == null && i <= 10){
			i++;
			preStartingYear = FetchData.fetchData(countryCode, indicatorCode, startYear-i, startYear-i);
			// System.out.println(startYear-i + ": " + String.format("%.6f", preStartingYear.get(startYear-i)));
		}

		lastYearWithData[0] = (double) startYear-i;
		lastYearWithData[1] = preStartingYear.get(startYear-i);

		// For all years starting from startYear
		for (int year = startYear; year <= endYear; year++) {
			Double currentYearVal = rawData.get(year) == null ? null : rawData.get(year);

			if (currentYearVal != null) // Current year has a value
			{
				int yearsSince = year - lastYearWithData[0].intValue(); // Most likely 1, but multiple years may have
																		// passed since there was a recorded value.
				Double previousVal = lastYearWithData[1]; // Most likely the year prior, but may be a couple years prior.
				if (previousVal == null) // No previous value to compare change against.(only to check against the first year)
					percentageChange = null;
				else
					percentageChange = 100.0 * ((currentYearVal - previousVal) / previousVal) / yearsSince;

				// Keep track of year as latest year with a recorded value
				lastYearWithData[0] = (double) year;
				lastYearWithData[1] = currentYearVal;
			} else {
				percentageChange = null; // No value for current year
			}
			percentages.put(year, percentageChange);
		}
		return percentages;
	}

}
