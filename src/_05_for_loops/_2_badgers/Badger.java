package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badger {

	public static void main(String[] args) {
		int loopCount = 0;
		while (loopCount < 2) {
			for (int badgerCount = 0; badgerCount <11; badgerCount += 1) {
				System.out.print("badger ");
			}
			System.out.println();
			for (int mushroomCount = 0; mushroomCount <2; mushroomCount += 1) {
				System.out.print("mushroom ");
			}
				System.out.println();
			
			loopCount ++;
		}

		System.out.println("snake!");
	}
}
