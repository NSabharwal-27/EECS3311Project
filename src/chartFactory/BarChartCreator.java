package chartFactory;

import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

import fetchData.DataSet;

public class BarChartCreator extends ChartFactory {

    public static JFreeChart createChart(String title, HashMap<String, DataSet> analysis) {
        CategoryDataset dataset = BarChart.createDataset(analysis);
        JFreeChart barChart = ChartFactory.createBarChart(
                title, //Chart title
                "", // X-Axis Label
                "", // Y-Axis Label
                dataset,       
                PlotOrientation.VERTICAL,           
                true, true, false);
        return barChart;
    }
    
}
