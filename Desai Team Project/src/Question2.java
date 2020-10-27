import java.util.Scanner;
public class Question2 
{
	private static String answer1 = "";
	private static String answer2 = "";
	private static String answer3 = "";
	private static String answer4 = "";
	private static String answer5 = "";
	private static int count = 0;
	private static int count1 = 0;
	static Scanner in = new Scanner (System.in);
	
	public static void main (String[] args)
	{
		//do
		//{
			//count ++;
		System.out.print("What language are you currently writing in? \nA. CSS \nB. Java \nC. HTML \nD. C++ \nYour Answer : ");
		answer1 = in.next();
		
		if (answer1.equalsIgnoreCase("B"))
		{
			System.out.println("Correct Answer!");
			count ++;
		}
		else
		{
			System.out.println("Incorrect Answer.");
			count1 ++;
		}
		//}
		//while (!answer1.equalsIgnoreCase("B"));
		
		System.out.println("Who is the latest champion of the Superbowl? \nA. Philadelphia Eagles \nB. Dallas Cowboys \nC. Seattle Seahawks \nD. New England Patriots \nYour Answer : ");
		answer2 = in.next();
		
		if (answer2.equalsIgnoreCase("A"))
		{
			System.out.println("Correct Answer!");
			count ++;
		}
		else
		{
			System.out.println("Incorrect Answer.");
			count1 ++;
		}
		
		System.out.println("Which national team won the 2014 FIFA World Cup? \nA. Chile \nB. England \nC. France \nD. Germany \nYour Answer : ");
		answer3 = in.next();
		
		if (answer3.equalsIgnoreCase("D"))
		{
			System.out.println("Correct Answer!");
			count ++;
		}
		else
		{
			System.out.println("Incorrect Answer.");
			count1 ++;
		}
		
		System.out.println("Who is the President of the United States? \nA. Barack Obama \nB. Oprah \nC. Donald Trump \nD. Hillary Clinton \nYour Answer : ");
		answer4 = in.next();
		
		if (answer4.equalsIgnoreCase("C"))
		{
			System.out.println("Correct Answer!");
			count ++;
		}
		else
		{
			System.out.println("Incorrect Answer.");
			count1 ++;
		}
		
		System.out.println("Who is the founder of Apple? \nA. Bob Marley \nB. Steve Jobs \nC. Bill Gates \nD. Mark Zuckerberg \nYour Answer : ");
		answer5 = in.next();
		
		if (answer5.equalsIgnoreCase("B"))
		{
			System.out.println("Correct Answer!");
			count ++;
		}
		else
		{
			System.out.println("Incorrect Answer.");
			count1 ++;
		}
				
		System.out.println("Number of Correct Answers : " + count);
		
		System.out.println("Number of Incorrect Answers : " + count1);
		
		int totalScore = count / 5;
		totalScore = totalScore * 100;
				
		System.out.println("Total Score : " + totalScore + "%");
		
	}

}
