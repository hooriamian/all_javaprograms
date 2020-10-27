public class Roses 
{
	private int amount;
	private String name;
	
	public Roses()
	{
		amount = 0;
		name = "";
	}
	
	public Roses(String newName, int newAmount)
	{
		name = newName;
		amount = newAmount;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public void setAmount(int newAmount)
	{
		amount = newAmount;
		
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName (String newName)
	{
		name = newName;
	}

	public boolean equalsIgnoreCase(String searchedValue) 
	{
		return false;
	}

}
