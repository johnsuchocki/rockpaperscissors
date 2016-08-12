package com.rockpaperscissorsetc;

import java.util.Scanner;

public class Arena {

	public static void main(String[] args) {

		Scanner userScanner = new Scanner(System.in);
		String userInput = null;
		String userOpp = null;
		boolean inputValid = false;
		Validation valid = new Validation(null);
		boolean userQuit = false;
		int i = 0; //counter variable controlling oppPatty's behavior

		System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock.");
		System.out.println("Please enter your name:");

		userInput = userScanner.nextLine();
		User currentUser = new User(userInput);

		// Validates user input for selecting an opponent
		do {
			inputValid = false;
			System.out.println("Please select your opponent:");
			System.out.println("Your options are: \'Champ\', \'Doppleganger\', \'Dwight\', \'Edward\',"
					+ " \'Lizard\', \'Patty\', \'Randy\', \'Rocky\', \'Spock\', and \'My boss\'");

			userOpp = userScanner.nextLine();
			inputValid = valid.checkOpponent(userOpp.toLowerCase());
		} while (!(inputValid));

		// Starts a loop to continue playing until the user quits
		while (!(userQuit)) {
			// Validates user input for throws
			do {
				inputValid = false;
				System.out.println("Pick your throw:");
				System.out.println("rock, paper, scissors, lizard, Spock");
				System.out.println("Or enter \'quit\' to quit the game.");

				userInput = userScanner.nextLine();
				if (!(userInput.equalsIgnoreCase("quit"))) {
					inputValid = valid.checkThrow(userInput.toLowerCase());
				} else {
					// Quits out of the game loop if the user enters command
					// 'quit'
					userQuit = true;
					System.out.println("You have quit the game.  Thank you for playing!");
					break;
				}
			} while (!(inputValid));

			if (userQuit) {
				break;
			}

			currentUser.setUserThrow(userInput);

			switch (userOpp.toLowerCase()) {
			case "champ":
				OppChamp champ = new OppChamp(userInput);
				whoWins(currentUser.selector(), champ.selector(), champ.name);
				break;
			case "doppleganger":
				OppDoppleganger doppleganger = new OppDoppleganger(userInput);
				whoWins(currentUser.selector(), doppleganger.selector(), doppleganger.name);
				break;
			case "dwight":
				OppDwight dwight = new OppDwight();
				whoWins(currentUser.selector(), dwight.selector(), dwight.name);
				break;
			case "edward":
				OppEdward edward = new OppEdward();
				whoWins(currentUser.selector(), edward.selector(), edward.name);
				break;
			case "lizard":
				OppLizard lizard = new OppLizard();
				whoWins(currentUser.selector(), lizard.selector(), lizard.name);
				break;
			case "patty":
				OppPatty patty = new OppPatty(i);
				whoWins(currentUser.selector(), patty.selector(), patty.name);
				i++;
				if (i == 5) {
					i = 0;
				}
				break;
			case "randy":
				OppRandy randy = new OppRandy();
				whoWins(currentUser.selector(), randy.selector(), randy.name);
				break;
			case "rocky":
				OppRocky rocky = new OppRocky();
				whoWins(currentUser.selector(), rocky.selector(), rocky.name);
				break;
			case "spock":
				OppSpock spock = new OppSpock();
				whoWins(currentUser.selector(), spock.selector(), spock.name);
				break;
			case "my boss":
				OppYourBoss yourBoss = new OppYourBoss(userInput);
				whoWins(currentUser.selector(), yourBoss.selector(), yourBoss.name);
				break;
			}
		}
		userScanner.close();
	}

	public static void whoWins(Roshambo userThrow, Roshambo oppThrow, String userOpp) {
		switch (userThrow) {
		case lizard:
			switch (oppThrow) {
			case lizard:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("It's a tie :-/");
				System.out.println();
				break;
			case paper:
			case spock:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("You win! :-)");
				System.out.println();
				break;
			case rock:
			case scissors:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println(userOpp + " wins! :-(");
				System.out.println();
				break;
			}
			break;
		case paper:
			switch (oppThrow) {
			case lizard:
			case scissors:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println(userOpp + " wins! :-(");
				System.out.println();
				break;
			case paper:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("It's a tie :-/");
				System.out.println();
				break;
			case rock:
			case spock:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("You win! :-)");
				System.out.println();
				break;
			}
			break;
		case rock:
			switch (oppThrow) {
			case lizard:
			case scissors:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("You win! :-)");
				System.out.println();
				break;
			case paper:
			case spock:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println(userOpp + " wins! :-(");
				System.out.println();
				break;
			case rock:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("It's a tie :-/");
				System.out.println();
				break;
			}
			break;
		case scissors:
			switch (oppThrow) {
			case lizard:
			case paper:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("You win! :-)");
				System.out.println();
				break;
			case rock:
			case spock:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println(userOpp + " wins! :-(");
				System.out.println();
				break;
			case scissors:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("It's a tie :-/");
				System.out.println();
				break;
			}
			break;
		case spock:
			switch (oppThrow) {
			case lizard:
			case paper:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println(userOpp + " wins! :-(");
				System.out.println();
				break;
			case rock:
			case scissors:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("You win! :-)");
				System.out.println();
				break;
			case spock:
				System.out.println("You threw " + userThrow);
				System.out.println(userOpp + " threw " + oppThrow);
				System.out.println("It's a tie :-/");
				System.out.println();
				break;
			}
			break;

		}
	}
}
