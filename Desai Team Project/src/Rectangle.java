
public class Rectangle 
{
	private double l;
	private double w;
	
	public Rectangle()
	{
		l = 0.0;
		w = 0.0;
	}
	
	public void length (double length)
	{
		l = length;
	}
	
	public double getLength()
	{
		return l;
	}
	
	public void setLength(double newLength)
	{
		l = newLength;
	}
	
	public double getWidth()
	{
		return w;
	}
	
	public void setWidth(double newWidth)
	{
		w = newWidth;
	}
	
	public double getPerimeter()
	{
		double perimeter = (2 * l) + (2 * w);
		
		if (perimeter >= 20)
		{
			System.out.println("It is a big rectangle.");
		}
		else 
		{
			System.out.println("It is a small rectangle.");

		}
		
		return perimeter;
	}
	
	public double getArea()
	{
		double area = l * w;
		
		if (area >= 40)
		{
			System.out.println("It is a big rectangle.");
		}
		else 
		{
			System.out.println("It is a small rectangle.");

		}
		
		return area;
	}
	
}
/**
After calculating the perimeter and area, find out if the perimeter is greater than or equal to 20 and 
if the area is greater than or equal to 40. If so, print out “It is a big rectangle”, 
else print out “It is a small rectangle.” Use a tester class to print out the results. (20 points)
 */