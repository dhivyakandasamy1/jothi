package abstraction;

public class child extends parent{

	public static void main(String[] args) {
		
		child c= new child();
		c.ab();//calling abstract method
		c.n();//calling nrml mehtod
		//parent p= new parent();  cannot create object for abstract class 
		
	}

	@Override
	public void ab() {
		int s=4;
		System.out.println("Area of square is "+ s*s);
	}
}
