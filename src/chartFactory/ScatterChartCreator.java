package chartFactory;

import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class ScatterChartCreator extends ChartCreator {

    public XYSeriesCollection createDataset(HashMap<String, DataSet> analysis) {
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
    
    public JFreeChart createChart(String title, String yLabel, HashMap<String, DataSet> analysis) {
        XYSeriesCollection dataset = createDataset(analysis);
        JFreeChart scatterPlot = ChartFactory.createScatterPlot(
            title, //Chart title
            "Years", // X-Axis Label
            yLabel, // Y-Axis Label
            dataset);
        
        return scatterPlot;
    }
    
}
