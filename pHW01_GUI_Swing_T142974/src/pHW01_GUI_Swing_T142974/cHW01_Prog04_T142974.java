/**
 * 
 */
package pHW01_GUI_Swing_T142974;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * luong quoc thai T142974
 *
 */
public class cHW01_Prog04_T142974 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW01_Prog04_T142974 wMain = new cHW01_Prog04_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW01_Prog04_T142974() {
		JLabel lbl1 = new JLabel("Select Your workspace"), lbl2 = new JLabel(
				"Working Space");
		JTextField txt1 = new JTextField();
		JCheckBox ck = new JCheckBox("Use this as default and do not ask again");
		JButton bnt1 = new JButton("Browse"), bnt2 = new JButton("Ok"), bnt3 = new JButton(
				"Cancel");
		setTitle("T142974 - VLU eclipse ");
		setSize(400, 200);
		setLayout(null);
		add(lbl1);
		add(lbl2);
		add(txt1);
		add(ck);
		add(bnt1);
		add(bnt2);
		add(bnt3);
		lbl1.setBounds(20, 20, 150, 20);
		lbl1.setForeground(Color.red);
		lbl2.setBounds(20, 50, 100, 20);
		txt1.setBounds(120, 50, 150, 25);
		bnt1.setBounds(285, 50, 80, 25);
		ck.setBounds(20, 85, 250, 20);
		bnt2.setBounds(175, 120, 50, 25);
		bnt3.setBounds(230, 120, 75, 25);
	}
}
