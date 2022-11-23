package chartFactory;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.PlotOrientation;

public class ScatterChart implements Chart {
    
    private static XYSeriesCollection createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries series1 = new XYSeries("Boys");
        series1.add(10, 35);
        series1.add(11, 37);
        series1.add(12, 41);
        series1.add(12, 39);
        series1.add(13, 44);
        series1.add(14, 51);
        series1.add(15, 52);
        series1.add(15, 54);
        series1.add(16, 57);
        series1.add(17, 62);
        series1.add(17, 66);
        series1.add(18, 70);
        dataset.addSeries(series1);
        
        return dataset;
        
    }
    
    public static JFreeChart createChart() {
        XYSeriesCollection dataset = createDataset();
        
        JFreeChart scatterPlot = ChartFactory.createScatterPlot(
                "JFreeChart Scatter Plot", //Chart title
                "Age", // X-Axis Label
                "Weight", // Y-Axis Label
                dataset
                );
        
        return scatterPlot;
    }

}
