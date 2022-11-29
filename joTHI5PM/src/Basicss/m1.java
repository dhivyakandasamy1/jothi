package Basicss;

public class m1 {
	public static void main(String[] args) {
		
		//classname.methondname();
		m1.area();
		m1.add();
		
	}
	
	public static void area()
	{
		int s=4;
		System.out.println("Area of square is "+ s*s);
	}
	
	
	private static void add()
	{
		float a=9.4f;
		float b=3.2f;
		System.out.println("Addition : "+ (a+b));
	}
	

}
/*method: block of code which performs certain action
 * 
 * should be created outside the  main method
 * should be called inside the main method
 * 
 * static:  fixed memory space
 * 
 * syntax for creation:  accessmodifier static returntype name(){}
 * syntax for calling :  classname.methodname();
 * 
 * accessmodifier :  public, private, protected
 * returntype  :    int, float, double, string, void 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 