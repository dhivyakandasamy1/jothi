package collectionframework;

import java.util.TreeMap;

public class m2 {
	public static void main(String[] args) {
		TreeMap<Integer,String>t= new TreeMap<>();
		t.put(400, "ant");
		t.put(0, "banana");
		t.put(9, "cat");
		t.put(100, "dog");
		System.out.println(t);
		//removal: know the key
		t.remove(100);
		System.out.println(t);
		// retrieval: know the key
		System.out.println(t.get(0));
		System.out.println(t.keySet());//[0, 9, 400]
		//iterate through the keyset, during iteration 
		// fetch the value
		for(int x: t.keySet())
		{
			System.out.println(x+":"+ t.get(x));
		}
		//  first   x=0     0:t.get(0)   0:banana
		//second    x=9     9:t.get(9)   9:cat
		//third    x=400   100:t.get(100)  100:dog
		
		
	}

}
