import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.net.*;
/**
 * 
 */

/**
 * Luong Quoc Thai T142974
 *
 */
public class cHW03_Prog01_ManualTrafficControl_T142974 extends JFrame {
	JLabel Gt = new JLabel("Red Time"),
			Rt = new JLabel("Green Time"),
			Yt = new JLabel("Yellow Time");
	JTextField sG = new JTextField(),
			sR = new JTextField(),
			sY = new JTextField();
	ImageIcon icon1 = new ImageIcon("IMG/Untitled.png"),
			icon2 = new ImageIcon("IMG/Untitled1.png"),
					icon3 = new ImageIcon("IMG/Untitled2.png");
		JLabel lbl1 = new JLabel(icon1);
		JLabel lbl2 = new JLabel(icon2);
		JLabel lbl3 = new JLabel(icon3);
	JButton apply = new  JButton("Apply");
	int gt,rt,yt;
	
	int x=0,g=1000;
	int c=0;
	//JLabel lbl = new JLabel();
	
	public static void main(String[] args) throws IOException {
		cHW03_Prog01_ManualTrafficControl_T142974 wMain =  new cHW03_Prog01_ManualTrafficControl_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}
	public cHW03_Prog01_ManualTrafficControl_T142974() throws IOException{
		setTitle("Traffic Light Control");
		setSize(500,500);
		setLayout(null);
		add(sR);add(sG);add(sY);
		add(Gt);add(Rt);add(Yt);
		Gt.setBounds(10,10,80,20);
		sG.setBounds(100,10,50,20);
		Rt.setBounds(10,35,80,20);
		sR.setBounds(100,35,50,20);
		Yt.setBounds(10,60,80,20);
		sY.setBounds(100,60,50,20);
		add(apply);
		apply.setBounds(50,100,80,25);
		add(lbl1);add(lbl2);add(lbl3);
		//lbl.setBounds(10,130,300,300);
		ActionListener all = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==apply){
					try {
						gt = Integer.parseInt(sG.getText());
						rt = Integer.parseInt(sR.getText());
						yt = Integer.parseInt(sY.getText());
					} catch (NumberFormatException e2) {
						System.out.print("loi");
					}
					
				}
				Timer s = new Timer(g,new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						x =x+g;
						if(c==0){
						if(x<=gt*1000){
							lbl1.setBounds(10,100,300,300);
							lbl3.setBounds(0, 00, 00, 00);
							lbl2.setBounds(0, 00, 00, 00);
						}else{
							c=1;
							x=0;
						}}if(c==1){
						if(x<=rt*1000){
							lbl2.setBounds(10,100,300,300);
							lbl1.setBounds(0, 00, 00, 00);
							lbl3.setBounds(0, 00, 00, 00);
						}else{
							c=2;
							x=0;
						}}if(c==2){
						if(x<=yt*1000){
							lbl3.setBounds(10,100,300,300);
							lbl1.setBounds(0, 00, 00, 00);
							lbl2.setBounds(0, 00, 00, 00);
						}else{
							c=0;
							x=0;
						}}
					}
				});
				s.start();
			}
		
		};
		apply.addActionListener(all);
	}
		
	
}
