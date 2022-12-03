package analysis;

import java.util.HashMap;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.FetchData;
import fetchData.Pair;

// 1 Series Graph
// The ratio
// 		1. Current health expenditure per capita (per 1,000 people) (current US$)
//		2. Hospital beds (per 1,000 people)

public class Analysis_Type6 implements AnalysisStrategy{

	final static String HEALTH_EXPENDITURE_CODE = "SH.XPD.CHEX.PC.CD"; 
	final static String HOSPITAL_BEDS_CODE = "SH.MED.BEDS.ZS";
	final static String POPULATION_CODE = "SP.POP.TOTL";

	public HashMap<String, DataSet> analysisExecute(int start, int end, String country){

		// Example: Country = Canada, from 2000 to 2020
		String countryCode = country;
		int startYear = start;
		int endYear = end;
		
		 HashMap<String, DataSet> data = new HashMap<String, DataSet>();
		
		// Current health expenditure (per 1,000 people) ()
		DataSet ratioHealthExpToBeds = calculateRatioHealthExpenditureToBeds(countryCode, startYear, endYear);
		//System.out.println(ratioHealthExpToBeds);
		
		data.put("Ratio of Health Expenditure to Hospital Beds", ratioHealthExpToBeds);
		return data;
	}

	/**
	 * Returns a HashMap<Integer, Double> of the calculated ratio per a 1,000 people 
	 * in form (year, ratio). For a year with an undefined value, ratio = null.
	 */
	private static DataSet calculateRatioHealthExpenditureToBeds(String countryCode, int startYear, int endYear) {

	    DataSet rawDataBedsPer1000 = FetchData.fetchData(countryCode, HOSPITAL_BEDS_CODE, startYear, endYear);

		DataSet rawDataHealthExpenditure = FetchData.fetchData(countryCode, HEALTH_EXPENDITURE_CODE, startYear, endYear); // Data from fetch
		DataSet population = FetchData.fetchData(countryCode, POPULATION_CODE, startYear, endYear);
		DataSet healthExpenditurePer1000 = new DataSet();
		
		DataSet ratio; // For the calculated ratio of 
		
		//Use population to find health expenditure *per 1000 people*
		DataSetIterator iterator = rawDataHealthExpenditure.getIterator();
		while(iterator.hasNext())
		{
		    Pair current = iterator.next();
		    
		    Double healthExp = current.getValue();
		    Double pop = population.get(current.getKey());
		    if (healthExp == null | pop == null)
		    {
	              healthExpenditurePer1000.put(current.getKey(), null);
		    }
		    else
		    {
		        double per1000Value = (healthExp / pop) * 1000; 
	            healthExpenditurePer1000.put(current.getKey(), per1000Value);
		    }
		}
		
		ratio = CalculateRatio.calculate(rawDataBedsPer1000, healthExpenditurePer1000);
		return ratio;
	}
}
