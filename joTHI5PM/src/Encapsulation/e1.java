package Encapsulation;

public class e1 {

	/*encapsulation:   data hiding 
	 * 
	 *         does not follow inheritance
	 *         to achieve:
	 *             declare the variable as private 
	 *             must not assign value straightly to the variable
	 *             
	 *             access the variable through setters and getters
	 *                setters:  assign value to the variable
	 *                getters:  view the value stored in the variable
	 *                
	 *                setters and getters: non static, public in nature 
	 * * 
	 * */
	private String password;
	
	//setters
	
	public void setp(String p)
	{
		password=p;
	}
	
	//getters
	public void getp()
	{
		System.out.println(password);
	}
}
