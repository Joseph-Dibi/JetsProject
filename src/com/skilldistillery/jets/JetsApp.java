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
		FighterJets j2 = new FighterJets("X-Wing", 150, 2000, 2_000_000);
		FighterJets j3 = new FighterJets("Tie Fighter", 200, 1000, 3_000_000);
		JetImpl j4 = new JetImpl("Swordfish", 50, 100, 1000);
		CargoJet j5 = new CargoJet("Bebop", 150, 4000, 1_000_000);
		hanger.addJet(j1);
		hanger.addJet(j2);
		hanger.addJet(j3);
		hanger.addJet(j4);
		hanger.addJet(j5);
		Jet[] starportCopy = hanger.getHanger();
		Pilot p1 = new Pilot("Han Solo",
				"“You’ve never heard of the Millennium Falcon? It’s the ship that made the Kessel run in less than 12 parsecs.”");
		Pilot p2 = new Pilot("Luke Skywalker", "I am a Jedi, like my father before me.");
		Pilot p3 = new Pilot("Darth Vader", "I find your lack of faith disturbing.");
		Pilot p4 = new Pilot("Spike",
				"Uh, listen Jet. You said \"bell peppers and beef.\" There's no beef in here. So you wouldn't really call it \"bell peppers and beef,\" now would you?");
		Pilot p5 = new Pilot("Faye Valentine", "You know what they say cowboy, easy come easy go.");
		hanger.addPilot(p1);
		hanger.addPilot(p2);
		hanger.addPilot(p3);
		hanger.addPilot(p4);
		hanger.addPilot(p5);

		Pilot[] pilotCopy = hanger.getPilotBar();

		System.out.println("Welcome to Mos Eisley Starport, Please select an option:");

		displayMenu();

		int choice = sc.nextInt();
		sc.nextLine();
		do {
			if (choice == 1) {
				for (int i = 0; i < pilotCopy.length && i < starportCopy.length; i++) {
					Pilot pilot = pilotCopy[i];
					Jet jet = starportCopy[i];
					if (pilot == null && jet == null) {
						continue;
					}

					System.out.println(jet + "\nPiloted by: " + pilot.getName() + "\n" + pilot.getCatchPhrase());
				}
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();

			} else if (choice == 2) {
				for (Jet jet : starportCopy) {
					if (jet == null) {
						continue;
					}
					jet.fly();
				}
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();
			} else if (choice == 3) {
				Jet jet2 = null;
				double fastestJet = 0;
				for (int i = 0; i < starportCopy.length; i++) {
					Jet jet = starportCopy[i];
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
			} else if (choice == 4) {
				Jet jet2 = null;
				int mostFuel = 0;
				for (int i = 0; i < starportCopy.length; i++) {
					Jet jet = starportCopy[i];
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
			} else if (choice == 5) {

				for (Jet jet : starportCopy) {
					if (jet instanceof CargoJet) {
						System.out.println(jet.getModel() + " is going to try a smuggler's run!");
						((CargoJet) jet).smugglersRun();
					} else {
						continue;
					}
				}
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();
			} else if (choice == 6) {
				for (Jet jet : starportCopy) {
					if (jet instanceof FighterJets) {
						System.out.print(jet.getModel() + " is ");
						((FighterJets) jet).loadMissles();
					} else {
						continue;
					}
				}
				//dogFight(hanger);

				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();
			} else if (choice == 7) {
				System.out.println(
						"What kind of vessel are you looking to land?\n1.\"Trade Vessel\"\n2.Fighter\n3.Atmospheric Jet");
				int planeType = sc.nextInt();
				sc.nextLine();
				if (planeType == 1) { // adding jets to the hanger
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
					System.out.println("Great, We've got your plane added. Now who is flying it?");
					String pname = sc.nextLine();
					System.out.println("Now c'mon, what's your catch phrase? They've all got em'.");
					String catchPhrase = sc.nextLine();
					Pilot pilot = new Pilot(pname, catchPhrase);

					hanger.addPilot(pilot);
					hanger.addJet(cargoJet);
					System.out.println("What would you like to do next?");
					displayMenu();
					choice = sc.nextInt();
					sc.nextLine();

				} else if (planeType == 2) {// adding jets to the hanger
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
					System.out.println("Great, We've got your plane added. Now who is flying it?");
					String pname = sc.nextLine();
					System.out.println("Now c'mon, what's your catch phrase? They've all got em'.");
					String catchPhrase = sc.nextLine();
					Pilot pilot = new Pilot(pname, catchPhrase);

					hanger.addPilot(pilot);
					hanger.addJet(fighterJet);
					System.out.println("What would you like to do next?");
					displayMenu();
					choice = sc.nextInt();
					sc.nextLine();
				} else if (planeType == 3) {// adding jets to the hanger
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

					System.out.println("Great, We've got your plane added. Now who is flying it?");
					String pname = sc.nextLine();
					System.out.println("Now c'mon, what's your catch phrase? They've all got em'.");
					String catchPhrase = sc.nextLine();
					Pilot pilot = new Pilot(pname, catchPhrase);

					hanger.addPilot(pilot);
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
			} else if (choice == 9) {
				System.out.println("Which Jet would you like to fly?");
				int x = 0;

				for (Jet jet : starportCopy) {
					if (jet == null) {
						continue;
					}
					System.out.println(x + ". " + jet.getModel());
					x++;
				}
				int individJet = sc.nextInt();
				sc.nextLine();
				System.out.println("Who would you like your pilot to be?");
				int y = 0;
				for (Pilot pilot : pilotCopy) {
					if (pilot == null) {
						continue;
					}
					System.out.println(y + ". " + pilot.getName());
					y++;
				}
				int individ = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < starportCopy.length; i++) {
					Jet jet = starportCopy[i];
					if (jet == null) {
						continue;
					} else if (i == individJet) {
						System.out.print("You choose to fly ");
						jet.fly();
					}
				}
				for (int j = 0; j < pilotCopy.length; j++) {
					Pilot pilot = pilotCopy[j];
					if (pilot == null) {
						continue;
					} else if (j == individ) {
						System.out.println("You hired: " + pilot.getName() + ": " + pilot.getCatchPhrase());
						break;
					}
				}

				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.hasNextLine();
			} else if (choice == 10) {
				System.out.println(" You will never find a more wretched hive of scum and villainy.");
				for (Pilot pilot : pilotCopy) {
					if (pilot == null) {
						continue;
					}
					System.out.println(pilot);
				}
				System.out.println("What would you like to do next?");
				displayMenu();
				choice = sc.nextInt();
				sc.nextLine();

			}

			else {
				System.out.println("That's not an option you fool! Pick again.");
				choice = sc.nextInt();
			}

		} while (choice != 8);
		System.out
				.println("Thank you for choosing Mos Eisley Starport, we value your business, but not enough to pry!");
		sc.close();
	}

	public static void displayMenu() {
		System.out.println("1. List fleet\n" + "2. Fly all jets\n" + "3. View fastest jet\n"
				+ "4. View jet with longest range\n" + "5. Load all Cargo Jets\n" + "6. Dogfight!\n"
				+ "7. Add a jet to Fleet\n" + "8. Quit\n" + "9. Fly one Jet.\n10. List Pilots");
	}

//	public static void dogFight(Starport starportCopy) {
//		Jet[] battle = starportCopy.getHanger();
//		int nullCounter = 0;
//		for (Jet jet : battle) {
//			if (jet == null) {
//				nullCounter++;
//			}
//		}
//		System.out.println(nullCounter);
//		int planesLeft = battle.length;
//		while (planesLeft - nullCounter > 1) {
//
//			for (Jet jets : battle) {
//				if (jets == null) {
//					continue;
//				}
//				if (jets instanceof FighterJets) {
//					for (int i = 0; i < battle.length; i++) {
//						if (battle[i] == null) {
//							nullCounter++;
//							continue;
//						}
//						if (battle[i] == jets) {
//							continue;
//						}
//						if (Math.random() > .5) {
//							System.out.println(jets.getModel() + " just shot down " + battle[i].getModel());
//
//							battle[i] = null;
//							planesLeft--;
//						} else {
//							System.out.println(jets.getModel() + " was unable to get a shot off.");
//						}
//						if (planesLeft - battle.length - nullCounter == 1) {
//							System.out.println(jets.getModel() + " is the Top Starship.");
//							break;
//						}
//
//					}
//				}
//			}
//		}
//
//	}

}
