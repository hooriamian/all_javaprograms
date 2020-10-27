
public class PersonTester 
{
	public static final int LENGTH = 3;

	public static void main(String[] args)
	   {
		
		//Create an instance of the Person class with no parameters - change variables
		
		  Person person = new Person();
		  person.setName("John");
		  person.setAge(25);
		  System.out.println(person);
		  
		//Create an instance of the Instructor class with no parameters - change variables
		
		  Instructor instructor = new Instructor();
		  instructor.setName("Prof");
		  instructor.setAge(40);
		  instructor.setSalary(53000.00);		  
		  System.out.println(instructor);
		 
		  
		  System.out.println("***TEST***");
		  System.out.println(person);
		  System.out.println(instructor);
		  
		//Create an instance of the Student class with no parameters - change variables
		  
		  System.out.println("***NEW OBJECT***");
		  Student student = new Student();
		  student.setName("Hooria");
		  student.setAge(19);
		  student.setMajor("Computer Science");
		  System.out.println(student);

		 
		  
		//Create an instance of the Person class using a constructor with parameters
		//Use accessor methods of class to get variables of the object, including inherited
		  
		  Person person2 = new Person("Person2" , 35);
		  System.out.println(person2);
		  
		//Create an instance of the Instructor class using a constructor with parameters
		//Use accessor methods of class to get variables of the object, including inherited
		  
		  Instructor instructor2 = new Instructor("Instructor2", 55, 45000);
		  System.out.println(instructor2);
		  
		//Create an instance of the Student class using a constructor with parameters
		//Use accessor methods of class to get variables of the object, including inherited
		  
		  Student student2 = new Student("Student2", 20, "IT");
		  System.out.println(student2);
		  

		//Create an array of type Person; add a Person, Instructor, and Student object to the array
		  
		  System.out.println("***ARRAY***");
		  
		  
		  Person[] personArray = new Person[LENGTH];
		  
		  personArray[0] = person;
		  personArray[1] = student;
		  personArray[2] = instructor;
		  
		//Use a for loop to process each element of the array
		  
		  for (int i = 0; i < personArray.length ; i ++)
			{

			  System.out.println(personArray[i]);

			}
		  
		//For each element of array, use toString method to print variables of the object
		  
	   }

}
