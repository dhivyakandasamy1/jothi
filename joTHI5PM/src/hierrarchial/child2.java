package hierrarchial;

public class child2 extends parent{

	public static void main(String[] args) {
		child2.c2s();
		child2 ob=new child2();
		ob.c2n();
		
		//calling parent methods
		ob.pn();
		ob.ps();
		
	}
	
	public static void c2s()
	{
		System.out.println("child class2 static method");
	}


	public void c2n()
	{
		System.out.println("childclass2 non static method");
	}
}
