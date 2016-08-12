package com.rockpaperscissorsetc;

public class OppYourBoss extends Player {

	String name = "your boss";
	String userThrow = null;
	
	protected OppYourBoss(String userThrow) {
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
			ro = Roshambo.lizard;
			break;
		case "paper":
		case "spock":
			ro = Roshambo.rock;
			break;
		case "lizard":
			ro = Roshambo.paper;
			break;
		}
		return ro;
	}

}
