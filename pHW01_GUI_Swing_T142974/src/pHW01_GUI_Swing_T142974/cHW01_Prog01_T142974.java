/**
 * 
 */
package pHW01_GUI_Swing_T142974;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *  luong quoc thai t142974
 *
 */
public class cHW01_Prog01_T142974 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW01_Prog01_T142974 wMain = new cHW01_Prog01_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW01_Prog01_T142974() {
		JLabel lbl1 = new JLabel("Username"), lbl2 = new JLabel("Password");
		JTextField txt1 = new JTextField(), txt2 = new JTextField();
		JButton bnt1 = new JButton("Submit");
		JCheckBox ck = new JCheckBox("Rememter Me");
		setTitle("T142974-Login Form");
		setSize(250, 250);
		setLayout(null);
		add(lbl1);
		add(lbl2);
		add(bnt1);
		add(txt1);
		add(txt2);
		add(ck);
		lbl1.setBounds(20, 20, 100, 25);
		lbl2.setBounds(20, 80, 100, 25);
		txt1.setBounds(20, 50, 150, 25);
		txt2.setBounds(20, 110, 150, 25);
		ck.setBounds(20, 140, 150, 25);
		bnt1.setBounds(20, 170, 75, 25);
	}
}
