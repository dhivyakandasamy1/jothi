package INTERFACEE;

public class Demo implements intro{

	public static void main(String[] args) {
		
		Demo d= new Demo();
		d.ab();//calling abstract method
		d.nm();//calling default method
		
	}

	@Override
	public void ab() {
		System.out.println("abstract method");
		
	}
}
