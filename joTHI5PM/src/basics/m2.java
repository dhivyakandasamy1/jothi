package basics;

public class m2 {
	
	public static void main(String[] args) {
		//void=> other returntypes
		
		// creation:  add return statement at the end
		//calling :   call it within sysout statement
		
		System.out.println(m2.add());
		System.out.println(m2.product());
		
	}
	
	public static int add() 
	{
		int a=4;
		int b=5;
		int R=a+b;
		return R;
	}
	
	private static double product()
	{
		double a=3.4;
		double b=3.2;
		double c=a*b;
		return c;
	}
	// syntax for creation:  accessmodifier static returntype name(){}
	//syntax for calling :  classname.methodname();

}
