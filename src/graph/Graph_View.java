package graph;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Graph_View extends Frame implements ActionListener,WindowListener {

	public Graph_View(){
		addWindowListener(this);
		setTitle("Graph");
		
		DefaultCategoryDataset data = new DefaultCategoryDataset();

    data.addValue(300, "アメリカ　", "2005年");
    data.addValue(500, "アメリカ　", "2006年");
    data.addValue(120, "アメリカ　", "2007年");
    
    data.addValue(200, "中国", "2005年");
    data.addValue(400, "中国", "2006年");
    data.addValue(320, "中国", "2007年");



	    JFreeChart chart = 
	      ChartFactory.createLineChart("輸入量",
	                                   "年度",
	                                   "トン(t)",
	                                   data,
	                                   PlotOrientation.VERTICAL,
	                                   true,
	                                   false,
	                                   false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
