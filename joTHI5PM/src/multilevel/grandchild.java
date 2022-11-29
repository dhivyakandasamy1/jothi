package multilevel;

public class grandchild extends child{

	public static void main(String[] args) {
		
		//parent<=> child <=> grandchild
		
		grandchild.gs();
		grandchild g= new grandchild();
		g.gn();
		
		//calling child mehtods
		
		g.cn();
		g.cs();
		
		//calling parent methods
		g.pn();
		g.ps();
		
	}
	
	public static void gs()
	{
		System.out.println("grandchild static method");
	}


	public void gn()
	{
		System.out.println("grandchild non static method");
	}
}
