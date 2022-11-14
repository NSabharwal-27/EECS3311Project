package analysis;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class CalculateRatio {

    public static DataSet calculate(DataSet a, DataSet b)
    {
        DataSet ratio = new DataSet();
        DataSetIterator iterator = a.getIterator();
        while(iterator.hasNext())
        {
            Pair current = iterator.next();
            Double valueA = current.getValue();
            Double valueB = b.get(current.getKey());
            if (valueA == null | valueB == null)
            {
                ratio.put(current.getKey(), null);
            }
            else
            {
                ratio.put(current.getKey(), valueA/valueB);
            }
        }
        return ratio;
    }
}
