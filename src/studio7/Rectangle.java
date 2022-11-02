package studio7;

public class Rectangle {

	public double width, length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double area()
	{
	return this.width*this.length;		
	}

	public double perimeter()
	{
	return (2*this.width)+(2*this.length);		
	}

	public boolean square()
	{
		if (this.length == this.width)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
	
	public boolean bigger(Rectangle r)
	{
		if (this.area() < r.area()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double width = 1;
		double length = 4;
		Rectangle a = new Rectangle(width,length);
		Rectangle b = new Rectangle(width,length);
		System.out.println(a.area());
		System.out.println(a.perimeter());
		System.out.println(a.square());	
		System.out.println(a.square());
	}

}
