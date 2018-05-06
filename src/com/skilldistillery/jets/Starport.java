package com.skilldistillery.jets;


public class Starport {
	
	private Jet[] hanger = new Jet[80];
	private Pilot[] pilotBar = new Pilot[80];
	
	public void addPilot(Pilot pilot) {
		boolean fullShips = false;
		for(int i = 0; i < pilotBar.length; i++) {
			if(pilotBar[i] == null) {
				pilotBar[i] = pilot;
				fullShips = true;
				break;
			}
		}
		if(!fullShips) {
			System.out.println("Too many pilots and not enough ships. Find another Starport.");
			
		}
	}
	
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
	public Pilot[] getPilotBar() {
		return pilotBar;
	}

	public void setPilotBar(Pilot[] pilotBar) {
		this.pilotBar = pilotBar;
	}
	
}
