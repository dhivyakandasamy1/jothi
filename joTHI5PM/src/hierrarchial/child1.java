package hierrarchial;

public class child1  extends parent{
public static void main(String[] args) {
	
	child1.c1s();
	child1 ob= new child1();
	ob.c1n();
	
	
	ob.pn();
	ob.ps();
	
	
	//parent<=> child1
	//parent<=> child2
}


public static void c1s()
{
	System.out.println("child class1 static method");
}


public void c1n()
{
	System.out.println("childclass1 non static method");
}
}
