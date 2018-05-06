package com.skilldistillery.jets;

public class Pilot {
	private String name;
	private String catchPhrase;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public Pilot(String name, String catchPhrase) {
		super();
		this.name = name;
		this.catchPhrase = catchPhrase;
	}
	@Override
	public String toString() {
		return "My name is " + name;
	}
	
	
}
