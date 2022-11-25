// package gui;

// import java.util.HashMap;

// import javax.swing.JFrame;

// import org.jfree.chart.ChartPanel;
// import org.jfree.chart.JFreeChart;

// import analysis.AnalysisStrategy;
// import analysis.Analysis_Type1;
// import analysis.Analysis_Type2;
// import analysis.Analysis_Type3;
// import analysis.Analysis_Type4;
// import analysis.Analysis_Type5;
// import analysis.Analysis_Type6;
// import analysis.Analysis_Type7;
// import analysis.Analysis_Type8;
// import analysis.Context;
// import chartFactory.FactoryChart;
// import fetchData.DataSet;

// public class ChartSampleB implements Observer{
//     private RecalcButton subject = RecalcButton.getInstance();
//     JFreeChart chart;
//     HashMap<String, DataSet> data;
//     public int start;
//     public int end;
//     public String country;
//     public String title;
//     String thisAnalysis;

//     private static ChartSampleB instance;
	
// 	public static ChartSampleB getInstance() {
// 		if (instance == null) {
// 			instance = new  ChartSampleB();
// 		}
// 		return instance;
// 	}

//     public ChartSampleB(){
//         subject.register(this);
//     }

//     @Override
//     public void recalcUpdate(RecalcButton sub) {
//         System.out.println("recalc" + analysis.toString());
//         getFeilds();
//         Context context = new Context(getAnalysisObj());
//         data = context.callExecute(start, end, country);
//         FactoryChart factory = new FactoryChart();
//         if (analysis.size() > 1 && MainWindow.indexCounter == 1){
//             thisAnalysis = analysis.get(1);
//             chart = factory.getChart(thisAnalysis, title, data);
//             // if (chart == null) {
//             //     System.out.println("god dammit");
//             //     System.out.println(thisAnalysis);
//             //     System.out.println(title);
//             //     System.out.println(data.toString());
//             // }
            
//             MainWindow.indexCounter++;
//             ChartPanel chartPanelSampleB = new ChartPanel(chart);
//             MainWindow.chartHolder.add(chartPanelSampleB, 1);
//             MainWindow frame = MainWindow.getInstance();
//             frame.setVisible(true);
//         }
//     }

//     @Override
//     public void addUpdate(AddButton sub) {
//         System.out.println("Add" + analysis.toString());
//         if(chart == null && analysis.size() > 1 && MainWindow.indexCounter == 1){
//             thisAnalysis = analysis.get(1);
//             if (title == null){
//                 analysis.remove(1);
//                 MainWindow.requestedChartTypes.remove(MainWindow.getCurrentChart());
//                 new ErrorRecalc();
//             } else{
//                 FactoryChart factory = new FactoryChart();
//                 chart = factory.getChart(thisAnalysis, title, data);
//                 if (chart == null) {
//                     analysis.remove(1);
//                     MainWindow.requestedChartTypes.remove(MainWindow.getCurrentChart());
//                     new ErrorChart();
//                 }else{
//                     MainWindow.indexCounter ++;
//                     ChartPanel chartPanelSampleB = new ChartPanel(chart);
//                     MainWindow.chartHolder.add(chartPanelSampleB, 1);
//                     MainWindow frame = MainWindow.getInstance();
//                     frame.setVisible(true);                
//                 }
//             }
//         }
        
//     }

//     @Override
//     public void remUpdate(RemoveButton sub) {
//         System.out.println("Rem" + MainWindow.getCurrentChart());
//         if(analysis.size() > 1 && MainWindow.getCurrentChart().equals(thisAnalysis)){
//             chart = null;
//             analysis.remove(1);
//             thisAnalysis = null;
            
//             ChartPanel chartPanelSampleB = new ChartPanel(chart);
//             MainWindow.chartHolder.remove(1);;
//             MainWindow frame = MainWindow.getInstance();
//             frame.setVisible(true);
//         }
        
//     }

//     @Override
//     public void getFeilds(){
//         start = MainWindow.getStartYear();
//         end = MainWindow.getEndYear();
//         country = MainWindow.getCountryCode();
//         title = MainWindow.getAnalysisType();;
//     }

//     @Override
//     public AnalysisStrategy getAnalysisObj(){
//         if (title.equals(MainWindow.analysisTypes[0])){
//             return new Analysis_Type1();

//         } else if (title.equals(MainWindow.analysisTypes[1])){
//             return new Analysis_Type2();

//         } else if (title.equals(MainWindow.analysisTypes[2])){
//             return new Analysis_Type3();

//         }else if (title.equals(MainWindow.analysisTypes[3])){
//             return new Analysis_Type4();
            
//         }else if (title.equals(MainWindow.analysisTypes[4])){
//             return new Analysis_Type5();
            
//         }else if (title.equals(MainWindow.analysisTypes[5])){
//             return new Analysis_Type6();
            
//         }else if (title.equals(MainWindow.analysisTypes[6])){
//             return new Analysis_Type7();
            
//         }else if (title.equals(MainWindow.analysisTypes[7])){
//             return new Analysis_Type8();
            
//         }else{
//             return null;
//         }
//     }
// }
