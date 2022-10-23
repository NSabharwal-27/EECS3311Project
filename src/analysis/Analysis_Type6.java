package analysis;

import java.util.HashMap;
import fetchData.FetchData;

// 1 Series Graph
// The ratio
// 		1. Current health expenditure per capita (per 1,000 people) (current US$)
//		2. Hospital beds (per 1,000 people)

public class Analysis_Type6 {

	final static String HEALTH_EXPENDITURE_CODE = "SH.XPD.CHEX.PC.CD";
	final static String HOSPITAL_BEDS_CODE = "SH.MED.BEDS.ZS";

	public static void main(String[] args) {

		// Example: Country = Canada, from 2000 to 2020
		String countryCode = "CAN";
		int startYear = 2000;
		int endYear = 2020;

		// Current health expenditure (per 1,000 people) (% of GDP)
		HashMap<Integer, Double> CurrentHealthExpenditureRatio = calculateRatio(countryCode, HEALTH_EXPENDITURE_CODE, startYear, endYear);
		System.out.println("\nRatio of Current Health Expenditure per 1,000 People in: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", CurrentHealthExpenditureRatio.get(i)) + " %");
		}

		// Hospital beds (per 1,000 people)
		System.out.println("\n\n-----------------\n\n");
		HashMap<Integer, Double> HospitalBedsRatio = calculateRatio(countryCode, HOSPITAL_BEDS_CODE, startYear, endYear);
		System.out.println("\nRatio of Hospital Beds per 1,000 People in: " + countryCode + "\n----------------------");
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ": " + String.format("%.6f", HospitalBedsRatio.get(i)) + " %");
		}

	}

	/**
	 * Returns a HashMap<Integer, Double> of the calculated ratio per a 1,000 people 
	 * in form (year, ratio). For a year with an undefined value, ratio = null.
	 */
	private static HashMap<Integer, Double> calculateRatio(String countryCode, String indicatorCode,
			int startYear, int endYear) {

		HashMap<Integer, Double> rawData = FetchData.fetchData(countryCode, indicatorCode, startYear, endYear); // Data from fetch
		HashMap<Integer, Double> ratio = new HashMap<Integer, Double>(); // For the calculated ratio of 
		
		// if the code is for the Hospital beds (per 1,000 people) then the ratio is the raw data
		// otherwise we take the Current health expenditure per capita value each year 
		// and multiply it by a 1000 to get the ratio
		if (indicatorCode.equals("SH.MED.BEDS.ZS")){
			ratio = rawData;
		} else{
			for (int i = startYear; i <= endYear ; i++){
				if (rawData.get(i) == null){
					ratio.put(i, null);
				}else{
					ratio.put(i, rawData.get(i)*1000);
				}
			}
		}

		return ratio;
	}

}
