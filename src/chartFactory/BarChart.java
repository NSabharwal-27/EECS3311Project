package chartFactory;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;

public class BarChart implements Chart {
    
    public static CategoryDataset createDataset(){
        final String fiat = "FIAT";        
        final String audi = "AUDI";        
        final String ford = "FORD";        
        final String speed = "Speed";        
        final String millage = "Millage";        
        final String userrating = "User Rating";        
        final String safety = "safety";        
        final DefaultCategoryDataset dataset = 
        new DefaultCategoryDataset( );  

        dataset.addValue(1.0, fiat, speed);        
        dataset.addValue(3.0, fiat, userrating);        
        dataset.addValue(5.0, fiat, millage); 
        dataset.addValue(5.0, fiat, safety);           

        dataset.addValue(5.0, audi, speed);        
        dataset.addValue(6.0, audi, userrating);       
        dataset.addValue(10.0, audi, millage);        
        dataset.addValue(4.0, audi, safety);

        dataset.addValue(4.0, ford, speed);        
        dataset.addValue(2.0 , ford, userrating);        
        dataset.addValue(3.0 , ford, millage);        
        dataset.addValue(6.0, ford, safety);               

        return dataset; 
    }
    
    public static JFreeChart createChart() {
        CategoryDataset dataset = createDataset();
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Chart Mobile Sales",           
                "Category",            
                "Score",            
                dataset,          
                PlotOrientation.VERTICAL,           
                true, true, false);
        return barChart;
    }

}
