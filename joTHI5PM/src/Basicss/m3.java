package Basicss;

public class m3 {
	public static void main(String[] args) {
		
		m3 ob= new m3();
		ob.average();
		ob.triangle();
		
	}
	
	public void average()
	{
		int a=4;
		int b=3;
		System.out.println("Average of two numbers : "+ (a+b)/2);
	}
	
	private void triangle()
	{
		int b=3;
		int h=4;
		System.out.println("Area of triangle is "+ 0.5*b*h);
	}

	// should be created outside the main method
	// should be called inside the main method
	
	// syntax for creation:  accessmodifier returntype name(){}
	//syntax for calling :  step1: object creation:       classname objectname= new classname();
	//                                                    objectname.methodname();
}
