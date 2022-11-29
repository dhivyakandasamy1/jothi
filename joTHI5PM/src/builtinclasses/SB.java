package builtinclasses;

public class SB {
	public static void main(String[] args) {
		
		StringBuffer s= new StringBuffer("Welcome");
		//index    0   1   2   3    4    5    6
		//letter   W   e   l   c    o    m    e
		System.out.println(s.length());
		System.out.println(s.indexOf("e"));
		System.out.println(s.charAt(2));
		//insert
		System.out.println(s.insert(2, "z"));
		// append
		System.out.println(s.append("bye"));
		// delete
		System.out.println(s.deleteCharAt(2));
		System.out.println(s.delete(7, 10));
		//reversing
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		
		System.out.println(s.replace(3, 7, "go"));
		
		System.out.println(s+ "hi");
		
		
	}

}
