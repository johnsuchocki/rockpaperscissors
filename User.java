package com.rockpaperscissorsetc;

public class User extends Player {

	String name = null;
	String userThrow = null;

	protected User(String name) {
		super();
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
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
