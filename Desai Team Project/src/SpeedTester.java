import java.util.Scanner;

public class SpeedTester 
{
	static Scanner in = new Scanner (System.in);
	private static double input;
	
	public static void main(String[] args) 
	{
		Speed speed = new Speed();
		
		System.out.println("How fast is your car going?");
		input = in.nextDouble();
		
		speed.setSpeed(input);
		double totalSpeed = speed.getSpeed();
		
		if (totalSpeed <= 30)
		{
			System.out.println("You are driving a bit slow.");
		}
		else if (totalSpeed > 30 && input <= 65)
		{
			System.out.println("You are driving a bit fast.");
		}
		else if (totalSpeed > 65)
		{
			System.out.println("Slow down or you will eventually get pulled over!");
		}

	}

}
/**
 * Speed: Write a program that asks the user how fast his/her car was going. 
 * Create getter and setter methods for the speed and provide a tester class to see the results.
 * If the speed is less than or equal to 30, print out “You are driving a bit slow.” 
 * If the speed is above 30 and less than or equal to 65, print out “You are driving a bit fast.” 
 * If the speed is above 65, print out “Slow down or you will eventually get pulled over!” (20 points)
 */