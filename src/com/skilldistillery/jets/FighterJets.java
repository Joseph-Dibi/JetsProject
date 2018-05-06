package com.skilldistillery.jets;

public class FighterJets extends Jet implements DogFight {
	Starport hanger = new Starport();

	public FighterJets(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void loadMissles() {
		System.out.println("Loading missiles and preparing for dogfight!");
	}
}
					
	

