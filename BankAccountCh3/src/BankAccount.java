public class BankAccount
{
	private double balance;
	private String firstName;
	private String lastName;
	
	public BankAccount()
	{
		balance = 0;
		firstName = "";
		lastName = "";
	}
	
	public BankAccount(double amount, String newFirstName, String newLastName)
	{
		this.balance = amount;
		this.firstName = newFirstName;
		this.lastName = newLastName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double newBalance)
	{
		balance = newBalance;
		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName (String newFirstName)
	{
		firstName = newFirstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName (String newLastName)
	{
		lastName = newLastName;
	}
	
	public void deposit (double amount)
	{
		balance = balance + amount;
	}
	
	public void withdrawal(double amount)
	{
		balance = balance - amount;
	}

}