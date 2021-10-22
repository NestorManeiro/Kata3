package kata3;

import java.awt.Dimension;
import java.util.Random;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart;
        chart = ChartFactory.createBarChart(
                "Histograma JFreeChart",
                "Dominios email",
                "Nº de emails",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                false,
                rootPaneCheckingEnabled
        );
        return chart;
    }
        public static DefaultCategoryDataset createDataSet(){
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
            dataSet.addValue(5, "", "gmail.com");
            dataSet.addValue(10, "", "ulpgc.es");
            dataSet.addValue(7, "", "ull.es");
            dataSet.addValue(2, "", "hotmail.com");
            return dataSet;
    }
}