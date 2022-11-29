package collectionframework;

import java.util.Hashtable;

public class ht {

	public static void main(String[] args) {
		Hashtable<Integer,String>h= new Hashtable<>();
		h.put(1, "one");
		h.put(2, "two");
		h.put(3, "three");
		h.put(4,"four");
		System.out.println(h);
		
		//remove: key
		h.remove(4);
		System.out.println(h);
		
		//retrieval
		System.out.println(h.get(1));
		
		System.out.println(h.entrySet());
	}
}
