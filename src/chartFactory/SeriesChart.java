package chartFactory;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.awt.BasicStroke; 

import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class SeriesChart implements Chart {
    
    public static XYDataset createDataset(HashMap<String, DataSet> analysis) {
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
    
}
