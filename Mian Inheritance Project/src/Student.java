
public class Student extends Person
{
	private String major;
	
	public Student()
	{
		super (); 
		major = "";
	}
		
	public Student(String name, int age, String newMajor)
	{
		super (name, age); 
		major = newMajor;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public void setMajor(String newMajor)
	{
		major = newMajor;
	}
	
	public String toString()
	{
		String aString = super.toString() + "[ Major = " + major + " ]";
		return aString;
	}

}

