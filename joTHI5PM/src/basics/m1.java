package basics;

public class m1 {
	
	public static void main(String[] args) {
		
		//classname.methodname();
		m1.add();
		m1.area();
		
		
	}
	
	//accessmdofier static returntype name(){}
	public static void add() 
	{
	int a=4;
	int b=5;
	System.out.println("Addition of two numbers "+ (a+b));
	}
	
	
	private static void area()
	{
		int s=4;
		System.out.println("area of square "+ s*s);
	}
	
	
	
	
	
	

}


/*method: block of code which performs certain action
 * 
 * static and nonstatic 
 *  
 *  methods should be created outside the main method, inside the class
 *  methods should be called inside the main method
 *  
 *  
 *  static :   fixed memory space , need not to allocate separate memory space fr calling it
 *  
 *  syntx for creation:   accessmdofier static returntype name(){}
 *  syntax for calling :  classname.methodname();
 *  
 *  accessmodifier:: public, private protected
 *  returntype: void, int, float, double, string, char...
 *   
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 