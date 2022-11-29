package collectionframework;

import java.util.TreeSet;

public class s2 {
	public static void main(String[] args) {
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(80);
		t.add(3);
		t.add(20);
		t.add(90);
		System.out.println(t);
		
		// remove
		t.remove(20);
		System.out.println(t);
		
		for(int x:t)
		{
			System.out.println(x);
		}
	}

}
