package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
	public static void main(String[] args) {
		
		/*set
		 *   not indexed
		 *   add
		 *   remove
		 *   retrieval is not possible
		 *   iterate through the elements
		 *   
		 *   treeset       :      alphabetical/ascending order
		 *   linkedhashset :      insertion order
		 *   hashset       :      unpredictable order
		 * * 
		 * */
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(80);
		t.add(3);
		t.add(20);
		t.add(90);
		System.out.println(t);
		
		
		LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(80);
		t1.add(3);
		t1.add(20);
		t1.add(90);
		System.out.println(t1);
		
		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(80);
		t11.add(3);
		t11.add(20);
		t11.add(90);
		System.out.println(t11);
	}

}
