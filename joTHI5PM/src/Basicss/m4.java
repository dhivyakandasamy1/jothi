package Basicss;

public class m4 {

	public static void main(String[] args) {
		//returntype other than void=> add return statement at the end
		// call method within sysout statement 
		
		m4 ob= new m4();
		System.out.println(ob.add());
		System.out.println(ob.product());
		
	}
	
	public int add()
	{
		int a=4;
		int b=5;
		int c=a+b;
		return c;
	}
	
	private double product()
	{
		double a=4.5;
		double b=2.3;
		double c=a*b;
		return c;
	}
}
