package operators;

public class c1 {
	
	public static void main(String[] args) {
		
		//arithmetic operators :   +,-,*,/,++a, a++
		//comparision operators:   <,<,<=,>=,==,!=
		//assignment operators :   +=,-=,*=,/=
		//conditional operator :   condition ? true: false 
		// logical operators   : and, or, not
		
		
		int a=10;
		//a++ => post incrementation a++= a=a+1
		//System.out.println(a++);
	    //System.out.println(a);	
		
		//++a => pre incrementation ++a= a=1+a
		System.out.println(++a);
		
		
		
		
		
		
		
		//int age=40;
		//                 cond   ?  true   :  false 
		//System.out.println(age>18 ? "Major" : "Minor");
		// add 10 to age
		//age+=10;
		
		// sub age by 3
		//age-=3;
		
		// multiply age by 2
		//age*=2;
		
		// divide age by 2
		//age/=2;
		//System.out.println(age);
		
		/*
		 * and =>    &&
		 * 
		 * cond1   cond2   output
		 * True    True     True
		 * True    False    False
		 * False   True     False
		 * False   False    False
		 * or=> ||
		 * 
		  cond1   cond2   output
		 * True    True     True
		 * True    False    True
		 * False   True     True
		 * False   False    False
		 *  not    !
		 * True=> false
		 * false=> true 
		 * */
		/*int m=40;
		int n=3;
		
		System.out.println("AND ");
		System.out.println(m==40 && n<5);
		System.out.println(m==40 && n==5);
		System.out.println(m==0 && n<5);
		System.out.println(m==40 && n==5);
		
		System.out.println("OR ");
		System.out.println(m==40 || n<5);
		System.out.println(m==40 || n==5);
		System.out.println(m==0 || n<5);
		System.out.println(m==0 || n==5);
		
		System.out.println("Not");
		System.out.println(m==40);
		System.out.println(m!=40);*/
	}

}
