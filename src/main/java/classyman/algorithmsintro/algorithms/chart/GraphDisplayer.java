package classyman.algorithmsintro.algorithms.chart;
import java.awt.Color;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import com.google.common.collect.Lists;

import classyman.algorithmsintro.algorithms.EfficiencyType;
import classyman.algorithmsintro.algorithms.SortType;

/**
 * A simple demonstration application showing how to create a line chart using data from an
 * {@link XYDataset}.
 *
 */
public class GraphDisplayer extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	/**
     * Creates a new graph.
     *
     * @param title  the frame title.
     */
	
    public GraphDisplayer(List<SortType> algorithms) {

        super("Graphs");

        final XYDataset dataset = createDataset(algorithms);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }
    
    /**
     * Creates a sample dataset.
     */
    private XYDataset createDataset(List<SortType> algorithms) {
      
      final XYSeriesCollection dataset = new XYSeriesCollection();
      for (EfficiencyType type : algorithms) {
    	  dataset.addSeries(createSeriesForAlgorithm(type, 15));
      }
              
      return dataset;
        
    }

    
	/**
	 * Creates a data series for a given algorithm
	 * @param sortType the {@link SortType} algorithm to display efficiency for
	 * @param totalIterations the total number of iterations to display
	 * @return the series of data
	 */
	private XYSeries createSeriesForAlgorithm(EfficiencyType sortType, int totalIterations) {
		final XYSeries mergeSeries = new XYSeries(sortType.getClass().getSimpleName());
        
        for (int numberOfIterations = 0 ; numberOfIterations < totalIterations; numberOfIterations++) {
        	mergeSeries.add(numberOfIterations, sortType.calculateEfficiencyForCandN(numberOfIterations));
        }
		return mergeSeries;
	}
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the data for the chart.
     * 
     * @return a chart.
     */
    private JFreeChart createChart(final XYDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Line Chart Demo 6",      // chart title
            "Number of iterations",                      // x axis label
            "Time taken",                      // y axis label
            dataset,                  // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(Color.white);

//        final StandardLegend legend = (StandardLegend) chart.getLegend();
  //      legend.setDisplaySeriesShapes(true);
        
        // get a reference to the plot for further customisation...
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
    //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, false);
        renderer.setSeriesShapesVisible(1, false);
        plot.setRenderer(renderer);

        // change the auto tick unit selection to integer units only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.
                
        return chart;
        
    }

    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void generateFor(List<SortType> algorithms) {
    	
        final GraphDisplayer demo = new GraphDisplayer(algorithms);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
    
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void generateFor(SortType... algorithms) {
    	
        final GraphDisplayer demo = new GraphDisplayer(Lists.newArrayList(algorithms));
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}