package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 3; i++) {

			int task = JOptionPane.showOptionDialog(null, "What do you want to do for your pet", "playpit", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "clean up poop", "food", "cuddle" }, null);

			if (task == 0) {
				cleanPoop();
			}
			if (task == 1) {
				food();
			}
			if (task == 2) {
				cuddle();
			}

			if (happinessLevel == 3) {
				JOptionPane.showMessageDialog(null, "Take a break");
			}

		}
	}

	static void cleanPoop() {
		JOptionPane.showMessageDialog(null, "My poop is clean!");
		happinessLevel = happinessLevel + 3;
	}

	static void food() {
		JOptionPane.showMessageDialog(null, "Im not hungry!");
		happinessLevel = happinessLevel + 2;
	}

	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Im so warm!");
		happinessLevel = happinessLevel + 1;
	}

}