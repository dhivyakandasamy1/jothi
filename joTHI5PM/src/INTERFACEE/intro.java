package INTERFACEE;

public interface intro {
	
	/*interface : blue print of class
	 * 
	 * non static methods , default keyword before it
	 * doesnot contain static methd
	 * doesnot contain main methd
	 * have abstract method
	 *            non static
	 *            will be empty 
	 *            wull be redefined in the class to which interface connects 
	 * 
	 * class<=> class  : extends
	 * class<=> interface:  implements keyword
	 * 
	 *     class definition:  implements interfacename
	 * 
	 * */
	//non static method
	default public void nm()
	{
		System.out.println("non static method");
	}
	
	// abstract method
	public void ab();

}
