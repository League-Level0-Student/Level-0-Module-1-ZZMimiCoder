package Ifs_Ints_And_Loops;
import javax.swing.JOptionPane;
public class Badger {
	public static void main(String[] args) {
		for (int P = 0; P < 3; P++) {
			for (int W = 0; W < 4; W++) {
				for (int X = 0; X < 13; X++) {
					JOptionPane.showMessageDialog(null, "Badger");
				}
				for (int Y = 0; Y < 3; Y++) {
					JOptionPane.showMessageDialog(null, "Mushroom");
				}
			}
			for (int Z = 0; Z < 6; Z++) {
				JOptionPane.showMessageDialog(null, "Snake");
			}
		}
	}
}