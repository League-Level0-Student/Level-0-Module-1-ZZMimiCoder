package Ifs_Ints_And_Loops;
import javax.swing.JOptionPane;
public class SecretMessageBox {
	public static void main(String[] args) {
		String Password = "Bloody Knife";
		String SecretMessage = JOptionPane.showInputDialog("Enter The Secret Message:");
		String Guess = JOptionPane.showInputDialog("You Can Only See The Secret Message If You Can Guess The Passcode:");
		if(Guess.equals(Password)) {
			JOptionPane.showMessageDialog(null, SecretMessage);
		}
		else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!");
		}
	}
}
