package chartFactory;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart implements Chart {
    
    private static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue( 15 , "schools" , "1970" );
        dataset.addValue( 30 , "schools" , "1980" );
        dataset.addValue( 60 , "schools" ,  "1990" );
        dataset.addValue( 120 , "schools" , "2000" );
        dataset.addValue( 240 , "schools" , "2010" );
        dataset.addValue( 300 , "schools" , "2014" );
        return dataset;
     }
    
    public static JFreeChart createChart() {
        DefaultCategoryDataset dataset = createDataset();
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Schools Vs Years","Year",
                "Schools Count",
                dataset,
                PlotOrientation.VERTICAL,
                true,true,false);
    
        return lineChart;
    }

}
