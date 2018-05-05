package com.skilldistillery.jets;


public class Starport {
	
	private Jet[] hanger = new Jet[100];
	
	public void addJet(Jet jet) {
		boolean fullHanger = false;
		for(int i = 0; i < hanger.length; i++) {
			if(hanger[i] == null) {
				hanger[i] = jet;
				fullHanger = true;
				break;
			}
		}
		if(!fullHanger) {
			System.out.println("The landing pads are full. Find another Starport.");
			
		}
	}

	public Jet[] getHanger() {
		return hanger;
	}

	public void setHanger(Jet[] hanger) {
		this.hanger = hanger;
	}
	
	
}
