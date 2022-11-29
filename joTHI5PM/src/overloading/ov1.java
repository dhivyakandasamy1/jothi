package overloading;

public class ov1 {
	public static void main(String[] args) {
		
		//overloading:   using same name for different purpose
		//               showing difference in number /datatype/sequence
		
		ov1.area();
		ov1.area(3);
		ov1.area(3.1);
		ov1.area(3, 4.5);
		ov1.area(3.2, 40);
	}
	
	public static void area()//0
	{
		System.out.println("area ");
	}
	
	public static void area(int side )//1
	{
		System.out.println("area of square is  "+ side*side);
	}
	
	public static void area(double r)//datatype
	{
		System.out.println("Area of circle is "+ 3.14*r*r);
	}
	
	public static void area(int s, double r)
	{
		System.out.println("area of rectangle is  "+ s*r);
	}
	
	
	public static void area(double r, int s)
	{
		System.out.println("area of triangle is  "+ 0.5*s*r);
	}

}
