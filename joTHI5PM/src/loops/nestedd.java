package loops;

public class nestedd {
	public static void main(String[] args) {
		/*
		 * if(cod1)
		 * {
		 * cond1 true
		 * }
		 * else if(cond2)
		 * {
		 * cond2 true
		 * }
		 * else if(cond3)
		 * {
		 * cond3 true
		 * }
		 * else
		 * {
		 * false
		 * }
		 * 
		 * */
		int age=18;
		if(age<18)
		{
			System.out.println("minor");
		}
		
		else if(age>18)
		{
			System.out.println("major");
		}
		
		else
		{
			System.out.println("age is 18");
		}
		
	}

}
