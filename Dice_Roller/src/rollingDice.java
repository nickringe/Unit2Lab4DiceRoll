import java.util.Scanner;
import java.util.Random;
public class rollingDice {

	public static void main(String[] args) {
	System.out.println("Welcome to the Grand Circus Casino!");
	generateRandomDieRoll(0);
	}
	public static void generateRandomDieRoll (int a) {
		char cont;
		Random dice1 = new Random();
		Random dice2 = new Random();
		Scanner scnr = new Scanner(System.in);
		
		do {
			System.out.println("How many sides do you want each dice to have?");
			
			int choice = scnr.nextInt();
			
			System.out.println("Ok, each dice will have " + choice + " sides.");
			System.out.println("Roll 1:");
			
			int roll = dice1.nextInt(choice);
			int roll2 = dice2.nextInt(choice);
			
			System.out.println(roll);
			System.out.println(roll2);
			if (roll == 1 && roll2 == 1) {
				System.out.println("Wow, you rolled Snake Eyes!\n");
			} else if (roll == 6 && roll2 == 6) {
				System.out.println("Wow, you rolled Box Cars!\n");
			} else if (roll == 0 || roll2 == 0) {
				System.out.println("What in the world, a Zero? I'd call the manager if I were you..");
			} else {
				System.out.println("");
			}
			
			System.out.println("Would you like to roll again? y/n:");
			Scanner scnr2 = new Scanner(System.in);
			cont = scnr2.next().charAt(0);
		} while (cont == 'Y' || cont == 'y');
		
	}
}
