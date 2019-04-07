package Ifs_Ints_And_Loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
public class TheRiddler {
	public static void main(String[] args) {
		// 1. Make a variable to hold the score
		int Score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Answer = JOptionPane.showInputDialog("Brothers And Sisters I Have None But This Man's Father Is My Father's Son.\r\n" + 
				"Who is the man?");
		if (Answer == "The Man Is My Son") {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The Answer Is 'The Man Is My Son'");
		}
		Answer = JOptionPane.showInputDialog("");
		if (Answer == "") {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The Answer Is ''");
		}
		Answer = JOptionPane.showInputDialog("");
		if (Answer == "") {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The Answer Is ''");
		}
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}
