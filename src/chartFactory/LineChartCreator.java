package chartFactory;

import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import fetchData.DataSet;

public class LineChartCreator extends ChartFactory {
    
    public static JFreeChart createChart(String title, HashMap<String, DataSet> analysis) {
        DefaultCategoryDataset dataset = LineChart.createDataset(analysis);
        JFreeChart lineChart = ChartFactory.createLineChart(
                title,
                "",
                "",
                dataset,
                PlotOrientation.VERTICAL,
                true,true,false);
    
        return lineChart;
    }

}
