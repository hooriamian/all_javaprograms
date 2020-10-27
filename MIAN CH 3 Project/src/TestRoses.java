//Initiate object called myRoses with no parameters.
//Create another object called yourRoses with three parameters.
//Set an amount to the object myRoses.
//Set an amount of colors to the object myRoses.
//Set a name to the object myRoses.
//Get the new name of the object myRoses and store it in a variable called name.
//Get the new amount of roses and set to a variable called roses.
//Get new amount of colors and set to colors.
//Get name of object yourRoses according to the parameter.
//Get amount of roses from yourRoses.
//Get colors from yourRoses.
//Print the name, amount of roses, and number of colors of the object myRoses.
//Print the name, amount of roses, and number of colors of the object yourRoses.
//Give away roses from object yourRoses.
//Get new amount of roses and store it in a variable called newRoses1.
//Print the updated amount of roses.
//Set a new amount of roses to yourRoses.
//Set new amount of colors to yourRoses.
//Set a new name to yourRoses.
//Get the new amount of yourRoses and store in a variable called newRoses.
//Get the new name of yourRoses and store in a variable called newName.
//Get the new colors of yourRoses and store in a variable called newColors.
//Print the new name, amount of roses, and color of the object yourRoses.


public class TestRoses 
{

	public static void main(String[] args) 
	{
		Roses myRoses = new Roses();
		Roses yourRoses = new Roses(30, 2, "Rohn");
		
		myRoses.setAmount(20);
		myRoses.setColors(3);
		myRoses.setName("Hooria");
		
		String name = myRoses.getName();
		double roses = myRoses.getAmount();
		int colors = myRoses.getColors();
		
		String name1 = yourRoses.getName();
		double roses1 = yourRoses.getAmount();
		int colors1 = yourRoses.getColors();
		
		System.out.println("The total amount of roses " + name + " receives are : " + roses + " in " + colors + " different colors(s).");
		System.out.println("The total amount of roses " + name1 + " receives is : " + roses1 + " in " + colors1 + " different color(s).");
		
		yourRoses.rosesBought(10);
		
		double newRoses1 = yourRoses.getAmount();
		
		System.out.println("After the purchase, Rohn has " + newRoses1 + " left.");
		
		yourRoses.setAmount(10);
		yourRoses.setColors(3);
		yourRoses.setName("Jan");
		
		String newName = yourRoses.getName();
		double newRoses = yourRoses.getAmount();
		int newColors = yourRoses.getColors();
		
		System.out.println("The NEW total amount of roses " + newName + " receives is : " + newRoses + " in " + newColors + " different color(s).");


	}

}
