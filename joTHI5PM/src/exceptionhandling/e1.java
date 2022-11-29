package exceptionhandling;

public class e1 {

	public static void main(String[] args) {
		
		
		//exception handling :  try,catch, finally,  throw, throws
		// try:   code which is having probability of getting error
		// catch:  handle the exception, it will be executed only when error occurs
		// finally: always execute ; optional
		
		try {
			System.out.println(5/1);
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
