import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author KTTH
 *
 */
public class demo1 extends JFrame {
	Timer timCounter= null;
	JButton btnStart = new JButton("stop");
	cTimerDemo_AnalogCounter_Pane clock = new cTimerDemo_AnalogCounter_Pane();
	
	public  demo1(){
		setTitle("Label Demo with image!");
		setSize( 300, 200);
		setLayout(null);
		
		add(clock);
		add( btnStart);
		btnStart.setBounds(10, 10, 80, 25);
		clock.setBounds(10, 40, 200, 200);
		
		btnStart.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if( btnStart.getText().equals("start")){
					clock.start();
					btnStart.setText( "stop");
				}
				else{
					clock.stop();
					btnStart.setText( "start");
				}
				
			}
		});
		
		
		
		
	//	timCounter.start();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 mainwindow = new demo1();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	
	}

}
