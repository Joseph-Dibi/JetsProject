package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		System.out.println("The starship: " + model + ", Atmospheric Speed:" + speed + ", Galactic Flight Distance=" + range + ", Republic Credits=" + price + ". Can fly a distance of: " + range/speed + " Intergalactic Miles. " + "HyperSpace Speed: " + speed*.001303);
	} //mach = miles per hour × 0.001303

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Starship:" + model + ", Speed:" + speed + ", Galactic Flight Distance=" + range + ", Republic Credits=" + price;
	}
	
}
