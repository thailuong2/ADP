/**
 * 
 */
package pHW01_GUI_Swing_T142974;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * luong quoc thai T142974
 *
 */
public class cHW01_Prog03_T142974 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW01_Prog03_T142974 wMain = new cHW01_Prog03_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW01_Prog03_T142974() {
		JLabel lbl1 = new JLabel("Your Contact Information:"), lbl2 = new JLabel(
				"Name"), lbl3 = new JLabel("Email"), lbl4 = new JLabel(
				"Address"), lbl5 = new JLabel("Phone");
		JTextField txt1 = new JTextField(), txt2 = new JTextField(), txt3 = new JTextField(), txt4 = new JTextField();
		JButton bnt1 = new JButton("Submit"), bnt2 = new JButton("Cancel");
		setTitle("T142974-Contact Information ");
		setSize(350, 250);
		setLayout(null);
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(bnt1);
		add(bnt2);
		lbl1.setBounds(10, 20, 200, 20);
		lbl1.setForeground(Color.red);
		lbl2.setBounds(10, 50, 50, 20);
		txt1.setBounds(65, 50, 200, 25);
		lbl3.setBounds(10, 80, 50, 20);
		txt2.setBounds(65, 80, 200, 25);
		lbl4.setBounds(10, 110, 50, 20);
		txt3.setBounds(65, 110, 200, 25);
		lbl5.setBounds(10, 140, 50, 20);
		txt4.setBounds(65, 140, 200, 25);
		bnt1.setBounds(65, 175, 75, 25);
		bnt2.setBounds(150, 175, 75, 25);
	}
}
