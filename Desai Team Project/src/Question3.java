import java.util.Scanner;

public class Question3 
{
	static Scanner in = new Scanner (System.in);
	private static int temp = 0;
	
	public static void main (String[] args)
	{
		System.out.println("What is the temperature outside?");
		temp = in.nextInt();
		
		if (temp < 40)
		{
			System.out.println("It is chilly outside.");
		}
		else if (temp >= 40 && temp <= 70)
		{
			System.out.println("It is comfortable outside.");
		}
		else if (temp >= 70 && temp <= 90)
		{
			System.out.println("It is very hot outside.");
		}
		else if (temp > 90)
		{
			System.out.println("I want to be in a cold room.");
		}
		
	}

}

