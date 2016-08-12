package com.rockpaperscissorsetc;

public class OppRocky extends Player {

	String name = "Rocky";
	
	protected OppRocky() {
		super();
	}

	@Override
	protected Roshambo selector() {
		Roshambo ro = null;
		int rng = 0;
		rng = (int) (Math.random() * 8);
		switch (rng) {
		case 0:
		case 1:
		case 2:
		case 3:
			ro = Roshambo.rock;
			break;
		case 4:
			ro = Roshambo.scissors;
			break;
		case 5:
			ro = Roshambo.paper;
			break;
		case 6:
			ro = Roshambo.lizard;
		case 7:
			ro = Roshambo.spock;
		}
		return ro;
	}

}
