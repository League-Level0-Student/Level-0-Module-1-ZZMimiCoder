package Ifs_Ints_And_Loops;
import javax.swing.JOptionPane;
public class Remarkable {
	public static void main(String[] args) {
		String Bob = "You Have A Huge Ego And A Tiny IQ";
		String Jim = "You Have No Friends";
		String Zander = "Everybody Thinks You're Disgusting";
		String Name = JOptionPane.showInputDialog("What Is Your Name?");
		if (Name.equals("Bob")) {
			JOptionPane.showMessageDialog(null, Bob);
		}
		else if (Name.equals("Jim")) {
			JOptionPane.showMessageDialog(null, Jim);
		}
		else if (Name.equals("Zander")) {
			JOptionPane.showMessageDialog(null, Zander);
		}	
	}
}