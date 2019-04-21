package Ifs_Ints_And_Loops;
import javax.swing.JOptionPane;
public class UnBirthday {
	public static void main(String[] args) {
		String date = "4/21";
		String birthdaydate = JOptionPane.showInputDialog("What Is Your Birthday?");
		if (birthdaydate.equals(date)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Un-Birthday!");
		}
	}
}
