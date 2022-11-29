package Basicss;

public class mp {

	public static void main(String[] args) {
		
		//parameter: variable passed to a function definition
		// argument: value assigned to the parameter while calling it
		
		mp.add(5, 8);
		mp ob= new mp();
		ob.product(3.4, 4.5);
		
	}
	
	public static void add(int a, int b)
	{
		System.out.println("Addition of two numbers "+ (a+b));
	}
	
	
	public void product(double a, double b)
	{
		System.out.println("Product of two numbers "+ a*b);
	}
}
