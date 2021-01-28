
package pokemon;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

class Room 
{
    private String description;
    private Room[] exits=new Room[4]; 
    private String stringExits="Exits: ";
    private ArrayList <Item> items=new ArrayList();        

    
    public Room(String description) 
    {
        this.description = description;
       
    }
    public void setDescription(String d)
    {
    	description=d;
    }
   

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        
        exits[0]=north;exits[1]=east;exits[2]=south;exits[3]=west;
        if(north != null)
        {
        	stringExits+="north ";
        }
            
        if(east != null)
        {
        	stringExits+="east ";
        }
            
        if(south != null)
        {
        	stringExits+="south ";
        }
            
        if(west != null)
        {
        	stringExits+="west ";
        }
            
    }
  
    public void addItem(Item i)
    {
    	items.add(i);
    }
    
    
    public String listItems()
    {    	String output="";
    	
    	if(items.size()!=0)
    	{
			for(int x=0; x<items.size(); x++)
			{
			output=output+items.get(x).getName()+" ";
			}
			return "\nItems in the room: "+output;
		
    	}
    	return "";
    }
 
    public Item checkItemInRoom(String s)
	{
		for(int x=0; x<items.size(); x++)
		{
			if (items.get(x).getName().equals(s))
				return items.get(x);
		}
		return null;
	}
  
	public void removeItem(String s)
	{
		if (checkItemInRoom(s)!=null)
		{
			for(int x=0; x<items.size(); x++)
			{
				if (items.get(x).getName().equals(s))
				{
				
					items.remove(x);
				}
			}
		}
	}

   
    public String shortDescription()
    {
        return description;
    }

    public String longDescription()
    {
        return "You are in " + description + ".\n" + exitString() + listItems();
    }

    private String exitString()
    {     
        return stringExits;
    }

    public Room nextRoom(String direction) 
    {
        if (direction.equals("north"))
        {
        	return exits[0];
        }
        else if (direction.equals("east"))
        {
        	return exits[1];
        }
        else if (direction.equals("south"))
        {
        	return exits[2];
        }
        else if (direction.equals("west"))
        {
        	return exits[3];
        }
        else
        {
        	return null;
        }
    }
}