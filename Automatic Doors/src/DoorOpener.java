//ALGORITHM
//Create an array of Doors
//While the user wants to add doors
//     Prompt the user to specify the name of the door 
//     Prompt the user to specify the state of the door
//     Create a door using values specified by the user
//     Add the door to the array

//Print the doors of the array

import java.util.Arrays;
import java.util.Scanner;
public class DoorOpener 
{
	public static final int LENGTH = 3;
	public static final int OPTION_NONE = 0;
	public static final int OPTION_ADD = 1;
	public static final int OPTION_PRINT = 2;
	public static final int OPTION_QUIT = 3;

	public static void main(String[] args) 
	{
		int option = OPTION_NONE;
		int count = 0;
		//Create an array of Doors
		Door[] doors = new Door[LENGTH];
	
		do
		{
			count++;
			
			option = chooseOption();
			
			if (option == OPTION_ADD)
			{
				addDoors(doors);
			}
			
			else if (option == OPTION_PRINT)
			{
				addDoors(doors);
				printDoors(doors);
			}
			else if (option == OPTION_QUIT)
			{
				System.out.println("System Quitting.");
			}
		}
		while (option != OPTION_QUIT);
	
	}
	
	//Display menu to user
	//Prompt user to select an option
	//Read the option
	//Return the option
	//
	
	public static int chooseOption()
	{
		int option = OPTION_NONE;
		
		Scanner in = new Scanner (System.in);
			
		System.out.println("Would you like to : \n1. Add a Door \n2. Print the Doors \n3. Quit");
		option = in.nextInt();
		
		return (option);
		
	}
	
	public static void addDoors(Door[] doors)
	{
		Scanner in = new Scanner (System.in);
		//While the user wants to add doors
		for (int i = 0; i < doors.length ; i ++)
		{	
//		     Prompt the user to specify the name of the door 
			 System.out.println("Enter the name of the door : ");
			 String doorName = in.next();
			 
//		     Prompt the user to specify the state of the door
			 System.out.println("Enter the state of the door : ");
			 String doorState = in.next();
			 
//		     Create a door using values specified by the user
			 Door door = new Door(doorName, doorState);
			 
			//Add the door to the array
			 doors[i] = door;
			 
		}
	}
	
	public static void printDoors(Door[] doors)
	{
		     //Print the doors of the array
			    //String state = myDoor.getState();
			
			 for (int j = 0; j < doors.length; j ++)
			 {
				 String state = doors[j].getState();
				 System.out.println(state);
				 
				 String name = doors[j].getName();
				 System.out.println(name);
				 
			 }
			 
	}	
}