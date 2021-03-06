package screen;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import screen.load.LoadButton;
import screen.start.StartButton;

public class Start extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates the Screen for the start page
	 * 
	 * @author pplluumm
	 */
	public Start()
	{
		
		JPanel panel = new JPanel();
		this.setSize(960, 640);
		getContentPane().add(panel, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton Start = new StartButton(this);
		Component StartToLoadSpace = Box.createHorizontalStrut(20);
		JButton Load = new LoadButton();
		
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		getContentPane().add(Start);
		getContentPane().add(StartToLoadSpace);
		getContentPane().add(Load);
		
		this.setVisible(true);
	}
	
	public void end()
	{
		this.dispose();
	}
	
}
