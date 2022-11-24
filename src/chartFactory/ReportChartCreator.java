package chartFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import org.jfree.chart.ChartFactory;

import fetchData.DataSet;

public class ReportChartCreator extends ChartFactory {
    
    public static JLabel createChart(String title, HashMap<String, DataSet> analysis) {
        HashMap<Integer, ArrayList<String>> dataset = ReportChart.createDataset(analysis);
        
        JLabel label = new JLabel();     
        String report = new String();
        
        report.concat(title + "\n");
        report.concat("================================" + "\n");
        
        for (Map.Entry<Integer, ArrayList<String>> entry : dataset.entrySet()) {
            report.concat("Year " + entry.getKey() + "\n");
            report.concat("\t" + entry.getValue().get(0) + "=>" + entry.getValue().get(1) + "\n");
        }
        
        label.setText(report);
        
        return label;
    }

}
