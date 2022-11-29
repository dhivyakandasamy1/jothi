package loops;

public class w {
public static void main(String[] args) {
	/*
	 * while/for/do while
	 * 
	 * 
	 * initialisation: where to start
	 * 
	 * condition checking:  where to stop
	 *  
	 *                 forward:  <=end value
	 *                 backward: >=end value
	 *       
	  inc/dec  :   difference between two numbers
	  
	  syntax:
	  
	  initialisation
	  while(condition)
	  {
	  statement
	  inc/de
	  }
	 * 
	 * 
	 *even numbers : 20 22,24,26,28,30
	 *  
	 *  1,2,3,4,5
	 * */
	int i=20;
	while(i<=30)
	{
		System.out.println(i);
		i=i+2;
	}
}
}
