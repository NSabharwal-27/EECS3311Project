package gui;

import java.util.HashMap;

import org.jfree.chart.JFreeChart;

import analysis.Analysis_Type1;
import analysis.Analysis_Type7;
import analysis.Context;
import chartFactory.FactoryChart;
import fetchData.DataSet;

public class ChartSampleA implements Observer{
    private RecalcButton subject = RecalcButton.getInstance();
    JFreeChart chart;

    private static ChartSampleA instance;
	
	public static ChartSampleA getInstance() {
		if (instance == null) {
			instance = new  ChartSampleA();
		}
		return instance;
	}

    public ChartSampleA(){
        // subject.register(this);
        // if(MainWindow.getRequestedChartTypes()!= null){
        //     for (String i : MainWindow.getRequestedChartTypes()){
        //         analysis.add(i);
        //     }
        // }
    }

    @Override
    public void recalcUpdate(RecalcButton sub) {
        // TODO Auto-generated method stub
        System.out.println("1/////////////");
        Context context = new Context(new Analysis_Type1());
        HashMap<String, DataSet> data = context.callExecute(start, end, country);
        System.out.println("2/////////////");
        FactoryChart factory = new FactoryChart();
        if (analysis.size() > 0){
            chart = factory.getChart(title, analysis.get(0), data);
            System.out.println("3/////////////");
            window.chartSampleA = chart;
        }
        MainWindow.
        System.out.println("4/////////////");
    }

    @Override
    public void addUpdate(AddButton sub) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remUpdate(RemoveButton sub) {
        // TODO Auto-generated method stub
        
    }
}
