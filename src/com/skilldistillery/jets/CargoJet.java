package com.skilldistillery.jets;

public class CargoJet extends Jet implements SmuggleCargo{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void smugglersRun() {
		System.out.println("Alright junior, lets load this up. Just smile and nod if the authorities catch us.");
		if (Math.random() > .5 ) {
			System.out.println("Great job kid, but don't get cocky!");
		} else {
			System.out.println("Ah it's the Empire! Ditch the loot and run!");
		}
	}

	
}
