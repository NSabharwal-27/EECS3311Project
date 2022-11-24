package chartFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYSeries;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class ReportChart implements Chart {
    
    public static HashMap<Integer, ArrayList<String>> createDataset(HashMap<String, DataSet> analysis) {
        HashMap<Integer, ArrayList<String>> dataset =  new HashMap<>();
        
        for(Map.Entry<String, DataSet> entry : analysis.entrySet()) {
            DataSetIterator iterator = entry.getValue().getIterator();
            
            while(iterator.hasNext()) {
                Pair pair = iterator.next();
                ArrayList<String> details = new ArrayList<>();
                details.add(entry.getKey());
                details.add(Double.toString(pair.getValue()));
                
                dataset.put(pair.getKey(), details);
            }
        }
        
        return dataset;
    }

}
