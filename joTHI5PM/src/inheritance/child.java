package inheritance;

public class child extends parent{

	
	public static void main(String[] args) {
		
		//calling its own methods
		
		child.cs();
		child c= new child();
		c.cn();
		
		//after inheritance: child s having full control on the parent
		c.pn();
		c.ps();
	}
	

	public static void cs()
	{
		System.out.println("child class static method");
	}
	
	
	public void cn()
	{
		System.out.println("child class non static method");
	}
}
