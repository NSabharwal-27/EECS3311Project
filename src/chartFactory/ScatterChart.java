package chartFactory;

import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

import org.jfree.chart.plot.PlotOrientation;

public class ScatterChart implements Chart {
    
    private static XYSeriesCollection createDataset(HashMap<String, DataSet> analysis) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        for(Map.Entry<String, DataSet> entry : analysis.entrySet()) {
            XYSeries series = new XYSeries(entry.getKey());
            DataSetIterator iterator = entry.getValue().getIterator();
            
            while(iterator.hasNext()) {
                Pair pair = iterator.next();
                series.add(pair.getKey(), pair.getValue());
            }
            
            dataset.addSeries(series);
        }
        
        return dataset;
    }
    
    public static JFreeChart createChart(String title, HashMap<String, DataSet> analysis) {
        XYSeriesCollection dataset = createDataset(analysis);
        
        JFreeChart scatterPlot = ChartFactory.createScatterPlot(
                title, //Chart title
                "", // X-Axis Label
                "", // Y-Axis Label
                dataset
                );
        
        return scatterPlot;
    }

}
