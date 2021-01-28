package pokemon;
class Game 
{
    private Parser parser=new Parser();
    private Room currentRoom;
    private Inventory myInventory=new Inventory();
    private Room pokemonworld0,pokemonworld1, pokemonworld2,pokemonworld3, pokemonworld4,pokemonworld5,pokemonworld6, pokemonworld7, pokemonworld8, deoxys1,deoxys2,rayquaza1,rayquaza2,eevee1,eevee2,teamrocket1,teamrocket2;
    final private String DEAD="***************YOU HAVE DIED***************";
    public Game() 
    {
        createRooms();
    }
    private void createRooms()
    {
        pokemonworld0 = new Room("*WORLD OF POKEMON - NORTHWEST CORNER*\nThere are multiple statues of different pokemon surrounding an object which appears to have a botton on the top of it.");
        pokemonworld1 = new Room("*WORLD OF POKEMON - NORTH SIDE*\nThere is a door to your north blocked by a large boulder. Inscribed in the bolder is 3 orbs with symbols representing the elements, 'fire', 'water', and 'grass'");
        pokemonworld2 = new Room("*WORLD OF POKEMON - NORTHEAST CORNER*\nThere is a man with a sword charging at a pokemon who is,\nattacking him. In the chest of the pokemon there is a switch...");
        pokemonworld3 = new Room("*WORLD OF POKEMON - WEST SIDE*\nStairs lead up to the west...");
        pokemonworld4 = new Room("*WORLD OF POKEMON - CENTER*\nProfessor Oak approaches you with an AppleiPad in his hand...");
        pokemonworld5= new Room("*WORLD OF POKEMON - EAST SIDE*\nThere is a dark tunnel to the east...");
        pokemonworld6= new Room("*WORLD OF POKEMON - SOUTHWEST CORNER*\nStatues of pokemon trainers with warhammers are onto of a rock with a dial at the center...");
        pokemonworld7= new Room("*WORLD OF POKEMON - SOUTH SIDE*\nThere is a burial ground of some sort to the south.");
        pokemonworld8= new Room("*WORLD OF POKEMON - SOUTHEAST CORNER*\nA poke trainer is pointing a bow and arrow at a flying object in the sky. There is a lever on the bottom of the statue...");
        rayquaza1=new Room("*CLIMBING STAIRS*\nYou reach the top of the stairs but there is a locked door with a 3 digit padlock.\nThere is a small metal plate with some writing on it.");
        deoxys1=new Room("*POKEMON BURIAL GROUND*\nWalking through the burial ground you come across a locked gate with no visible way of opening it.  There is a silly looking crazy pokemon statue taunts you.");
        eevee1=new Room("*DARK CAVE*\nAs you decend into darkness you can barely make out a faint glowing orb.\n  If it were any darker in here, I would fear you'd be eaten by a pokemon.");
	teamrocket1=new Room("*HALLWAY OF DOOM*\nThe hallway is littered with pictures of kids grabbing apples from pokemon's tree.  They all have a red X through them except for your picture.");
        rayquaza2=new Room("*RAYQUAZA'S DEN*\nAt the top of the spire there is a long, green flying pokemon high above.  With an ear-piercing squelch it dives down towards you!");
        teamrocket2=new Room("*TEAM ROCKET'S HEADQUARTERS*\nTeam Rocket stands before you, with a powerful weaponry and surrounded by members of Team Rocket.  'So you have defeated all of my challenges!  You will, however, never defeat me!  What do you have to say for yourself?");
        eevee2=new Room("*EEVEE'S FARM*\nVenturing through the cave you spot a small pokemon in the corner.  It looks like an eevee!  At least it didn't see you.  Oh wait, now it did.");
        deoxys2=new Room("*DEOXYS WORLD*\nSlowly walking your way through the burial ground you hear a rustling behind a large rock.  A wild deoxys appears!");
        pokemonworld0.setExits(null, pokemonworld1, pokemonworld3, null);
        pokemonworld1.setExits(null, pokemonworld2, pokemonworld4, pokemonworld0);
        pokemonworld2.setExits(null, null, pokemonworld5, pokemonworld1);
        pokemonworld3.setExits(pokemonworld0, pokemonworld4, pokemonworld6, rayquaza1);
        pokemonworld4.setExits(pokemonworld1, pokemonworld5, pokemonworld7, pokemonworld3);
        pokemonworld5.setExits(pokemonworld2, eevee1, pokemonworld8, pokemonworld4);
        pokemonworld6.setExits(pokemonworld3, pokemonworld7, null, null);
        pokemonworld7.setExits(pokemonworld4, pokemonworld8,deoxys1, pokemonworld6);
        pokemonworld8.setExits(pokemonworld5, null, null, pokemonworld7);
        rayquaza1.setExits(null,pokemonworld3,null,null);
        rayquaza2.setExits(null,rayquaza1,null,null);
        deoxys1.setExits(pokemonworld7,null,null,null);
        deoxys2.setExits(deoxys1,null,null,null);
        eevee1.setExits(null,null,null,pokemonworld5);
        eevee2.setExits(null,null,null,eevee1);
        teamrocket1.setExits(teamrocket2,null,pokemonworld1,null);
        pokemonworld0.addItem(new Item("button","environment", "A shinny red button.  You can probably push it with the use command."));
	pokemonworld2.addItem(new Item("switch","environment", "A polished silver switch.  You can probably flip it with the use command."));
	pokemonworld6.addItem(new Item("dial","environment", "A reflective golden dial.  You can probably spin it with the use command."));
	pokemonworld8.addItem(new Item("lever","environment", "A sparkling brass lever.  You can probably activate it with the use command."));
	pokemonworld4.addItem(new Item("AppleiPad","environment", "Profesor Oak has istructions on an Apple iPad:\nIn the courtyard you must stay\nPick up 4 items with no delay\nBut, the mightiest weapon\nfirst you must take.\nTaking any other\nis a fatal mistake."));
        deoxys1.addItem(new Item("crazycharizard", "environment", "*RIDDLE*\nWhat is the latest year that is the same upside down?\nType 'answer' and then your answer."));
        deoxys2.addItem(new Item("deoxys", "environment","The deoxys stands over 100 feet tall, and is covered in thick skin and armor, which appear immune to sharp objects.  One spot of his body is exposed.\nType 'use' and a weapon to attack."));
        eevee1.addItem(new Item("orb","environment", "*RIDDLE*\nI'm tall when I'm young and I'm short when I'm old. What am I?\nType 'answer' and then your answer."));
        eevee2.addItem(new Item("eevee", "environment","The wild eevee walks around the outside of the room, stalking you.  You notice a sign that says, 'No Ag beyond this point.'\nType 'use' and a weapon to attack."));
        rayquaza1.addItem(new Item("padlock", "environment", "*RIDDLE*\nWhat comes down but never goes up?\nType 'answer' and then your answer."));
        rayquaza2.addItem(new Item("rayquaza","environment","Rayquaza has many large, green scales on itself.  There is one green scale missing on the front of rayquaza, but he is moving very fast and he would be a difficult target.'\nType 'use' and a weapon to attack."));
        teamrocket2.addItem(new Item("teamrocket", "environment","Team rocket is immune to all attacks because of its weaponry."));
        pokemonworld1.addItem(new Item("fireorb","environment", "An orb representing, 'fire'"));
        pokemonworld1.addItem(new Item("waterorb","environment", "An orb representing, 'water'"));
        pokemonworld1.addItem(new Item("grassorb","environment", "An orb representing, 'grass'"));
        
        currentRoom = pokemonworld4; 
 
    }
    public void play() 
    {            
        printWelcome();
               
        boolean finished = false;
        while (! finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }
    private void printWelcome()
    {
       
        System.out.println();
        System.out.println(" --------------- ");
        System.out.println("|The Game of Pokemon|   - written by Sahil Rajapkar");
        System.out.println(" --------------- ");
        System.out.println("Welcome! You have been chosen to explore the amazing world of pokemon!");
        System.out.println("Pokemon are friendly and wonderful creatures who can be found in this universe!");
        System.out.println("But don't get too excited! There are also evil and cruel pokemon with despicable trainers...");
        System.out.println("Your job is to find these trainers and make sure to stop their evil ways...");
        System.out.println("It won't be easy but there will always a companion to support you!");
        System.out.println("Find this companion and catch him because you'll never know when he will come of use!");
        System.out.println("I wish the best of luck to you, young trainer,....may the odds be with you... :)");
        System.out.println("\nType 'help' if you need help with commands and getting around.");
        System.out.println("Command words: go quit help inventory get examine use answer");
        System.out.println();
        System.out.println(currentRoom.longDescription());
        
    }

    private boolean processCommand(Command command) 
    {
        if(command.isUnknown())
        {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("inventory"))
  			myInventory.listItems();
  		else if (commandWord.equals("examine"))
  			examineItem(command);
  		else if (commandWord.equals("answer"))
  			answerRiddle(command);
  		else if (commandWord.equals("use"))
  			useItem(command);
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("get"))
            getItem(command);
        else if (commandWord.equals("quit"))
        {
            if(command.hasSecondWord())
                System.out.println("Quit what?");
            else
                return true;  
        }
        return false;
    }
    private void printHelp() 
    {
        
        System.out.println("You are playing The Game of Pokemon!!!!!!!!!!!");
        System.out.println("To get out you need to use special command words.  Examples: 'go north', 'examine pokebook', 'use pokemon'");
        System.out.println("Your command words are:");
        
        parser.showCommands();
        
    }
    private void examineItem(Command command)
    {
    	
        if(!command.hasSecondWord())
        {
            System.out.println("Examine what?");
            return;
        }
                String item = command.getSecondWord();
        if (item.equals("room"))
        {
        	System.out.println(currentRoom.longDescription());
        }
        else
        {
	        Item roomItem=currentRoom.checkItemInRoom(item);
	        Item inventoryItem=myInventory.checkInventory(item);
	        if (roomItem!=null  )
	        {
	        	System.out.println(roomItem.getDescription()); 	
	        }
	        else if (inventoryItem!=null)
	        {
	        	System.out.println(inventoryItem.getDescription());
	        }
	        else
	        {
	        	System.out.println("I can't examine that.");
	        }
        }
    }
    private void answerRiddle(Command command)
    {
    	if(!command.hasSecondWord())
        {

            System.out.println("Type 'answer' followed by your answer.");
            return;
        }
		String item = command.getSecondWord();
		
		Item roomItem=currentRoom.checkItemInRoom(item);

    	if (currentRoom.checkItemInRoom("crazycharizard")!=null)
    	{
    		if (item.equals("1961"))
    		{
    			System.out.println("The crazycharizard slowly disappears and changes to an expression of defeat.  The gate unlocks.");
    			// change room exits, (north, east, south, west)
    			deoxys1.setExits(pokemonworld7,null,deoxys2,null);
    			currentRoom.removeItem("crazycharizard");
    			currentRoom.setDescription("*POKEMON BURIAL GROUND*\nYou are in a burial ground with an open gate, and a defeated looking pokemon.");
    				
    			
    		}
    		else 
    		{
    			System.out.println("The pokemon's expression changes to a sinister smile as its eyes begin to glow brightly.  The last thing you remember is an extremely bright light." + DEAD + "\nHINT: 20 years from a bombing at pearl.");

    		}
    	}
    	else if (currentRoom.checkItemInRoom("orb")!=null)
    	{
    		if (item.equals("candle"))
    		{
    			System.out.println("The orb flickers for a moment and then lights up as bright as daylight.  The path ahead is now fully visible.");
    			// change room exits, (north, east, south, west)
    			eevee1.setExits(null,eevee2,null,pokemonworld5);
    			currentRoom.removeItem("orb");
    			currentRoom.setDescription("*(no longer)DARK CAVE*\nYou are in a brightly lit cave.  An orb glows brightly revealing the path ahead.");
    		}
    		else 
    		{
    			System.out.println("The orb flickers for an then the room goes completely dark.  You hear the sound of what is probably a pokemon gnawing on something...and I think that something is you." + DEAD + "\nHINT: There's a museum in NYC full of famous people made of the same thing this is made of. ");
    		}
    	}
    	else if (currentRoom.checkItemInRoom("padlock")!=null)
    	{
    		if (item.equals("rain"))
    		{
    			System.out.println("The lock pops open with a click allowing you to move forward.");
    			// change room exits, (north, east, south, west)
    			rayquaza1.setExits(null,pokemonworld3,null,rayquaza2);
    			currentRoom.removeItem("padlock");
    			currentRoom.setDescription("*CLIMBING STAIRS*\nYou are on a twisty staircase.  At the top of the stairs there is an open door.");
    			
    		}
    		else 
    		{
    			System.out.println("A needle pierces your skin near the lock.  Well, that could have been worse.  \nIt could...have...been............poisoned......" + DEAD + "\nHINT:Need not worry about your plants.");
    		}
    	}
    	else
    	{
    		System.out.println("There's nothing to answer here.");
    	}
     
    }
        
