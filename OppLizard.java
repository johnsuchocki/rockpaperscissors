package com.rockpaperscissorsetc;

public class OppLizard extends Player {

	String name = "Lizard";

	protected OppLizard() {
		super();
	}

	@Override
	protected Roshambo selector() {
		return Roshambo.lizard;
	}
}
