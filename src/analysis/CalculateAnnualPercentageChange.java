package analysis;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.FetchData;
import fetchData.Pair;

public class CalculateAnnualPercentageChange {

    public static DataSet calculate(DataSet rawData)
    {
        DataSet percentages = new DataSet(); // For the calculated annual percent change
        Double[] lastYearWithData = new Double[2]; //Keeps track of the last year with a recorded value.
        Double percentageChange;

        // Set the lastYearWithData with a previous year to be able to calculate the start year percentage
        // Fetches the value of the previous year and loads it into lastYearWithData if  != null
        // otherwise loops through the past 20 years to get till it find a year with a non-null value 
        DataSet preStartingYear = FetchData.fetchData(rawData.countryCode, rawData.indicator, rawData.startYear-20, rawData.startYear-1);
        int i = 1;
        while(preStartingYear.get(rawData.startYear-i) == null)
        {
            if( i > 20)
                break;
            i++;
        }

        lastYearWithData[0] = (double) rawData.startYear-i;
        lastYearWithData[1] = preStartingYear.get(rawData.startYear-i);

        DataSetIterator iterator = rawData.getIterator();
        // For all years starting from startYear
        while(iterator.hasNext())
        {
            Pair currentYear = iterator.next();
            int year = currentYear.getKey();
            
            if(currentYear.getValue() != null)
            {
                int yearsSince = year - lastYearWithData[0].intValue(); // Most likely 1, but multiple years may have
                                                                        // passed since there was a recorded value.
                Double previousVal = lastYearWithData[1]; // Most likely the year prior, but may be a couple years prior.
                if (previousVal == null) // No previous value to compare change against.(only to check against the first year)
                    percentageChange = null;
                else
                    percentageChange = 100.0 * ((currentYear.getValue() - previousVal) / previousVal) / yearsSince;

                // Keep track of year as latest year with a recorded value
                lastYearWithData[0] = (double) year;
                lastYearWithData[1] = currentYear.getValue();
            } else {
                percentageChange = null; // No value for current year
            }
            percentages.put(year, percentageChange);
        }
        return percentages;  
    }
}
