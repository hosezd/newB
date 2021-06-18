package fixtures;

import java.util.Arrays;
import java.util.List;
public class Room extends Fixture{
	private Room[] exits;
	private List<String> directions = Arrays. asList("North","South","East","West");
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[directions.size()];
	}
	public Room[] getExits() {
		return exits;
	}
	public Room getExit(String direction ) {
		return exits[directions.indexOf(direction)];
		
	}
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	public List<String> getDirections() {
		return directions;
	}
	/*
	@Override
	public String toString() {
		return "Room [directions=" + directions + "]";
	}
	*/
	@Override
	   public String toString() {
	       String exits = "";
	       for (String direction : this.directions) {
	           if(getExit(direction)!=null)
	           exits += (direction + ": " + getExit(direction).getShortDescription() + "\n");
	           
	       }
	       return this.getName() + "\n\n" + this.getLongDescription() + "\n\n" + "Exits:\n"+
	       "Room [directions=" + directions + "]"; 
	       
	       
	   }
	
}
		
	
	
	
	
	
	
	

		

