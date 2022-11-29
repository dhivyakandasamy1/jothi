package testngattrib;

import org.testng.annotations.Test;

public class t1 {

	/*Testng => Test Next generation
	 * 
	 *      testing framework
	 *      run the test cases
	 *      reports will be generated
	 *      parallel, parameterisation
	 * 
	 * test case:
	 *      nonstatic 
	 *      @Test
	 *      default order: alphabetical order* 
	 * 
	 *      priority:  run the test case in a particular order
	 *      description:  adding short note on test case 
	 *      invocation count: run the same test case for multiple time 
	 *      groups
	 *      enabled=false => disable/ignoring 
	 *      timeout= fix timelimit for test case 
	 * */
	
	@Test(priority=0,description="First tst case ",invocationCount=5,groups="P", enabled=false)
	public void t1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="second test case",groups="P")
	public void t2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2, description="third test case",groups="Q")
	public void ab()
	{
		System.out.println("Test case 3");
	}
}
