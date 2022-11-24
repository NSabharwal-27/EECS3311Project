package chartFactory;

import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYSeries;

import fetchData.*;

public class BarChart implements Chart {
    
    public static CategoryDataset createDataset(HashMap<String, DataSet> analysis) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(Map.Entry<String, DataSet> entry : analysis.entrySet()) {
            DataSetIterator iterator = entry.getValue().getIterator();
            
            while(iterator.hasNext()) {
                Pair pair = iterator.next();
                dataset.addValue(pair.getValue(), entry.getKey(), Integer.toString(pair.getKey()));
            }
        }
        
        return dataset;
    }

}
