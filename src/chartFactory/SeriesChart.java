package chartFactory;

import java.awt.Color; 
import java.awt.BasicStroke; 

import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class SeriesChart implements Chart {
    
    private static XYDataset createDataset() {
        XYSeries firefox = new XYSeries("Firefox");          
        firefox.add(1.0 , 1.0);          
        firefox.add(2.0 , 4.0);          
        firefox.add(3.0 , 3.0);          
        
        XYSeries chrome = new XYSeries("Chrome");          
        chrome.add(1.0 , 4.0);          
        chrome.add(2.0 , 5.0);          
        chrome.add(3.0 , 6.0);          
        
        XYSeries iexplorer = new XYSeries("InternetExplorer");          
        iexplorer.add(3.0 , 4.0);          
        iexplorer.add(4.0 , 5.0);          
        iexplorer.add(5.0 , 4.0);          
        
        XYSeriesCollection dataset = new XYSeriesCollection();          
        dataset.addSeries(firefox);          
        dataset.addSeries(chrome);          
        dataset.addSeries(iexplorer);
        
        return dataset;
    }
    
    public static JFreeChart createChart() {
        XYDataset dataset = createDataset();
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Browser usage statastics", 
                "Category",
                "Score", 
                dataset,
                PlotOrientation.VERTICAL, 
                true, true, false);
        
        return xylineChart;
    }  
    
}
