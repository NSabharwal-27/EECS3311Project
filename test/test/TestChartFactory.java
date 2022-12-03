package test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.jfree.chart.JFreeChart;
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
    }
}
