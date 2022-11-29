package exceptionhandling;

public class e2 {
public static void main(String[] args) {
	try {
		//System.out.println(5/0);
		String n="hi";
		System.out.println(n.charAt(3));
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("arithmetic");
	}
	
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String out of bound");
	}
	
	catch(Exception e)
	{
		System.out.println("ERROR");
	}
	
	finally {
		System.out.println("welcome");
	}

}
}
