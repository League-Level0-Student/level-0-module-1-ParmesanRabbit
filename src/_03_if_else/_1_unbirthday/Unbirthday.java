package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String date="6/8";
		String birthday= JOptionPane.showInputDialog("When is your birthday? mm/dd");
		if (birthday.equals(date)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
		}
		
		
		
	}
}

