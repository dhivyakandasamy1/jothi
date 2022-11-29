package SUPER;

public class child  extends parent{

	int age=90;
	
	public static void main(String[] args) {
		
		child c= new child();
		c.d();
		
	}
	
	public void d()
	{
		System.out.println(age);//locally defined age
		System.out.println(super.age);// parent's age
	}
}
