/**
 * The Door class is used to implement a door. 
 * The door has a state and and name. 
 * It can be opened and closed.
 * @author jrohn
 *
 */

public class Door 
{
   private String name;
   private String state;


   /**
    * This is the constructor for the Door.
    * @param initName the name of the door
    * @param initState the state of the door
    */
   public Door(String initName, String initState)
   {
      name = initName;
      state = initState; 
   }

   public void open()
   {
      state = "open";
   }

   public void close()
   {
      state = "closed"; 
   }

 /**
  * This returns the name of the door.
  * @return the name of the door
  */
   public String getName()
   {
     return name;
   }
  
   public String getState()
   {
      return state;
   }

   public void setName(String newName)
   {
      name = newName;
   }

   public void setState(String newState)
   {
      state = newState;
   }
}
