package overloading;

public class cons {
	public static void main(String[] args) {
		cons ob= new cons();
		cons ob1= new cons(4);
		cons ob2= new cons(3.4);
		cons ob3= new cons(2,4.5);
		cons ob4= new cons(1.4,9);
	}
	
	// number/datatype/sequeunce
	
	
	public cons()
	{
		System.out.println("im a constructor");
	}
	
	public cons(int s)
	{
		System.out.println("Area of square is "+ s*s);
	}
	
	public cons(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	
	public cons(int l, double b)
	{
		System.out.println("area of rectangle is "+ l*b);
	}
	
	public cons(double b, int l)
	{
		System.out.println("area of triaangle is "+ 0.5*l*b);
	}
	
	

}
