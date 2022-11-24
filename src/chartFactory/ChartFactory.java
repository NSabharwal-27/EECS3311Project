package chartFactory;

import java.util.HashMap;

import javax.swing.JLabel;

import org.jfree.chart.JFreeChart;

import fetchData.DataSet;

public abstract class ChartFactory {
    
    public abstract JFreeChart createChart(String title, HashMap<String, DataSet> analysis);
    public abstract JLabel createReport(String title, HashMap<String, DataSet> analysis);
    
    public void renderChart() {
        
    }

}
