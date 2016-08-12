package com.rockpaperscissorsetc;

public class OppChamp extends Player {

	String name = "Champ";
	String userThrow = null;

	protected OppChamp(String userThrow) {
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
		case "scissors":
			ro = Roshambo.spock;
			break;
		case "paper":
		case "spock":
			ro = Roshambo.lizard;
			break;
		case "lizard":
			ro = Roshambo.rock;
			break;
		}
		return ro;
	}

}