    private void useItem(Command command)
    {
    	if(!command.hasSecondWord())
        {
            System.out.println("Use what?");
            return;
        }
		String item = command.getSecondWord();
		
        Item roomItem=currentRoom.checkItemInRoom(item);
        Item inventoryItem=myInventory.checkInventory(item);
        
        if (roomItem!=null)
        {
        	if (item.equals("button"))
        	{
        		System.out.println("The button is now pressed in.  The pen falls from the statue's hand.");
        		currentRoom.setDescription("*WORLD O' POKEMON - NORTHWEST CORNER*\nThere are multiple statues of different pokemon surrounding an object which appears to have a botton on the top of it which is pressed in.");
        		currentRoom.removeItem("button");
        		currentRoom.addItem(new Item("pen","pickup", "A pen with a pokemon saying 'GG'"));
        	}

        	
 
      			else if (item.equals("lever") && myInventory.checkInventory("pen")==null)//bow
      			{
      				System.out.println("The statue slowly turns towards you aiming the bow directly at your head.  Well, this won't end well.\n" + DEAD + "\nHINT: The first statue you activate matters.");
      				endGame();
      			}
      			else if (item.equals("dial") && myInventory.checkInventory("pen")==null)//warhammer
      			{
      				System.out.println("The statue slowly turns towards you raising the warhammer high into the air.  I hope you're wearing a helmet.\n" + DEAD + "\nHINT: The first statue you activate matters.");
      				endGame();
      			}
      			else if (item.equals("switch") && myInventory.checkInventory("pen")==null)//sword
      			{
      				System.out.println("The statue slowly turns towards you pulling back the sword which, you notice, is in line directly with your head.  Any chance that's a rubber sword?\n" + DEAD + "\nHINT: The first statue you activate matters.");
      				endGame();
      			}
      			else if (item.equals("lever"))
      			{
      				System.out.println("You hear the lever click into place.  The statue looses its grasp of the bow, and it falls to the ground.");
      				currentRoom.removeItem("lever");
      				currentRoom.setDescription("*WORLD OF POKEMON - SOUTHEAST CORNER*\nThere is a large statue of a woman aiming at the sky with nothing.  A lever is pushed in.");
      				currentRoom.addItem(new Item("bow","pickup","A beautiful silver bow with a quiver of silver arrows."));
      			}
      			else if (item.equals("dial"))
      			{
      				System.out.println("The dial sinks into the statue.  The statue looses its grasp of the warhammer, and it falls to the ground.");
      				currentRoom.removeItem("dial");
      				currentRoom.setDescription("*WORLD OF POKEMON - SOUTHWEST CORNER*\nThere is a large statue of a blacksmith forging nothing.  A dial is sunken into the statue.");
      				currentRoom.addItem(new Item("warhammer","pickup","A heavy warhammer.  Great for smashing things."));
      				}
      			else if (item.equals("switch"))
      			{
      				System.out.println("The switch is activated.  The statue looses its grasp of the sword, and it falls to the ground.");
      				currentRoom.removeItem("switch");
      				currentRoom.setDescription("*WORLD OF POKEMON - NORTHEAST CORNER*\nThere is a large statue of a man charging into battle with nothing.  A switch has been activated.");
      				currentRoom.addItem(new Item("sword","pickup","A sword sharp enough to split a hair."));
      			}
      			else
      			{
      				System.out.println("I can't use that here.");
      			}
        }
        else if (inventoryItem!=null)
        {
        	
        	if (item.equals("sword") && currentRoom.checkItemInRoom("rayquaza")!=null)
        	{
        		System.out.println("As the rayquaza decends towards you, you point the sword to the sky and close your eyes.  Miraculously, the tip of the sword finds place where the scale is missing, instantly killing the dragon.  The wild rayquaza left behind 'water'.");
        		currentRoom.addItem(new Item("water","pickup","A diamond with the word 'water' inscribed on it."));
        		currentRoom.removeItem("rayquaza");
        		currentRoom.setDescription("*RAYQUAZA'S DEN*\nThere is a slain rayquaza here.");
      	
        	}
        	else if (item.equals("sword") && currentRoom.checkItemInRoom("deoxys")!=null)
        	{
        		System.out.println("You swing wildly at the wild deoxys with the sword, but to no avail.  The deoxys arm comes down on you." + DEAD + "\nHint: Examine the deoxys for a clue.");
        		endGame();
        	}
        	else if (item.equals("sword") && currentRoom.checkItemInRoom("eevee")!=null)
        	{
        		System.out.println("You plunge the sword into the leaping werewolf, but it just pulls it out, sinking its teeth into your neck." + DEAD + "\nHint: Examine the eevee for a clue.");
        		endGame();
        	}
        	else if (item.equals("sword") && currentRoom.checkItemInRoom("teamrocket")!=null)
        	{
        		System.out.println("You charge at the team rocket, sword in hand.  You bring the sword down on team rocket but it is blocked by the forcefield.  Teamrocket mumbles something under his breath, which causes a fireball to emerge from his staff.  You smell burning." + DEAD+ "\nHint: Regular weapons won't work here.");
        		endGame();
        	}
        	else if (item.equals("bow") && currentRoom.checkItemInRoom("rayquaza")!=null)
        	{
        		System.out.println("Quickly, you aim an arrow at the weak part of the rayquaza.  Not being much a marksman, you miss entirely.  The wild rayquaza hovers in the air above you, and takes a deep breath.  You smell burning." + DEAD+ "\nHint: Examine the wild rayquaza for a clue.");
        		endGame();
        	}
        	else if (item.equals("bow") && currentRoom.checkItemInRoom("deoxys")!=null)
        	{
        		System.out.println("Without hesitation, you pull back the bow let the arrow fly.  It bounces off the deoxys's skin as if it were made of rubber.  Deoxys yells, 'Ouchies, deoxys attack!' as he crushes you with his club." + DEAD + "\nHint: Examine the deoxys for a clue.");
        		endGame();
        	}
        	else if (item.equals("bow") && currentRoom.checkItemInRoom("eevee")!=null)
        	{
        		System.out.println("The werewolf lunges at you from the far side of the room.  Pulling back the bow you let an arrow fly, and it hits the eevee squarely in the chest and it falls to the ground next to you. The eevee left behind 'fireorb'.");
        		currentRoom.addItem(new Item("fireorb","pickup","A diamond with the word 'fire' inscribed on it."));
        		currentRoom.removeItem("eevee");
        		currentRoom.setDescription("*EEVEE'S FARM*\nThe remains of a eevee are here.");
        	}
        	else if (item.equals("bow") && currentRoom.checkItemInRoom("teamrocket")!=null)
        	{
        		System.out.println("You retract your bow and release an arrow towards teamrocket.  Before it can even reach him, the arrow turned around in the air and headed back at you.  You try to duck but it is too late." + DEAD + "\nHint: Regular weapons won't work here.");
        		endGame();
        	}
        	else if (item.equals("warhammer") && currentRoom.checkItemInRoom("rayquaza")!=null)
        	{
        		System.out.println("You begin to lift the warhammer above your head.  By the time it is about halfway there, the rayquaza has already grabbed you.  Flying high over the castle, you feel the claws in your back release.  Here comes the ground." + DEAD + "\nHint: Examine the wild rayquaza for a clue.");
        		endGame();
        	}
        	else if (item.equals("warhammer") && currentRoom.checkItemInRoom("deoxys")!=null)
        	{
        		System.out.println("The wild deoxys lifts his club high into the air.  You quickly do the same with your warhammer, but it is so heavy you drop it on the deoxys's foot.  Screaming in pain, the deoxys falls to the ground, hitting his head on a large boulder and knocking him out.  The deoxys left behind 'water'.");
        		currentRoom.addItem(new Item("waterorb","pickup","A diamond with the word 'water' inscribed on it."));
        		currentRoom.removeItem("deoxys");
        		currentRoom.setDescription("*DEOXYS WORLD*\nThere is an unconscious deoxys here.");
        	}
        	else if (item.equals("warhammer") && currentRoom.checkItemInRoom("eevee")!=null)
        	{
        		System.out.println("You lift the warhammer, but it is so heavy that it takes you too long.  The eevee's teeth sink into your neck as you drop the warhammer to the ground." + DEAD + "\nHint: Examine the eevee for a clue.");
        		endGame();
        	}
        	else if (item.equals("warhammer") && currentRoom.checkItemInRoom("teamrocket")!=null)
        	{
        		System.out.println("You lift the warhammer to the sky but you feel its weight becoming heavier and heavier, as teamrocket mumbles something under his breath.  The weight of the hammer becomes so great that you lose your grip.  Unfortunately, that happened as it was right above your head." + DEAD + "\nHint: Regular weapons won't work here.");
        		endGame();
        	}
        	else if (item.equals("pen") && currentRoom.checkItemInRoom("rayquaza")!=null)
        	{
        		System.out.println("You hold out the pen, and try to imagine what you were thinking when you chose to use a pen against a rayquaza.  A tongue of flame extends from the rayquaza's mouth, engulfing you." + DEAD + "\nHint: Examine the rayquaza for a clue.");
        		endGame();
        	}
        	else if (item.equals("pen") && currentRoom.checkItemInRoom("deoxys")!=null)
        	{
        		System.out.println("You hold out the pen, and try to imagine what you were thinking when you chose to use a pen against an deoxys.  The deoxys's club crashes down on your skull."+ "\nHint: Examine the deoxys for a clue.");
        		endGame();
        	}
        	else if (item.equals("pen") && currentRoom.checkItemInRoom("eevee")!=null)
        	{
        		System.out.println("You hold out the pen, and try to imagine what you were thinking when you chose to use a pen against a eevee.  The eevee's teeth sink into your neck." + "\nHint: Examine the eevee for a clue.");
        		endGame();
        	}
        	else if (item.equals("apple") && currentRoom.checkItemInRoom("rayquaza")!=null)
        	{
        		System.out.println("You hurl the apple at the wild rayquaza.  It eats it.  Then it eats you." + DEAD + "\nHint: Examine rayquaza for a clue.");
        		endGame();
        	}
        	else if (item.equals("apple") && currentRoom.checkItemInRoom("deoxys")!=null)
        	{
        		System.out.println("You hurl the apple at the deoxys.  The wild deoxys catches it in his mouth and crushes it, splattering apple pieces everywhere.  The deoxys's arm comes down on your head."+ "\nHint: Examine the deoxys for a clue.");
        		endGame();
        	}
        	else if (item.equals("apple") && currentRoom.checkItemInRoom("eevee")!=null)
        	{
        		System.out.println("You hurl the apple at the eevee.  It chomps it in one bite.  Then it chomps neck." + "\nHint: Examine the eevee for a clue.");
        		endGame();
        	}
        	else if (item.equals("apple") && currentRoom.checkItemInRoom("teamrocket")!=null)
        	{
        		System.out.println("You hurl the apple at teamrocket.  Teamrocket scoffs, 'So now you want to give it back?  Well its too late!'  Teamrocket's staff glows red with fire.  You smell burning.  " + "\nHint: Regular weapons won't work here.");
        		endGame();
        	}
        	else if (item.equals("pen") && currentRoom.checkItemInRoom("teamrocket")!=null)
        	{
        		System.out.println("Not knowing what else to do, you use the pen to write, 'I'm sorry for stealing your apple!'  Teamrocket sees this and takes pity on you.  'Child, you have learned a valuable lesson today, and for this I will free you!'  Holding his staff high in the air Pokemon muttered something under his breath and...darkness.");
        		System.out.println("You wake up in your neighbor's yard and feel a large bump on the top of your head.  Next to you is a tree limb that must have fallen and hit you.  You think to yourself, 'Was this all a dream?'  Nevertheless, you learned that fire, water, and grass matter, and you walked over to your neighbor's door to appologize.  Upon answering the door, and without you having to say a word, the grey haired man said, 'Appology accepted.  But I believe you have something that belongs to me.'  Feeling something in your pocket, you reach in and grab the pen...still with the initials GG on it.\n**********YOU HAVE FINISHED THE GAME, CONGRATULATIONS!**********");
 				endGame();
        	}
        	else if (item.equals("fireorb") && currentRoom.checkItemInRoom("fire")!=null)
        	{
        		System.out.println("You place 'fire' in the indentation.  It begins to glow.");
        		currentRoom.removeItem("fire");
        		if (currentRoom.checkItemInRoom("fire")==null && currentRoom.checkItemInRoom("water")==null && currentRoom.checkItemInRoom("grass")==null)
        		{
        			System.out.println("\nThe door has opened.  A new exit is available.");
        			pokemonworld1.setExits(teamrocket1,pokemonworld2,pokemonworld4,pokemonworld0);
        		}
        	}
        	else if (item.equals("waterorb") && currentRoom.checkItemInRoom("water")!=null)
        	{
        		System.out.println("You place 'water' in the indentation.  It begins to glow.");
        		currentRoom.removeItem("water");
        		if (currentRoom.checkItemInRoom("fire")==null && currentRoom.checkItemInRoom("water")==null && currentRoom.checkItemInRoom("grass")==null)
        		{
        			System.out.println("\nThe door has opened.  A new exit is available.");
        			pokemonworld1.setExits(teamrocket1,pokemonworld2,pokemonworld4,pokemonworld0);
        		}
        	}
        	else if (item.equals("grassorb") && currentRoom.checkItemInRoom("grass")!=null)
        	{
        		System.out.println("You place 'grass' in the indentation.  It begins to glow.");
        		currentRoom.removeItem("grass");
        		if (currentRoom.checkItemInRoom("fire")==null && currentRoom.checkItemInRoom("water")==null && currentRoom.checkItemInRoom("grass")==null)
        		{
        			System.out.println("\nThe door has opened.  A new exit is available.");
        			pokemonworld1.setExits(teamrocket1,pokemonworld2,pokemonworld4,pokemonworld0);
        		}
        	}
        	else
        	{
        		System.out.println("I can't use that here.");
        	}
        }
        else
        {
        	System.out.println("I don't see that.");
        }
        
    }
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord())
        {
            System.out.println("Go where?");
            return;
        }
        String direction = command.getSecondWord();
        Room nextRoom = currentRoom.nextRoom(direction);

        if (nextRoom == null)
            System.out.println("There is no door!");
        else 
        {
            currentRoom = nextRoom;
            System.out.println(currentRoom.longDescription());
        }
    }
    private void getItem(Command command)
    {
    	if(!command.hasSecondWord())
        {
            System.out.println("Get what?");
            return;
        }
        String item = command.getSecondWord();
 		Item currentItem=currentRoom.checkItemInRoom(item);
        if (currentItem==null )
        {
        	System.out.println("I don't see that here.");
        }
        else if (currentItem.getType()!="pickup")
        {
        	System.out.println("You can't pick that up.");
        }
       
        else if (currentItem!=null)
        {
        	myInventory.addItem(currentItem);
        	currentRoom.removeItem(currentItem.getName());
        	System.out.println("You picked up the " + item);
        }


    } 
    private void endGame()
    {
    	System.exit(0);
    }
}
