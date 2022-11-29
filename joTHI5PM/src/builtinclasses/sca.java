package builtinclasses;

import java.util.Scanner;

public class sca {
	public static void main(String[] args) {
		
		//SCanner => get input from the user at run time
		// non static in nature
		//integer=> nextInt()
		//String=> nextLine()
		//double=> nextDouble()
		//boolean=> nextBoolean()
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		System.out.println("Enter your salary :");
		double sal=sc.nextDouble();
		
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Salary is "+ sal);
	}

}
