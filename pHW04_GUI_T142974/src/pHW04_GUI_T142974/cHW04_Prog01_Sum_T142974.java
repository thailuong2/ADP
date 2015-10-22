/**
 * 
 */
package pHW04_GUI_T142974;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *Luong Quoc Thai T142974
 *
 */
public class cHW04_Prog01_Sum_T142974 extends JFrame {
	JButton btn1 = new  JButton("Tính"),
			btn2 = new JButton("Xóa");
	JLabel lbl1 = new JLabel("Nhập n ");
	JTextField txt1 = new JTextField();
	JTextArea a = new JTextArea();
	JScrollPane b = new JScrollPane(a); 
	public static void main(String[] args)  {
		cHW04_Prog01_Sum_T142974 wMain = new cHW04_Prog01_Sum_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}
	public cHW04_Prog01_Sum_T142974(){
		setSize(300,300);
		setTitle("Sum-T142974");
		setLayout(null);
		add(btn1);add(btn2);add(lbl1);add(txt1);
		//add(a);
		add(b);
		Insets insButton = new Insets(1, 1, 1, 1);
		lbl1.setBounds(10,10,50,25);
		txt1.setBounds(65,10,100,25);
		btn1.setMargin(insButton);
		btn2.setMargin(insButton);
		btn1.setBounds(10,40,50,25);
		btn2.setBounds(65,40,50,25);
		b.setBounds(10,70,250,180);
		ActionListener all = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num;
				if(e.getSource()==btn1){
			try {
				num = Integer.parseInt(txt1.getText());
			} catch (Exception e2) {
				a.append("Invalid Input"+"\n");
			}}
				
			}
		};
		btn1.addActionListener(all);
	}
}	
