package chartFactory;

import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYSeries;

import fetchData.DataSet;
import fetchData.DataSetIterator;
import fetchData.Pair;

public class PieChartCreator extends ChartCreator  {    

    public PieDataset<String> createDataset(HashMap<String, DataSet> analysis) {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<String>();
        
        for(Map.Entry<String, DataSet> entry : analysis.entrySet()) {
            XYSeries series = new XYSeries(entry.getKey());
            DataSetIterator iterator = entry.getValue().getIterator();
            
            while(iterator.hasNext()) {
                Pair pair = iterator.next();
                dataset.setValue(Integer.toString(pair.getKey()), pair.getValue());
            }
        }        
        
        return dataset;
    }
    
    public JFreeChart createChart(String title, String yLabel, HashMap<String, DataSet> analysis) {
        PieDataset<String> dataset = createDataset(analysis);
        JFreeChart chart = ChartFactory.createPieChart( //NOTE: ChartFactory here refers to a Factory supplied with JFreeChart
            title, // chart title
            dataset, // data
            true, // include legend
            true,
            false);
        return chart;
    }
}
