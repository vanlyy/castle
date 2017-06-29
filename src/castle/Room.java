package castle;

public class Room {
    public String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public void getExitDesc(){
    	if(northExit != null)
            System.out.print("north ");
        if(eastExit != null)
            System.out.print("east ");
        if(southExit != null)
            System.out.print("south ");
        if(westExit != null)
            System.out.print("west ");
    }
    
    public Room getExitRoom(String direction){
    	Room ret = null;
    	if(direction.equals("north")) {
            ret = northExit;
        }
        if(direction.equals("east")) {
            ret = eastExit;
        }
        if(direction.equals("south")) {
            ret = southExit;
        }
        if(direction.equals("west")) {
            ret = westExit;
        }
    	return ret;
    }
    
}
