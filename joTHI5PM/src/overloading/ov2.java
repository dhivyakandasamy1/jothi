package overloading;

public class ov2 {

	public static void main(String[] args) {
		
		ov2 ob= new ov2();
		ob.area();
		ob.area(3);
		ob.area(2.3);
		ob.area(3, 4.3);
		ob.area(3.2, 4);
	}
	
	public  void area()//0
	{
		System.out.println("area ");
	}
	
	public  void area(int side )//1
	{
		System.out.println("area of square is  "+ side*side);
	}
	
	public void area(double r)//datatype
	{
		System.out.println("Area of circle is "+ 3.14*r*r);
	}
	
	public  void area(int s, double r)
	{
		System.out.println("area of rectangle is  "+ s*r);
	}
	
	
	public  void area(double r, int s)
	{
		System.out.println("area of triangle is  "+ 0.5*s*r);
	}

}
