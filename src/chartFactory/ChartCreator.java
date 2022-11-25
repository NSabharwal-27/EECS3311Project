package chartFactory;

import java.util.HashMap;

import org.jfree.chart.JFreeChart;

import fetchData.DataSet;

public abstract class ChartCreator {
    public abstract Object createDataset(HashMap<String, DataSet> analysis);
    public abstract JFreeChart createChart(String title, String yLabel, HashMap<String, DataSet> analysis);
}
