package analysis;

import java.util.HashMap;
import fetchData.FetchData;

// 2 Series Graph
// 		1. Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)
//		2. Mortality rate, infant (per 1,000 live births)
// Here we only need to return the raw data with no analysis

public class Analysis_Type7 {

	final static String PROBLEMS_ACCESSING_HEALTH_CODE = "SH.ACS.MONY.Q1.ZS";
	final static String INFANT_MORTALITY_RATE_CODE = "SP.DYN.IMRT.IN";

	public static void main(String[] args) {

		// Example: Country = Canada, from 2000 to 2020
		String countryCode = "CAN";
		int startYear = 2000;
		int endYear = 2020;

		// Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)
		HashMap<Integer, Double> problemsAccessingHealth = justGetData(countryCode,
				PROBLEMS_ACCESSING_HEALTH_CODE, startYear, endYear);
		System.out.println("\nProblems in Accessing Health Care in Q1 as a % of Women in: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", problemsAccessingHealth.get(i)) + " %");
		}

		// Mortality rate, infant (per 1,000 live births)
		System.out.println("\n\n-----------------\n\n");
		HashMap<Integer, Double> infantMortalityRate = justGetData(countryCode,
				INFANT_MORTALITY_RATE_CODE, startYear, endYear);
		System.out.println("\nMortality Rates in Infants per 1,000 Births in: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.1f", infantMortalityRate.get(i)) + " infants");
		}

	}

	/**
	 * Returns a HashMap<Integer, Double> of the raw data since it's displayed as a 1-series graph
	 * For a year with an undefined value, we will keep the value = null.
	 */
	private static HashMap<Integer, Double> justGetData(String countryCode, String indicatorCode, int startYear, int endYear){
		HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, indicatorCode, startYear, endYear); // Data from fetch
		return rawData;
	}
}