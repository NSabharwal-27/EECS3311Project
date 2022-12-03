package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.junit.Test;

import analysis.Analysis_Type1;
import analysis.Analysis_Type2;
import analysis.Analysis_Type3;
import analysis.Analysis_Type4;
import analysis.Analysis_Type5;
import analysis.Analysis_Type6;
import analysis.Analysis_Type7;
import analysis.Analysis_Type8;
import chartFactory.FactoryChart;
import gui.AddButton;
import gui.ChartSampleA;
import gui.ErrorChart;
import gui.ErrorRecalc;
import gui.MainWindow;

public class TestGUI {

    
       // Main Window
       @Test
       public void testBasics()
       {
           MainWindow window = new MainWindow();
           assertEquals(window.getTitle(), "World Banker");
           assertEquals(window.getDefaultCloseOperation(), JFrame.EXIT_ON_CLOSE);
           assertFalse(window.isResizable());
           window.dispose();
       }
       
       //Chart Sample A Testing
       @Test
       public void testDetermineAnalysisType()
       {
           //Default Analysis Type
           MainWindow window = new MainWindow();
           ChartSampleA chartSample = ChartSampleA.getInstance();
           chartSample.getFields();
           assertEquals(Analysis_Type1.class, chartSample.getAnalysisObj().getClass());
           
           //Test Specific 
           MainWindow.setAnalysisType("Government Expenditure on Education vs Health Expenditure");
           chartSample.getFields();
           assertEquals(Analysis_Type8.class, chartSample.getAnalysisObj().getClass());
           window.dispose();
       }
       
      @Test
      public void testProcess() throws Exception
      {
          MainWindow window = MainWindow.getInstance();

          //Test Default Values in Main Window
          assertEquals("Brazil", MainWindow.getCountryCode());
          assertEquals(2005, MainWindow.getStartYear());
          assertEquals(2020, MainWindow.getEndYear());
          assertTrue(MainWindow.getRequestedChartTypes().isEmpty()); 
          assertEquals("Pie Chart", MainWindow.getCurrentChart());
          assertEquals("CO2 vs Energy vs Air Pollution", MainWindow.getAnalysisType());
          
          //Assert that ChartHolder currently contains the JLabel.
          assertEquals(JLabel.class, MainWindow.getChartHolder().getComponent(0).getClass());
           
          //Change View to Line Chart
          MainWindow.setAvailableViews(1);
          Thread.sleep(500);
          assertEquals("Line Chart", MainWindow.getCurrentChart());

          //Recalculate
          MainWindow.getRecalcBut().recalculate.doClick();
          Thread.sleep(500);

          //Add Chart
          MainWindow.getAddBut().addView.doClick();
          Thread.sleep(500);
          assertEquals(ChartPanel.class, MainWindow.getChartHolder().getComponent(0).getClass());
          Thread.sleep(500);
          
          //Change View to Bar Chart
          MainWindow.setAvailableViews(2);
          Thread.sleep(500);
          assertEquals("Bar Chart", MainWindow.getCurrentChart());
          
          //Add Chart
          MainWindow.getAddBut().addView.doClick();
          assertEquals(2,  MainWindow.getChartHolder().getComponentCount());
          assertEquals(ChartPanel.class, MainWindow.getChartHolder().getComponent(1).getClass());
          Thread.sleep(500);
          
          //Remove Bar Chart
          MainWindow.getRemBut().removeView.doClick();
          assertEquals(1,  MainWindow.getChartHolder().getComponentCount());

          //Remove Line Chart
          MainWindow.setAvailableViews(1);
          MainWindow.getRemBut().removeView.doClick();
          assertEquals(0,  MainWindow.getChartHolder().getComponentCount());
          
          window.dispose();
      }
       
       @Test
       public void testErrorRecalcCreation() throws Exception
       {
           MainWindow window = new MainWindow();
           Thread.sleep(500);
           MainWindow.getAddBut().addView.doClick();
           Thread.sleep(500);
           assertTrue(ErrorRecalc.isCreated());
           window.dispose();
       }
       
       @Test
       public void testErrorRecalc()
       {
           ErrorRecalc error = new ErrorRecalc();
           JPanel panel = (JPanel) error.getContentPane().getComponent(0);
           Component[] components = panel.getComponents();
           assertEquals(2, components.length);
           assertEquals(JLabel.class, components[0].getClass());
           assertEquals(JButton.class, components[1].getClass());
           
           JLabel label = (JLabel) components[0];
           assertEquals("You can't start adding charts without pressing recalculate. Please retry!", label.getText());
           JButton button = (JButton) components[1];
           assertEquals("Okay", button.getText());
           error.dispose();
       }
       
       @Test public void testErrorChart()
       {
           ErrorChart error = new ErrorChart();
           JPanel panel = (JPanel) error.getContentPane().getComponent(0);
           Component[] components = panel.getComponents();
           assertEquals(2, components.length);
           assertEquals(JLabel.class, components[0].getClass());
           assertEquals(JButton.class, components[1].getClass());
           
           JLabel label = (JLabel) components[0];
           assertEquals("The chart type chosen in incompatable with the analysis. Please retry!", label.getText());
           JButton button = (JButton) components[1];
           assertEquals("Okay", button.getText());
           error.dispose();
       }
       
       @Test
       public void testGetAnalysisObj()
       {
           ChartSampleA chartSample = new ChartSampleA();
           
           chartSample.title = "CO2 vs Energy vs Air Pollution";
           assertEquals(Analysis_Type1.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "Air Pollution vs Forest Area";
           assertEquals(Analysis_Type2.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "CO2 vs GDP per Capita";
           assertEquals(Analysis_Type3.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "Average Forest Area (% of Land Area)";
           assertEquals(Analysis_Type4.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "Average Government Expenditure on Education";
           assertEquals(Analysis_Type5.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "Current Health Expenditure vs Hospital Beds";
           assertEquals(Analysis_Type6.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "Problems in Accessing Health Care vs Infant Mortality";
           assertEquals(Analysis_Type7.class, chartSample.getAnalysisObj().getClass());
           
           chartSample.title = "Government Expenditure on Education vs Health Expenditure";
           assertEquals(Analysis_Type8.class, chartSample.getAnalysisObj().getClass());
       }       
}
