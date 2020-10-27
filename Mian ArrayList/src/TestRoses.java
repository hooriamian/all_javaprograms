import java.util.ArrayList;
import java.util.Scanner;
public class TestRoses 
{
	private static int currentSize = 0;
	public static final int LENGTH = 3;
	public static final int OPTION_NONE = 0;
	public static final int OPTION_ADD = 1;
	public static final int OPTION_PRINT = 2;
	public static final int OPTION_SEARCH = 3;
	public static final int OPTION_QUIT = 4;
	static int i = 0;
	
	public static void main(String[] args) 
	{
		int option = OPTION_NONE;
		int count = 0;
		
		ArrayList <Roses> rose = new ArrayList<Roses>();
		
		do
		{
			count++;
			
			option = chooseOption();
			
			if (option == OPTION_ADD)
			{
				addRose(rose);
			}
			
			else if (option == OPTION_PRINT)
			{
					printRose(rose);
			}
			else if (option == OPTION_QUIT)
			{
				System.out.println("System Quitting. Have a nice day!");
			}
			else if (option == OPTION_SEARCH)
			{
				searchRose(rose);
			}
			else
			{
				System.out.println("ERROR: Please enter a valid option.");
			}
			
		}
		while (option != OPTION_QUIT);
	
	}
	
	public static int chooseOption()
	{
		int option = OPTION_NONE;
		
		Scanner in = new Scanner (System.in);
			
		System.out.println("\n Would you like to : \n1. Add a Rose Order \n2. Print the Orders \n3. Search an Order by Name \n4. Quit");
		option = in.nextInt();
		
		return (option);
		
	}
	
	public static void addRose(ArrayList <Roses> rose)
	{	
		int amount; 
		String name;
		
		Scanner in = new Scanner (System.in);
		
		for (int i = 0; i < rose.size() ; i ++)
		{
			System.out.println("Enter your name : ");
			name = in.next();
	
			System.out.println("Enter the Amount of Roses : ");
			amount = in.nextInt();
			
			Roses myrose = new Roses (name, amount);
			
			rose.add(myrose);
		}
		
	}
	
	public static void printRose(ArrayList <Roses> rose)
	{
			 for (int j = 0; j < rose.size(); j ++)
			 {
				 Roses aRose = rose.get(j);
				 
				 //String state = doors[j].getState();
				 String name = aRose.getName();
				 System.out.println(name);
				 
				 //String name = doors[j].getName();
				 int amount = aRose.getAmount();
				 System.out.println(amount);
				 
			 }
			 
	}
	
	public static void searchRose(ArrayList <Roses> rose)
	{
		String searchedValue;
		int pos = 0;
		boolean found = false;
		String option;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter Name of Order : ");
		searchedValue = in.next();
		
		while (pos < rose.size() && !found) 
		{	
			Roses myRose = rose.get(pos);
			String ordername = myRose.getName();
			
			if (ordername.equalsIgnoreCase(searchedValue))
			{
				found = true;
			}
			else
			{
				pos++;
			}
		}
		if (found)
		{
			System.out.println("Found at position : " + pos);
			System.out.println("Would you like to delete this item? \nY for Yes \nN for No.");
			option = in.next();
			
			if (option.equalsIgnoreCase("Y"))
			{
				rose.remove(pos);
				
				System.out.println("Item Deleted.");
			}
			else if (option.equalsIgnoreCase("N"))
			{
				System.out.println("Please continue.");
			}
			else
			{
				System.out.println("Input Error.");
			}
		}
		else
		{
			System.out.println("Error. Not found.");
		}
	}

}