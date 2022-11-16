package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import chartFactory.PieChart;

public class MainWindow extends JFrame implements ActionListener {

    String[] analysisTypes = {
            "1. CO2 vs Energy vs Air Pollution",
            "2. Air Pollution vs Forest Area",
            "3. CO2 vs GDP per Capita",
            "4. Average Forest Area (% of Land Area)",
            "5. Average Government Expenditure on Education",
            "6. Current Health Expenditure vs Hospital Beds",
            "7. Problems in Accessing Health Care vs Infant Mortality",
            "8. Government Expenditure on Education vs Health Expenditure"
    };

    Color lightGrey = new Color(220, 220, 220);
    String[] views = { "Pie Chart", "Line Chart", "Bar Chart", "Scatter Chart", "Report" };
    String[] countryOptions = { "Brazil", "Canada", "China", "France", "USA" };

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
        JComboBox<String> countryComboBox = new JComboBox<String>(countryOptions);

        JComboBox<Integer> startYearComboBox = new JComboBox<Integer>();
        JComboBox<Integer> endYearComboBox = new JComboBox<Integer>();
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

        JFreeChart chartSample = PieChart.createChart(20, 20, 20, 40);
        JFreeChart chartSampleB = PieChart.createChart(15, 15, 30, 40);
        JFreeChart chartSampleC = PieChart.createChart(30, 30, 30, 10);
        JFreeChart chartSampleD = PieChart.createChart(25, 25, 25, 25);
        JFreeChart chartSampleE = PieChart.createChart(70, 15, 10, 5);

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
        JComboBox<String> availableViews = new JComboBox<String>(views);
        JComboBox<String> analysisMethod = new JComboBox<String>(analysisTypes);
        // TODO - If we want center aligned text
        // ((JLabel)analysisMethod.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        availableViews.setFocusable(false);
        analysisMethod.setFocusable(false);

        // Buttons
        JButton addView = new JButton("+");
        addView.setFocusable(false);
        JButton removeView = new JButton("-");
        removeView.setFocusable(false);
        JButton recalculate = new JButton("Recalculate");
        recalculate.setFocusable(false);
        recalculate.addActionListener(this);

        // Add Components to Panel
        bottomPanel.add(viewsLabel);
        bottomPanel.add(availableViews);
        bottomPanel.add(addView);
        bottomPanel.add(removeView);
        bottomPanel.add(analysisLabel);
        bottomPanel.add(analysisMethod);
        bottomPanel.add(recalculate);

        bottomPanel.setOpaque(true);
        bottomPanel.setBackground(lightGrey);
        pane.add(bottomPanel, BorderLayout.PAGE_END);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("TODO - Recalculate");
    }
}
