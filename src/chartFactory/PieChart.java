package chartFactory;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class PieChart implements Chart {

    //TODO - Modify to use ChartFactory.
    // Just here as a sample for creating charts
    public static PieDataset<String> createDataset(double a, double b, double c, double d) {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<String>();
        dataset.setValue("IPhone 5s", a);
        dataset.setValue("SamSung Grand", b);
        dataset.setValue("MotoG", c);
        dataset.setValue("Nokia Lumia", d);
        return dataset;
    }

    public static JFreeChart createChart(double a, double b, double c, double d) {
        PieDataset<String> dataset = createDataset(a, b, c, d);
        JFreeChart chart = ChartFactory.createPieChart( //NOTE: ChartFactory here refers to a Factory supplied with JFreeChart
                "Mobile Sales", // chart title
                dataset, // data
                true, // include legend
                true,
                false);
        return chart;
    }
}
