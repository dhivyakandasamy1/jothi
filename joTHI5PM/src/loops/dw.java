package loops;

public class dw {

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
	  
	  *
	  *syntax:
	  *
	  *initialisation
	  *do 
	  *{
	  *statement
	  *inc/dec
	  *}
	  *while(condition);
	  *
	 *10,9,8....1
	 *
	 *4,8,12,16...40
	  */
		
		int i=10;
		do
		{
			System.out.println(i);
			i=i-1;
		}while(i>=1);
	}
}
