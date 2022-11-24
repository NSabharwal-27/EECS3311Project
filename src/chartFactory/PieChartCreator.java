package chartFactory;

import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.PieDataset;

import fetchData.DataSet;

public class PieChartCreator extends ChartFactory  {    
    
    public static JFreeChart createChart(String title, HashMap<String, DataSet> analysis) {
        
        PieDataset<String> dataset = PieChart.createDataset(analysis);
        JFreeChart chart = ChartFactory.createPieChart( //NOTE: ChartFactory here refers to a Factory supplied with JFreeChart
                title, // chart title
                dataset, // data
                true, // include legend
                true,
                false);
        return chart;
    }
}
