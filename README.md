## Jets Projects
### Week 2 Skill Distillery Homework

#### Description / how it works/ obj
	The program works by using a method to start the program. The initial program will call a method to display a menu. This menu will display after every choice but number 8 which exits the program.
	Choice number 1 displays the Starships currently docked in the hanger. This will update as new ships are added.
	Choice 2 will fly all the jets. This is the same as choice 1 but it adds flight distance which is range/speed.
	Choice 3 will view the fastest jet, this also updates with new jets
	Choice 4 same but with range.
	Choice 5 this checks the array for Cargo Ships. Once a cargo ship is found it will then cast the jet to cargo ship then call the interface method Smuggler run. This prints text and gives the ships a 50-50 shot to be successful.
	Choice 6 This starts a dogfight feature. All combat planes are armed with missles and then the combat planes will shoot down all planes until only one combat plane is left.
	Choice 7 This feature adds planes. You can add a plane of any of the three types to the hanger. These planes will then show up in other features.
	Choice 8 This exits the program and prints a message.
#### Topics and Technologies used
	My program uses inheritance to have multiple differing classes that all share the Jet traits. This allows the different jets to be put into one large "Starport." Of those jets, the Fighter and Smuggler class both implement unique interfaces which allows them different methods than the basic jet properties. 
#### How to run

#### Lessons Learned
	I was able to utilize arrays effectively to both add and retrieve objects. I expanded upon this with the use of instance of which allowed me to inspect the arrays for objects of a single specific type. I could then cast those objects to their own type and use their implemented methods. 