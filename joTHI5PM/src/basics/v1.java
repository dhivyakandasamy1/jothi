package basics;

public class v1 {
public static void main(String[] args) {
	//variable: name given to a memry location
	//syntax: datatype variablename=value;
	
	/*
	 * word  :  string
	 * alphabet: char
	 * number  : int, float, double
	 *           double: store upto 16 digits after decimal point
	 *           float : store upto 8 digits after decimal point, add f at the end
	 *           
	 *true/flase:  boolean
	 * * 
	 * */
	
	//datatype variablename=value;
	String n="Dhivya";
	char letter='k';
	int age=30;
	double height=152.3;
	float weight=63.1f;
	boolean result=true;
	System.out.println("NAme is "+ n);
	System.out.println("Letter is "+ letter);
	System.out.println("Age is "+age);
	System.out.println("Height is "+ height);
	System.out.println("Weight is "+weight);
	System.out.println("REsult is "+ result);
	
	//area of square: side*side
	//average of two numbers: (a+b)/2
	//perimeter of square: 4*side
	//addition of three numebrs: a+b+c 
	//area of circle: 3.14*r*r
	int e=3;
	System.out.println("area of circle is "+ 3.14*e*e);
	
	int s=3;
	System.out.println("Area of square is "+ s*s);
	
	double a=3.4;
	double b=2.3;
	System.out.println("average of two numbers "+ (a+b)/2);
	
	int side=4;
	System.out.println("Perimeter f square "+ 4*side);
	
	int m=4;
	int r=3;
	int o=2;
	System.out.println("Addition of three numbers "+ (m+r+o));
	m1.add();
	//m1.area();
}
}
