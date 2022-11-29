package inheritance;

public class parent {
	
	
	public static void ps()
	{
		System.out.println("parent class static method");
	}
	
	
	public void pn()
	{
		System.out.println("parent class non static method");
	}

	/*inheritance: process in which one class acquires properties of other class
	 * 
	 * parent/base/super:  class whose properties are inherited
	 * child/derived/sub : class which inheirts the properties of parent class
	 * 
	 * child is using parent class 
	 * 
	 *to achieve:   child class defintion:  extends parent class name
	 *
	 *after inheritance: child is having full control on the parent
	 *    child object=> can call all parent and child class methods
	 *    
	 * single :   parent<=> child
	 * multiple:  parent1,parent<=> child   ; java doesnot support it
	 * hierrarchial:  parent<=> child1, child2
	 * multilevel : parent<=> child<=> grandchild   * 
	 * */
}
