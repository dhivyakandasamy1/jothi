package builtinclasses;

public class st {
	public static void main(String[] args) {
		//String=> datatype and class
		// non statc in nature
		//n=> object and variable
		String n="Welcome";
		System.out.println(n.length());
		//   0   1   2    3   4    5     6
		//   W   e   l    c   o    m     e
		//find index of character 
		System.out.println(n.indexOf('c'));
		// find character present at a particular index
		System.out.println(n.charAt(2));
		
		System.out.println(n.toLowerCase());
		System.out.println(n.toLowerCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('e', 'i'));
		System.out.println(n.replace("come", "go"));
		
		System.out.println(n.contains("po"));
		
		System.out.println(n.isEmpty());
		
		System.out.println(n.substring(3, 6));//3,4,5
		
		
	}

}
