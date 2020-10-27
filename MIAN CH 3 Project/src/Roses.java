//MIAN
/*UML Diagram

Roses
-----------------
- amount : double
- colors : int
- name : String
-----------------
+ newRoses (newRoses : double) : void
+ rosesBought (rosesBought : double) : void
+ getName() : String
+ setName (newLastName : String) : void
+ getColors() : int
+ setColors (newColors : String) : void
+ getAmount () : double
+ setAmount (newBalance : double) : void
+ Roses (newAmount : double, newColors : int, newName : String)
+ Roses()

-----------------

*/

public class Roses 
{
	private double amount;
	private int colors;
	private String name;
	
	public Roses()
	{
		amount = 0.0;
		colors = 0;
		name = "";
	}
	
	public Roses(double newAmount, int newColors, String newName)
	{
		amount = newAmount;
		colors = newColors;
		name = newName;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double newAmount)
	{
		amount = newAmount;
		
	}
	
	public int getColors()
	{
		return colors;
	}
	
	public void setColors (int newColors)
	{
		colors = newColors;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName (String newName)
	{
		name = newName;
	}
	
	public void newRoses (double newRoses)
	{
		amount = amount + newRoses;
	}
	
	public void rosesBought(double rosesBought)
	{
		amount = amount - rosesBought;
	}
}
