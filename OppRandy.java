package com.rockpaperscissorsetc;

public class OppRandy extends Player {

	String name = "Randy";

	protected OppRandy() {
		super();
	}

	@Override
	protected Roshambo selector() {
		Roshambo ro = null;
		int rng = 0;
		rng = (int) (Math.random() * 5);
		switch (rng) {
		case 0:
			ro = Roshambo.scissors;
			break;
		case 1:
			ro = Roshambo.rock;
			break;
		case 2:
			ro = Roshambo.paper;
			break;
		case 3:
			ro = Roshambo.lizard;
		case 4:
			ro = Roshambo.spock;
		}
		return ro;
	}

}
