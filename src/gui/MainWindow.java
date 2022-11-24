package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import analysis.AnalysisStrategy;
import analysis.Analysis_Type1;
import chartFactory.*;

public class MainWindow extends JFrame{

    static String[] analysisTypes = {
            "CO2 vs Energy vs Air Pollution",
            "Air Pollution vs Forest Area",
            "CO2 vs GDP per Capita",
            "Average Forest Area (% of Land Area)",
            "Average Government Expenditure on Education",
            "Current Health Expenditure vs Hospital Beds",
            "Problems in Accessing Health Care vs Infant Mortality",
            "Government Expenditure on Education vs Health Expenditure"
    };

    static Color lightGrey = new Color(220, 220, 220);
    static String[] views = { "Pie Chart", "Line Chart", "Bar Chart", "Scatter Chart", "Report" };
    static String[] countryOptions = { "Brazil", "Canada", "China", "France", "USA" };

    static ArrayList<String> requestedChartTypes = new ArrayList<String>();
    
    static JComboBox<String> countryComboBox;
    static JComboBox<Integer> startYearComboBox;
    static JComboBox<Integer> endYearComboBox;
    static JComboBox<String> availableViews;
    static JComboBox<String> analysisMethod;
    
    public MainWindow() {

        Container pane = this.getContentPane();

        // Top Row
        addTopBar(pane);

        // ChartHolder
        displayCharts(pane);

        // Bottom Row
        addBottomBar(pane);

        this.setTitle("World Banker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void addTopBar(Container pane) {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // JLabels
        JLabel countryLabel = new JLabel("Choose a country: ");
        JLabel fromLabel = new JLabel("From");
        JLabel toLabel = new JLabel("To");

        // ComboBoxes
        countryComboBox = new JComboBox<String>(countryOptions);
        startYearComboBox = new JComboBox<Integer>();
        endYearComboBox = new JComboBox<Integer>();
        
        for (int i = 1950; i <= 2022; i++) {
            startYearComboBox.addItem(i);
            endYearComboBox.addItem(i);
        }

        // Set defaults
        startYearComboBox.setSelectedItem((Integer) 2005);
        endYearComboBox.setSelectedItem((Integer) 2020);

        // Remove Focusable
        countryComboBox.setFocusable(false);
        startYearComboBox.setFocusable(false);
        endYearComboBox.setFocusable(false);

        // Add Components to Panel
        topPanel.add(countryLabel);
        topPanel.add(countryComboBox);
        topPanel.add(fromLabel);
        topPanel.add(startYearComboBox);
        topPanel.add(toLabel);
        topPanel.add(endYearComboBox);

        // Set Colour and Add to Pane
        topPanel.setOpaque(true);
        topPanel.setBackground(lightGrey);
        pane.add(topPanel, BorderLayout.PAGE_START);
    }

    // TODO - Sample for displaying charts (Displays 5 Pie Charts)
    // TODO - Will need to be modified to use ChartFactory
    private void displayCharts(Container pane) {

        //NOTE: Add JFreeChart to ChartPanel -> Add ChartPanel to ChartHolder

        JPanel chartHolder = new JPanel(new GridLayout(2, 3));
        chartHolder.setPreferredSize(new Dimension(900, 500));
        
        // Steeve: creating the object Strategy <-- DELETE AND COMMIT IF WE'RE KEEPING THIS
        AnalysisStrategy strategy = new Analysis_Type1();

        JFreeChart chartSample = PieChart.createChart("Average Forest Area (% of Land Area)", strategy.analysisExecute(2005, 2020, "CAN"));
        JFreeChart chartSampleB = BarChart.createChart("CO2 vs Energy vs Air Pollution", strategy.analysisExecute(2005, 2020, "CAN"));
        JFreeChart chartSampleC = LineChart.createChart();
        JFreeChart chartSampleD = SeriesChart.createChart();
        JFreeChart chartSampleE = ScatterChart.createChart("CO2 vs Energy vs Air Pollution", strategy.analysisExecute(2005, 2020, "CAN"));
        

        ChartPanel chartPanelSample = new ChartPanel(chartSample);
        ChartPanel chartPanelSampleB = new ChartPanel(chartSampleB);
        ChartPanel chartPanelSampleC = new ChartPanel(chartSampleC);
        ChartPanel chartPanelSampleD = new ChartPanel(chartSampleD);
        ChartPanel chartPanelSampleE = new ChartPanel(chartSampleE);

        chartHolder.add(chartPanelSample);
        chartHolder.add(chartPanelSampleB);
        chartHolder.add(chartPanelSampleC);
        chartHolder.add(chartPanelSampleD);
        chartHolder.add(chartPanelSampleE);

        JLabel textDescription = new JLabel("Text Description Here");
        textDescription.setHorizontalAlignment(JLabel.CENTER);
        chartHolder.add(textDescription);

        pane.add(chartHolder, BorderLayout.CENTER);
    }

    private void addBottomBar(Container pane) {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // JLabels
        JLabel viewsLabel = new JLabel("Available Views: ");
        JLabel analysisLabel = new JLabel("Choose Analysis Method: ");

        // ComboBoxes
        availableViews = new JComboBox<String>(views);
        analysisMethod = new JComboBox<String>(analysisTypes);
        // TODO - If we want center aligned text
        // ((JLabel)analysisMethod.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        availableViews.setFocusable(false);
        analysisMethod.setFocusable(false);

        // Buttons
        RecalcButton recalcBut = new RecalcButton();
        AddButton addBut = new AddButton();
        RemoveButton remBut = new RemoveButton();

        // Add Components to Panel
        bottomPanel.add(viewsLabel);
        bottomPanel.add(availableViews);
        bottomPanel.add(addBut.addView);
        bottomPanel.add(remBut.removeView);
        bottomPanel.add(analysisLabel);
        bottomPanel.add(analysisMethod);
        bottomPanel.add(recalcBut.recalculate);

        bottomPanel.setOpaque(true);
        bottomPanel.setBackground(lightGrey);
        pane.add(bottomPanel, BorderLayout.PAGE_END);
    }

    public static String getCountryCode()
    {
        return countryComboBox.getSelectedItem().toString();
    }
    
    public static String getStartYear()
    {
        return startYearComboBox.getSelectedItem().toString();
    }
    
    public static String getEndYear()
    {
        return endYearComboBox.getSelectedItem().toString();
    }
    
    public static ArrayList<String> getRequestedChartTypes()
    {
        return requestedChartTypes;
    }
    
    public static String getAnalysisType()
    {
        return analysisMethod.getSelectedItem().toString();
    }
}


