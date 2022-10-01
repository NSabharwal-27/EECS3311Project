package analysis;

import java.util.HashMap;
import fetchData.FetchData;

// 2 Series Graph
// Annual percentage change of 
// 		1. PM2.5 air pollution, mean annual exposure (as mg / cubic meter)
//		2. Forest area (as % of land area) 

public class Analysis_Type2 {

	final static String POLLUTION_CODE = "EN.ATM.PM25.MC.M3";
	final static String FOREST_AREA_CODE = "AG.LND.FRST.ZS";

	public static void main(String[] args) {

		// Example: Country = Canada, from 2000 to 2020
		String countryCode = "CAN";
		int startYear = 2000;
		int endYear = 2020;

		// PM2.5 air pollution, mean annual exposure (as mg / cubic meter)
		HashMap<Integer, Double> pollutionAnnualPercentage = calculateAnnualPercentageChange(countryCode,
				POLLUTION_CODE, startYear, endYear);
		System.out.println("\nAnnual Percentage Change of Pollution for: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", pollutionAnnualPercentage.get(i)) + " %");
		}

		// Forest area (as % of land area)
		System.out.println("\n\n-----------------\n\n");
		HashMap<Integer, Double> forestAreaAnnualPercentage = calculateAnnualPercentageChange(countryCode,
				FOREST_AREA_CODE, startYear, endYear);
		System.out
				.println("\nAnnual Percentage Change of Forest Area for: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", forestAreaAnnualPercentage.get(i)) + " %");
		}
	}

	/**
	 * Returns a HashMap<Integer, Double> of the calculated annual percentage
	 * changes in form (year, percentChange). For a year with an undefined
	 * percentage change, percentChange = null. (e.g. Year 1)
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

		Double[] lastYearWithData = new Double[2]; //Keeps track of the last year with a recorded value. (To support years with no recorded value/null)
		Double percentageChange;

		// Handle start year, as it has no previous value to compare change to.
		if (rawData.get(startYear) != null) {
			lastYearWithData[0] = (double) startYear;
			lastYearWithData[1] = rawData.get(startYear);
		}
		percentages.put(startYear, null); // No previous year to compare base year with

		// For all years after start year
		for (int year = startYear + 1; year <= endYear; year++) {
			Double currentYearVal = rawData.get(year) == null ? null : rawData.get(year);

			if (currentYearVal != null) // Current year has a value
			{
				int yearsSince = year - lastYearWithData[0].intValue(); // Most likely 1, but multiple years may have
																		// passed since there was a recorded value.
				Double previousVal = lastYearWithData[1]; // Most likely the year prior, but may be a couple years prior.
				if (previousVal == null) // No previous value to compare change against.
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
