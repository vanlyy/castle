package castle;

import java.util.HashMap;

public class Room {
    public String description;
    private HashMap <String,Room> exits = new HashMap<String,Room>();
    

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(String direction,Room room) 
    {
    	exits.put(direction, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc(){
    	StringBuffer sb = new StringBuffer();
    	for(String exit:exits.keySet()){
    		sb.append(exit+" ");
    	}
        return sb.toString();
    }
    
    public Room getExitRoom(String direction){
    	Room ret = null;
    	ret = exits.get(direction);
    	return ret;
    }
    
}
