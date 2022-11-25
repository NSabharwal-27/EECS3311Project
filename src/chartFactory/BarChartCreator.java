package chartFactory;

import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class BarChartCreator extends ChartCreator {

    public CategoryDataset createDataset(HashMap<String, DataSet> analysis) {
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

    public JFreeChart createChart(String title, String yLabel, HashMap<String, DataSet> analysis) {
        CategoryDataset dataset = createDataset(analysis);
        JFreeChart barChart = ChartFactory.createBarChart(
            title, //Chart title
            "Years", // X-Axis Label
            yLabel, // Y-Axis Label
            dataset,       
            PlotOrientation.VERTICAL,           
            true, true, false);
        return barChart;
    }
    
}
