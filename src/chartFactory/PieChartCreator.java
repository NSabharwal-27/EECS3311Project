package chartFactory;

import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import fetchData.DataSet;

public class PieChartCreator extends ChartCreator  { 
    String label1;
    String label2; 

    public PieDataset createDataset(HashMap<String, DataSet> analysis) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        for(String entry : analysis.keySet()) {
            double value = analysis.get(entry).get(0);
            dataset.setValue(label1, value);
            dataset.setValue(label2, 100 - value);
        }        
        
        return dataset;
    }
    
    public JFreeChart createChart(String title, String yLabel, HashMap<String, DataSet> analysis) {
        if(title.equals("Average Forest Area (% of Land Area)")){
            label1 = "Forest Land Area";
            label2 = "Non-Forest Land Area";
        }else{
            label1 = "Government Expenditure on Education";
            label2 = "Other Government Expenditure";
        }

        PieDataset dataset = createDataset(analysis);

        JFreeChart chart = ChartFactory.createPieChart( //NOTE: ChartFactory here refers to a Factory supplied with JFreeChart
            title, // chart title
            dataset, // data
            true, // include legend
            true,
            false);
        return chart;
    }
}
