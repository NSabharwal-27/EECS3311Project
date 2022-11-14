package analysis;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class CalculateAverage {

    public static Double calculate(DataSet rawData)
    {
        double total = 0;
        int actualYearCount = 0;
        
        DataSetIterator iterator = rawData.getIterator();
        while(iterator.hasNext())
        {
            Pair currentYear = iterator.next();
            if (currentYear.getValue() != null) {
                total += currentYear.getValue();
                actualYearCount++;
            }
        }
        
        double average = total/actualYearCount;
        return average;
    }
}
