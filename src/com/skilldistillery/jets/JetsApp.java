package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {
	
	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		
		app.run();
		
	
	}

	private void run() {
		starport(); // run takes you to starport where the jets can be added.
	}

	private static void starport() {
		Scanner sc = new Scanner(System.in); // here we add the first 5 jets using add jet method.
		Starport hanger = new Starport();
		CargoJet j1 = new CargoJet("Millenium Falcon", 400, 5000, 10);
		FighterJets	j2 = new FighterJets("X-Wing", 150, 2000, 2_000_000);
		FighterJets j3 = new FighterJets("Tie Fighter", 200, 1000, 3_000_000);
		JetImpl j4 = new JetImpl("Basic Boring Jet", 50, 100, 1000);
		CargoJet j5 = new CargoJet("Bebop", 150, 4000, 1_000_000);
		hanger.addJet(j1);
		hanger.addJet(j2);
		hanger.addJet(j3);
		hanger.addJet(j4);
		hanger.addJet(j5);
		
		System.out.println("Welcome to Mos Eisley Starport, Please select an option:");
		displayMenu();
		int choice = sc.nextInt();
		sc.nextLine();
		do {
			if (choice == 1) {
				Jet[] starportCopy = hanger.getHanger();
				for (Jet jet : starportCopy) {
					if (jet == null) {
						continue;
					}
					System.out.println(jet);
				}
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();
				
			}
			else if (choice == 2) {
				
			}
			else if (choice == 3) {
				Jet jet2 = null;
				Jet[] starportCopy1 = hanger.getHanger();
				double fastestJet = 0;
				for (int i = 0; i < starportCopy1.length; i++) {
					Jet jet = starportCopy1[i];
					if (jet != null && jet.getSpeed() > fastestJet) {
						jet2 = jet;
						fastestJet = jet.getSpeed();
					}
					
				} 
				
				System.out.println(jet2);
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();
			}
			else if (choice == 4) {
				Jet jet2 = null;
				Jet[] starportCopy1 = hanger.getHanger();
				int mostFuel = 0;
				for (int i = 0; i < starportCopy1.length; i++) {
					Jet jet = starportCopy1[i];
					if (jet != null && jet.getRange() > mostFuel) {
						jet2 = jet;
						mostFuel = jet.getRange();
					}
					
				} 
				
				System.out.println(jet2);
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();
			}
			else if (choice == 5) {
				
			}
			else if (choice == 6) {
				
			}
			else if (choice == 7) {
				System.out.println("What kind of vessel are you looking to land?\n1.Trade Vessel\n2.Fighter\n3.Basic Boring Jet...");
				int planeType = sc.nextInt();
				sc.nextLine();
				if (planeType == 1) {
					System.out.println("What is your Starship's name?");
					String name = sc.nextLine();
					System.out.println("What is the speed?");
					double speed = sc.nextDouble();
					sc.nextLine();
					System.out.println("What is the range?");
					int range = sc.nextInt();
					sc.nextLine();
					System.out.println("How much could I hawk your ship for if you don't come back?");
					long price = sc.nextLong();
					sc.nextLine();
					CargoJet cargoJet = new CargoJet(name, speed, range, price);
					
					hanger.addJet(cargoJet);
					System.out.println("What would you like to do next?");
					displayMenu();
					choice = sc.nextInt();
					sc.nextLine();
					
					
				}
				else if (planeType == 2) {
					System.out.println("What is your Starship's name?");
					String name = sc.nextLine();
					System.out.println("What is the speed?");
					double speed = sc.nextDouble();
					sc.nextLine();
					System.out.println("What is the range?");
					int range = sc.nextInt();
					sc.nextLine();
					System.out.println("How much could I hawk your ship for if you don't come back?");
					long price = sc.nextLong();
					sc.nextLine();
					FighterJets fighterJet = new FighterJets(name, speed, range, price);
					
					hanger.addJet(fighterJet);
					System.out.println("What would you like to do next?");
					displayMenu();
					choice = sc.nextInt();
					sc.nextLine();
				}
				else if (planeType == 3) {
					System.out.println("What is your Starship's name?");
					String name = sc.nextLine();
					System.out.println("What is the speed?");
					double speed = sc.nextDouble();
					sc.nextLine();
					System.out.println("What is the range?");
					int range = sc.nextInt();
					sc.nextLine();
					System.out.println("How much could I hawk your ship for if you don't come back?");
					long price = sc.nextLong();
					sc.nextLine();
					JetImpl jet = new JetImpl(name, speed, range, price);
					
					hanger.addJet(jet);
					System.out.println("What would you like to do next?");
					displayMenu();
					choice = sc.nextInt();
					sc.nextLine();
				} else {
					System.out.println("That is not an option! Come back when you're serious.");
					choice = sc.nextInt();
					sc.nextLine();
				}
			}else {
				System.out.println("That's not an option you fool! Pick again.");
				choice = sc.nextInt();
			}
		
		} while (choice != 8);
		System.out.println("Thank you for choosing Mos Eisley Starport, we value your business, but not enough to pry!");

	}
	public static void displayMenu(){
		System.out.println("1. List fleet\n" + 
				"2. Fly all jets\n" + 
				"3. View fastest jet\n" + 
				"4. View jet with longest range\n" + 
				"5. Load all Cargo Jets\n" + 
				"6. Dogfight!\n" + 
				"7. Add a jet to Fleet\n" + 
				"8. Quit");
	}
	

	
}
