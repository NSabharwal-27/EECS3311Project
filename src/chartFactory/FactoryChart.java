package chartFactory;
import java.util.HashMap;
import javax.swing.JLabel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;


import fetchData.DataSet;

public class FactoryChart {
    JFreeChart chart;
    ChartCreator creator;
    String title;
    String yLabel;

    public JFreeChart getChart(String chartType, String analysisType, HashMap<String, DataSet> analysis){
        title = analysisType;
        yLabel = getY(analysisType);

        if (chartType.equals("Pie Chart") &&
            yLabel.equals("Average")){
            creator = new PieChartCreator();
            this.chart = creator.createChart(title, yLabel, analysis);

        }else if (chartType.equals("Line Chart") &&
            !yLabel.equals("Average")){
            creator = new SeriesChartCreator();
            this.chart = creator.createChart(title, yLabel, analysis);

        }else if (chartType.equals("Bar Chart") &&
            !yLabel.equals("Average")){
            creator = new BarChartCreator();
            this.chart = creator.createChart(title, yLabel, analysis);

        }else if (chartType.equals("Scatter Chart") &&
            !yLabel.equals("Average")){
            creator = new ScatterChartCreator();
            this.chart = creator.createChart(title, yLabel, analysis);

        }
        // else if (chartType.equals("Series Chart")){
        //     creator = new SeriesChartCreator();
        //     this.chart = creator.createChart(title, yLabel, analysis);
        // }

        return chart;
    }
    
    
    public String getY(String analysisType){
        if (analysisType.equals("CO2 vs Energy vs Air Pollution")
            || analysisType.equals("Air Pollution vs Forest Area")){
            return "Annual Percentage";
        }else if(analysisType.equals("CO2 vs GDP per Capita")
            || analysisType.equals("Current Health Expenditure vs Hospital Beds")){
            return "Ratio";
        }else if(analysisType.equals("Average Forest Area (% of Land Area)")
            || analysisType.equals("Average Government Expenditure on Education")){
            return "Average";
        }
        return "";
    }

}
