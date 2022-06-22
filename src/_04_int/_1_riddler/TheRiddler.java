package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String guess= JOptionPane.showInputDialog("What has an eye but cannot see?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (guess.equals("a needle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was a needle.");
		}
		// 6. Add some more riddles
		String RiddleTwo= JOptionPane.showInputDialog("What occurs once in every minute, twice in\n"	+
		"every moment, yet never in a thousand years?");
		if(RiddleTwo.equals("the letter m")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was the letter m");
		}
		String RiddleThree= JOptionPane.showInputDialog("What has hands but cannot clap?");
		if(RiddleThree.equals("a clock")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was a clock.");
		}
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Congratulations! Your score is "+score+"");
	}
}

