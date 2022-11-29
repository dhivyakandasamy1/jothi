package exceptionhandling;

import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		//creating own exception when particular condition met 
		//throw new ExceptionClass("message")
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("major");
		}
		else
		{
			throw new ArithmeticException("Cannot vote");
		}
		
	}
}
