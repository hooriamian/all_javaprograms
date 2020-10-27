// create a bank account
// set the balance to 100
// get the balance of the bank account
// print the balance

public class TestBankAccount
{
	public static void main(String[] args)
	{
		//create a bank account
		BankAccount myBankAccount = new BankAccount();
		BankAccount yourBankAccount = new BankAccount(200, "Jan", "Rohn");
		BankAccount anotherBankAccount = new BankAccount (150.00, "Tom", "Brady");
		BankAccount bankAccount4 = new BankAccount (100.00, "Hooria", "Mian");
		
		//set the balance to 100
		myBankAccount.setBalance(100.00);
		
		
		//get the balance of the bank account
		double accountBalance = myBankAccount.getBalance();
		
		
		//print the balance
		System.out.println("The amount of balance in the account is : " + accountBalance);
		
		System.out.println("The balance in account 4 is : " + bankAccount4.getBalance());

	}
}