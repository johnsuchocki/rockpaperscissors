package com.rockpaperscissorsetc;

public class OppDoppleganger extends Player {

	String name = "Doppleganger";
	String userThrow = null;
	
	protected OppDoppleganger(String userThrow) {
		super();
		this.userThrow = userThrow;
	}

	protected String getUserThrow() {
		return userThrow;
	}

	protected void setUserThrow(String userThrow) {
		this.userThrow = userThrow;
	}

	@Override
	protected Roshambo selector() {
		Roshambo ro = null;
		switch (userThrow) {
		case "rock":
			ro = Roshambo.rock;
			break;
		case "scissors":
			ro = Roshambo.scissors;
			break;
		case "paper":
			ro = Roshambo.paper;
			break;
		case "spock":
			ro = Roshambo.spock;
			break;
		case "lizard":
			ro = Roshambo.lizard;
			break;
		}
		return ro;
	}

}
