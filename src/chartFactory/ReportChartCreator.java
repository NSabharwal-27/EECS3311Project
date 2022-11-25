package chartFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import org.jfree.chart.ChartFactory;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class ReportChartCreator {
    
    public static HashMap<Integer, ArrayList<String>> createDataset(HashMap<String, DataSet> analysis) {
        HashMap<Integer, ArrayList<String>> dataset =  new HashMap<>();
        
        for(Map.Entry<String, DataSet> entry : analysis.entrySet()) {
            DataSetIterator iterator = entry.getValue().getIterator();
            
            while(iterator.hasNext()) {
                Pair pair = iterator.next();
                ArrayList<String> details = new ArrayList<>();
                details.add(entry.getKey());
                details.add(Double.toString(pair.getValue()));
                
                dataset.put(pair.getKey(), details);
            }
        }
        
        return dataset;
    }

    public static JLabel createChart(String title, HashMap<String, DataSet> analysis) {
        HashMap<Integer, ArrayList<String>> dataset = createDataset(analysis);
        
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
