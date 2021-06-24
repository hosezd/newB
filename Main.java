package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	static boolean quit=false;

	public static void main(String[] args) {
		RoomManager rm=new RoomManager();
		rm.init();
		Player player=new Player(rm.startingRoom);
		
		while(!quit) {
			printRoom(player);
			parse(collectlnput(),player);
			
		}
	}

	private static String[] collectlnput() {
	Scanner input=new Scanner(System.in);
	return input.nextLine().split(" ");
	}

	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().toString());
		System.out.println("Where do you want to go?,Please select the direction " );
	}
  private static void parse(String[] command, Player player) {
	  //command[] = {"go", "left"} or {"go", "north"} or etc. 
	switch (command[0]) {//command[0] will be "go" usually
    case "go":
    	if(player.getCurrentRoom().getExit(command[1])!=null)
        	player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
        break;
    case "quit":
    	 quit=true;
    	
    	System.out.println("Goodbye");
    	break;
        default:
        	System.out.println("I don't understand that command.");
        break;
           }
	
	
	}

}
