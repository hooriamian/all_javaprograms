
public class Person 
{
	private static String name;
	private static int age;
	
	public Person()
	{
		name = "";
		age = 0;
	}
	
	public Person(String newName, int newAge)
	{
		name = newName;
		age = newAge;
	}
	
	public String getName()
	{   
	      return name;
	}
	
	public void setName(String newName)
	{   
	      name = newName;
	}
	
	public static int getAge()
	{
		return age;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	 public String toString()
	   {
		   String aString = getClass().getName() + " [ Person = " + name + " , " + age + " ]";
		   return aString;
	   }

}

/** A person has a name and a year of birth.

A student has a major.

An instructor has a salary. 

All instance variables should be private.

Write class declarations, constructors, and toString methods for all classes.

The constructor and toString methods of the sub-class should not use the get and set methods of the superclass.

Supply a test program that tests these classes and methods. Use the algorithm in the attached file in main().

In addition, provide accessors and mutators (getters and setters) for the instance variables in the classes.

Submit a UML class diagram for each class, and another UML diagram (which may be on paper) that shows the inheritance hierarchy for the classes.

Be sure that your UML diagram uses the correct arrows,  especially if you are using Word.
**/

