package Ifs_Ints_And_Loops;
import javax.swing.JOptionPane;
public class XGeeks {
public static void main(String[] args) {
	String Bob = "Bob's Superpower Is Flying";
	String Jim = "Jim's Superpower Is Invisibility";
	String Zander = "Zander's Superpower Is Healing Quickly";
	String June = "June's Superpower Is Writing Recipes";
	String Ethan = "Ethan's Superpower Is Time Travel";
	String name = JOptionPane.showInputDialog("Enter A Name");
	if (name.equals("Bob")) {
		JOptionPane.showMessageDialog(null, Bob);
	}
	else if (name.equals("Jim")) {
		JOptionPane.showMessageDialog(null, Jim);
	}
	else if (name.equals("Zander")) {
		JOptionPane.showMessageDialog(null, Zander);
	}
	else if (name.equals("June")) {
		JOptionPane.showMessageDialog(null, June);
	}
	else if (name.equals("Ethan")) {
		JOptionPane.showMessageDialog(null, Ethan);
	}
	}
}
