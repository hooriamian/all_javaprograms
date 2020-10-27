
public class Instructor extends Person
{
	private double salary;
	
	public Instructor()
	{
		super (); 
		salary = 0;
	}
	
	
	public Instructor(String name, int age, double newSalary)
	{
		super (name, age); 
		salary = newSalary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary (double newSalary)
	{
		salary = newSalary;
		
	}
	
	public String toString()
	{
		String aString = super.toString() + "[ Salary = " + salary + " ]";
		return aString;
	}

}
