package chartFactory;

import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;

import fetchData.DataSet;

public class SeriesChartCreator extends ChartFactory {

    public static JFreeChart createChart(HashMap<String, DataSet> analysis) {
        XYDataset dataset = SeriesChart.createDataset(analysis);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Browser usage statastics", 
                "Category",
                "Score", 
                dataset,
                PlotOrientation.VERTICAL, 
                true, true, false);
        
        return xylineChart;
    }  
    
}
