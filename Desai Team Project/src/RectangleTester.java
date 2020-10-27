
public class RectangleTester 
{
	public static void main (String[] args)
	{
		Rectangle r = new Rectangle();
		
		r.setLength(4);
		r.setWidth(3);
		
		double perimeter = r.getPerimeter();
		
		double area = r.getArea();
		
		System.out.println("Perimeter : " + perimeter + "\nArea : " + area);
		
		Rectangle r1 = new Rectangle();
		
		r1.setLength(10);
		r1.setWidth(5);
		
		perimeter = r1.getPerimeter();
		
		area = r1.getArea();
				
		System.out.println("Perimeter : " + perimeter + "\nArea : " + area);	
	}

}
