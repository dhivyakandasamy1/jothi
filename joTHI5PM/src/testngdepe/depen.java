package testngdepe;

import org.testng.annotations.Test;

public class depen {

	//dependsOnGroup: create connection between group and test case 
	@Test(priority=0,groups="U")
	public void a()
	{
		System.out.println("a");
	}
	@Test(priority=1,groups="U")
	public void b()
	{

		System.out.println("b");
	}
	
	@Test(priority=2,groups="U")
	public void c()
	{

		System.out.println("c");
	}
	
	@Test(priority=3, dependsOnGroups="U")
	public void def()
	{
		System.out.println("def");
	}
	
	//groups: U- a,b,c  : pass       def: pass
	// even if 1 fails               def : skipped 
}
