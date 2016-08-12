package com.rockpaperscissorsetc;

public class Validation {

	String userInput = null;

	protected Validation(String userInput) {
		super();
		this.userInput = userInput;
	}

	protected String getUserInput() {
		return userInput;
	}

	protected void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
	protected boolean checkOpponent(String userInput) {
		switch (userInput.toLowerCase()) {
		case "champ":
		case "doppleganger":
		case "dwight":
		case "edward":
		case "lizard":
		case "patty":
		case "randy":
		case "rocky":
		case "spock":
		case "my boss":
			return true;
		default:
			System.out.println("You've entered an invalid input.  Try again.");
			System.out.println();
			return false;
		}
	}
	
	protected boolean checkThrow(String userInput) {
		switch (userInput.toLowerCase()) {
		case "rock":
		case "paper":
		case "scissors":
		case "lizard":
		case "spock":
			return true;
		default:
			System.out.println("You've entered an invalid input.  Try again");
			System.out.println();
			return false;
		}
	}
	
	
}
