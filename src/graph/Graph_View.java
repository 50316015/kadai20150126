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

    data.addValue(300, "�A�����J�@", "2005�N");
    data.addValue(500, "�A�����J�@", "2006�N");
    data.addValue(120, "�A�����J�@", "2007�N");
    
    data.addValue(200, "����", "2005�N");
    data.addValue(400, "����", "2006�N");
    data.addValue(320, "����", "2007�N");



	    JFreeChart chart = 
	      ChartFactory.createLineChart("�A����",
	                                   "�N�x",
	                                   "�g��(t)",
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
