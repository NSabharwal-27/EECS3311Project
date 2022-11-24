package analysis;

import java.util.HashMap;

import fetchData.DataSet;
import fetchData.FetchData;

// 2 Series Graph
// 		1. Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)
//		2. Mortality rate, infant (per 1,000 live births)
// Here we only need to return the raw data with no analysis

public class Analysis_Type7 implements AnalysisStrategy{

    final static String PROBLEMS_ACCESSING_HEALTH_CODE = "SH.ACS.MONY.Q1.ZS";
    final static String INFANT_MORTALITY_RATE_CODE = "SP.DYN.IMRT.IN";

    public HashMap<String, DataSet> analysisExecute(int start, int end, String country) {

        // Example: Country = Canada, from 2000 to 2020
        String countryCode = country;
        int startYear = start;
        int endYear = end;
        
        HashMap<String, DataSet> data = new HashMap<String, DataSet>();

        // Problems in accessing health care (getting money for treatment) (% of women):
        // Q1 (lowest wealth)
        DataSet problemsAccessingHealth = calculateProblemsAccessingHealthCare(countryCode, startYear, endYear);
        //System.out.println("\nProblems in Accessing Health Care in Q1 as a % of Women in: " + countryCode + "\n----------------------");
        //System.out.println(problemsAccessingHealth);

        // Mortality rate, infant (per 1,000 live births)
       // System.out.println("\n\n-----------------\n\n");
        DataSet infantMortalityRate = calculateInfantMortalityRate(countryCode, startYear, endYear);
        //System.out.println("\nMortality Rates in Infants per 1,000 Births in: " + countryCode + "\n----------------------");
        //System.out.println(infantMortalityRate);
        
        data.put("Problems Accessing Healthcare", problemsAccessingHealth);
        data.put("Infant Mortality Rate", infantMortalityRate);
        
        return data;
    }

    private static DataSet calculateProblemsAccessingHealthCare(String countryCode, int startYear, int endYear) {
        return FetchData.fetchData(countryCode, PROBLEMS_ACCESSING_HEALTH_CODE, startYear, endYear); // Data from fetch
    }

    private static DataSet calculateInfantMortalityRate(String countryCode, int startYear, int endYear) {
        return FetchData.fetchData(countryCode, INFANT_MORTALITY_RATE_CODE, startYear, endYear); // Data from fetch
    }
}