package test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.Test;

import analysis.Analysis_Type2;
import analysis.Analysis_Type3;
import analysis.Analysis_Type4;
import analysis.Context;
import chartFactory.FactoryChart;
import fetchData.DataSet;

public class TestChartFactory {

    
    @Test
    public void testLineChart()
    {
        String analysis = "CO2 vs Energy vs Air Pollution";
        String chartType = "Line Chart";

        Context context = new Context(new Analysis_Type2());
        HashMap<String, DataSet> hash = context.callExecute(2000, 2005, chartType);
        
        FactoryChart factory = new FactoryChart();
        JFreeChart chart = factory.getChart(chartType, analysis, hash);
        assertEquals(analysis, chart.getTitle().getText());
        XYPlot plot = (XYPlot) chart.getPlot();
        XYDataset data = plot.getDataset();
        
        assertEquals(2, data.getSeriesCount()); // 2 series
        assertEquals(6, data.getItemCount(0));  // 6 years
        
        //Test specific point
        assertEquals(2000.0, data.getX(0, 0));
        assertEquals(-0.956, data.getY(0, 0).doubleValue(), 0.01);
    }
    
    @Test  
    public void testBarChart()
    {
        String analysis = "Air Pollution vs Forest Area";
        String chartType = "Bar Chart";

        Context context = new Context(new Analysis_Type2());
        HashMap<String, DataSet> hash = context.callExecute(2000, 2005, chartType);
        
        FactoryChart factory = new FactoryChart();
        JFreeChart chart = factory.getChart(chartType, analysis, hash);
        assertEquals(analysis, chart.getTitle().getText());
        
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryDataset data = plot.getDataset();
        
        assertEquals(6, data.getColumnCount()); // 6 Years
        assertEquals(2, data.getRowCount());    // 2 Series
    }
    
    @Test
    public void testScatterPlot()
    {
        String analysis = "CO2 vs GDP per Capita";
        String chartType = "Scatter Chart";

        Context context = new Context(new Analysis_Type3());
        HashMap<String, DataSet> hash = context.callExecute(2000, 2005, chartType);
        
        FactoryChart factory = new FactoryChart();
        JFreeChart chart = factory.getChart(chartType, analysis, hash);
        assertEquals(analysis, chart.getTitle().getText());
        XYPlot plot = (XYPlot) chart.getPlot();
        XYDataset data = plot.getDataset();
        
        assertEquals(1, data.getSeriesCount()); // Single series
        assertEquals(6, data.getItemCount(0));  // 6 years
        
        //Test specific point
        assertEquals(2000.0, data.getX(0, 0));
        assertEquals(419.269, data.getY(0, 0).doubleValue(), 0.01);
    }
    
    @Test
    public void testPieChart()
    {
        String analysis = "Average Forest Area (% of Land Area)";
        String chartType = "Pie Chart";

        Context context = new Context(new Analysis_Type4());
        HashMap<String, DataSet> hash = context.callExecute(2000, 2005, chartType);
        
        FactoryChart factory = new FactoryChart();
        JFreeChart chart = factory.getChart(chartType, analysis, hash);
        assertEquals(analysis, chart.getTitle().getText());
        
        PiePlot plot = (PiePlot) chart.getPlot();
        PieDataset data = plot.getDataset();
        assertEquals(2, data.getItemCount());
        
        assertEquals("Forest Land Area", data.getKey(0));
        assertEquals(29.05, data.getValue(0).doubleValue(), 0.01);
        
        assertEquals("Non-Forest Land Area", data.getKey(1));
        assertEquals(70.95, data.getValue(1).doubleValue(), 0.01);

        //Verify percents add to 100
        assertEquals(100, data.getValue(0).doubleValue() + data.getValue(1).doubleValue(), 0.1);
    }

}
