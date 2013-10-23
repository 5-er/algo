/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jgnuplot.*;

/**
 *
 * @author krystian
 */
public class Draw {

    public Draw(String dataFileName) {
        Plot.setGnuplotExecutable("gnuplot");
          Plot.setPlotDirectory("./tmp");
          Plot aPlot = new Plot();
          aPlot.setTitle(dataFileName);
          aPlot.setAutoscale();
          aPlot.setGrid();
          aPlot.setXLabel("inversions");
          aPlot.setYLabel("comparsions");
          aPlot.pushGraph(new Graph("./test/"+dataFileName+".txt", "1:2", Axes.NOT_SPECIFIED,
                "Logged in", Style.POINTS));
          aPlot.setOutput(Terminal.PNG, "test/out/"+dataFileName+".png", "1366,768");
          try {
             aPlot.plot();
          }
          catch (Exception e) {
             System.err.println(e);
             System.exit(1);
          }
    }
}
