package basics;

public class m3 {
	
	public static void main(String[] args) {
		
		//classname objectname=new classname();
		// objectname.methodname();
		
		m3 ob= new m3();
		ob.triangle();
		
	}
	
	public void triangle()
	{
		int b=4;
		int c=3;
		System.out.println("Area of triangle is "+ 0.5*b*c);
	}

}

/*non static:  doesnot contain fixed memory space
 *             we need to create separte memory space
 *             
 should be created outside the main method
 should be called inside the main methd
 
 syntax for creation:   accessmodifier returntype name(){}
 syntax for calling:    classname objectname= new classname();
                        objectname.methodname();
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
