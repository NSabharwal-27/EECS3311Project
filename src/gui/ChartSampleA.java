package gui;

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import analysis.AnalysisStrategy;
import analysis.Analysis_Type1;
import analysis.Analysis_Type2;
import analysis.Analysis_Type3;
import analysis.Analysis_Type4;
import analysis.Analysis_Type5;
import analysis.Analysis_Type6;
import analysis.Analysis_Type7;
import analysis.Analysis_Type8;
import analysis.Context;
import chartFactory.FactoryChart;
import fetchData.DataSet;

public class ChartSampleA implements Observer{
    private RecalcButton subject = RecalcButton.getInstance();
    JFreeChart chart;
    HashMap<String, DataSet> data;
    public int start;
    public int end;
    public String country;
    public String title;
    public String report;
    String thisAnalysis;

    private static ChartSampleA instance;
	
	public static ChartSampleA getInstance() {
		if (instance == null) {
			instance = new  ChartSampleA();
		}
		return instance;
	}

    public ChartSampleA(){
        subject.register(this);
    }

    @Override
    public void recalcUpdate(RecalcButton sub) {
        System.out.println("recalc" + analysis.toString());
        getFields();
        
        ArrayList<String> list = MainWindow.requestedChartTypes;

        for(String chartName : list){

            FactoryChart factory = new FactoryChart();
            chart = factory.getChart(chartName, title, data);

            if (chart == null && !chartName.equals("Report")) {
                MainWindow.requestedChartTypes.remove(chartName);
                new ErrorChart();

            }else if (chartName.equals("Report")){
                JTextArea textDescription = new JTextArea(report);
                JScrollPane scrollPane = new JScrollPane(textDescription); 
                scrollPane.setName("Report");
                MainWindow.chartHolder.add(scrollPane);
                MainWindow frame = MainWindow.getInstance();
                frame.setVisible(true);

            }else{
                ChartPanel chartPanelSampleA = new ChartPanel(chart);
                chartPanelSampleA.setName(chartName);
                MainWindow.chartHolder.add(chartPanelSampleA);
                MainWindow frame = MainWindow.getInstance();
                frame.setVisible(true);
            }
            
        }

    }

    @Override
    public void addUpdate(AddButton sub) {
        System.out.println("Add" + analysis.toString());
        if(analysis.size() > 0){
            thisAnalysis = analysis.get(0);
            analysis.remove(0);

            if (title == null){
                MainWindow.requestedChartTypes.remove(MainWindow.getCurrentChart());
                new ErrorRecalc();

            } else if (thisAnalysis.equals("Report")){
                JTextArea textDescription = new JTextArea(report);
                JScrollPane scrollPane = new JScrollPane(textDescription);
                scrollPane.setName("Report"); 
                MainWindow.chartHolder.add(scrollPane);
                MainWindow frame = MainWindow.getInstance();
                frame.setVisible(true);

            }else{
                FactoryChart factory = new FactoryChart();
                chart = factory.getChart(thisAnalysis, title, data);

                if (chart == null) {
                    MainWindow.requestedChartTypes.remove(MainWindow.getCurrentChart());
                    new ErrorChart();

                }else{
                    ChartPanel chartPanelSampleA = new ChartPanel(chart);
                    chartPanelSampleA.setName(thisAnalysis);
                    MainWindow.chartHolder.add(chartPanelSampleA);
                    MainWindow frame = MainWindow.getInstance();
                    frame.setVisible(true);
                }
            }
        }
        
    }

    @Override
    public void remUpdate(RemoveButton sub) {
        System.out.println("Rem" + MainWindow.getCurrentChart());
        
        String chartToRemove = MainWindow.getCurrentChart();

        //Get the components in the panel
        Component[] componentList = MainWindow.chartHolder.getComponents();

        //Loop through the components
        for(Component c : componentList){

            //Find the components to remove
            if(c.getName().equals(chartToRemove)){

                //Remove it
                MainWindow.chartHolder.remove(c);
            }
        }

        //IMPORTANT
        MainWindow.chartHolder.revalidate();
        MainWindow.chartHolder.repaint();
        
    }

    @Override
    public void getFields(){
        start = MainWindow.getStartYear();
        end = MainWindow.getEndYear();
        country = MainWindow.getCountryCode();
        title = MainWindow.getAnalysisType();

        Context context = new Context(getAnalysisObj());
        data = context.callExecute(start, end, country);
        
        report = getReport();
    }

    @Override
    public AnalysisStrategy getAnalysisObj(){
        if (title.equals(MainWindow.analysisTypes[0])){
            return new Analysis_Type1();

        } else if (title.equals(MainWindow.analysisTypes[1])){
            return new Analysis_Type2();

        } else if (title.equals(MainWindow.analysisTypes[2])){
            return new Analysis_Type3();

        }else if (title.equals(MainWindow.analysisTypes[3])){
            return new Analysis_Type4();
            
        }else if (title.equals(MainWindow.analysisTypes[4])){
            return new Analysis_Type5();
            
        }else if (title.equals(MainWindow.analysisTypes[5])){
            return new Analysis_Type6();
            
        }else if (title.equals(MainWindow.analysisTypes[6])){
            return new Analysis_Type7();
            
        }else if (title.equals(MainWindow.analysisTypes[7])){
            return new Analysis_Type8();
            
        }else{
            return null;
        }
    }

    @Override
    public String getReport() {
        if (title.equals(MainWindow.analysisTypes[3]) || title.equals(MainWindow.analysisTypes[4])){
            report = title + "\n===================================\n";

            for (String i : data.keySet()){
                DataSet newData = data.get(i);
                report = report.concat(i + ":\n");
                report = report.concat("\t Average => " + newData.get(0) + "\n");
            }

            report = report.concat("\n");
            
        }else{
            report = title + "\n===================================\n";
            for (int year = start; year <= end; year++){
                report = report.concat("Year " + year + ":\n");

                for (String i : data.keySet()){
                    DataSet newData = data.get(i);
                    report = report.concat("\t" + i + " => " + newData.get(year) + "\n");
                }

                report = report.concat("\n");
            }
        }
        return report;
    }
}
