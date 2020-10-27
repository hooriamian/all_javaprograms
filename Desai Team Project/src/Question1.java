import java.util.Scanner;

public class Question1 
{
	private static int x = 0;
	private static int y = 0;
	private static int sumOdd = 0;
	private static int sumEven = 0;
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter an integer x: ");
		x = in.nextInt();
		System.out.println("Enter an integer y: ");
		y = in.nextInt();
		
		
		int total = 0;
		for (int i = 1; i > x && i < y; i++)
		{
			if (i % 2 == 0)
			{
				sumEven = sumEven + i;
			}
			else
			{
				sumOdd = sumOdd + i;
			}
		} 
		
		System.out.println("Sum of odd numbers : " + sumOdd);
		System.out.println("Sum of even numbers : " + sumEven);
		
	}
}

/**
1. Write a program that takes two integer inputs from user and prints the sums of all the 
odd and even numbers between them and print them as output. 
For example, if user enter 1 and 10, the output must be” Sum of odd number: 25 Sum of Even numbers: 30”. 
You just need to use one loop for this problem. i.e. don’t create separate loops for odd and even numbers. 
**/