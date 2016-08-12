package com.rockpaperscissorsetc;

public class OppPatty extends Player {

	String name = "Patty";
	int i = 0;
	
	protected OppPatty(int i) {
		super();
		this.i = i;
	}

	@Override
	protected Roshambo selector() {
		Roshambo ro = null;
		switch (i) {
		case 0:
			ro = Roshambo.rock;
			break;
		case 1:
			ro = Roshambo.paper;
			break;
		case 2:
			ro = Roshambo.scissors;
			break;
		case 3:
			ro = Roshambo.lizard;
			break;
		case 4:
			ro = Roshambo.spock;
			break;
		}
		return ro;
	}

}
