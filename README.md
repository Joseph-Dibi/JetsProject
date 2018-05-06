## Jets Projects
### Week 2 Skill Distillery Homework

#### Description / how it works/ obj
	The program works by using a method to start the program. The initial program will call a method to display a menu. This menu will display after every choice but number 8 which exits the program.
	Choice number 1 displays the Starships currently docked in the hanger. This will update as new ships are added. I also had pilots be assigned to planes for this.
	Choice 2 will fly all the jets. This is the same as choice 1 but it adds flight distance which is range/speed and Hyperspace Speed (Mach Speed).
	Choice 3 will view the fastest jet, this also updates with new jets
	Choice 4 same but with range.
	Choice 5 this checks the array for Cargo Ships. Once a cargo ship is found it will then cast the jet to cargo ship then call the interface method Smuggler run. This prints text and gives the ships a 50-50 shot to be successful.
	Choice 6 This starts a dogfight feature. All combat planes are armed with missiles and then the combat planes will shoot down all planes until only one combat plane is left. Dogfight is not fully functional. The interface for the combat planes works correctly, but I had trouble implementing the Mayhem style combat I wanted. The reason was the null statements either caused my program to never finish or interfered with everything being shot down. Since this was just a for fun aspect I am not worried that it is not fully functional (Some planes get to escape, yay!), but if I were to do it again I would probably rely less on the Mayhem style combat and more utilize the formulas I created during the Lord of the Objects project by adding hp/attack damage.
	Choice 7 This feature adds planes. You can add a plane of any of the three types to the hanger. These planes will then show up in other features.
	Choice 8 This exits the program and prints a message.
	Choice 9 lets you pick a plane to fly as well as a pilot to go with.
	Choice 10 lists the pilots.
#### Topics and Technologies used
	My program uses inheritance to have multiple differing classes that all share the Jet traits. This allows the different jets to be put into one large "Starport." Of those jets, the Fighter and Smuggler class both implement unique interfaces which allows them different methods than the basic jet properties. 
#### How to run

#### Lessons Learned
	I was able to utilize arrays effectively to both add and retrieve objects. I expanded upon this with the use of instance of which allowed me to inspect the arrays for objects of a single specific type. I could then cast those objects to their own type and use their implemented methods. 
	
	Another lesson that I need to hammer home for preceding assignments is to comment and put things in methods as I go. I add a few comments as I'm going but if I take the time to add comments as I'm creating the object it is easier to follow my own train of thought for code and for others trying to read it. As for methods, I feel that my program could break more things into methods. This goes with the comments as it is far easier to break things into methods initially then to going back later to try and turn code blocks into methods.