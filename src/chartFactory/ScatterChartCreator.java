package chartFactory;

import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;

import fetchData.DataSet;

public class ScatterChartCreator extends ChartFactory {
    
    public static JFreeChart createChart(String title, HashMap<String, DataSet> analysis) {
        XYSeriesCollection dataset = ScatterChart.createDataset(analysis);
        
        JFreeChart scatterPlot = ChartFactory.createScatterPlot(
                title, //Chart title
                "", // X-Axis Label
                "", // Y-Axis Label
                dataset
                );
        
        return scatterPlot;
    }
    
}
