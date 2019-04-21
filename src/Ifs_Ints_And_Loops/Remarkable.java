package Ifs_Ints_And_Loops;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String bob = "You Have A Huge Ego And A Tiny IQ";
		String jim = "You Have No Friends";
		String zander = "Everybody Thinks You're Disgusting";
		String name = JOptionPane.showInputDialog("what is your name");
		if (name.equals("bob")) {
			JOptionPane.showMessageDialog(null, bob);
		}
		else if (name.equals("jim")) {
			JOptionPane.showMessageDialog(null, jim);
		}
		else if (name.equals("zander")) {
			JOptionPane.showMessageDialog(null, zander);
		}	
	}
}