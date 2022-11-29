package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class lis {
	
	public static void main(String[] args) {
		
		//collectionframework:  large amount of data under a single name
		
		// list, set, map, queue, hashtable
		
		/*
		 * list 
		 *    index based
		 *    add
		 *    remove
		 *    retrieve
		 *    iterate 
		 *    
		 *    syntax:
		 *    ArrayList<Datatype> name= new ArrayList<>();
		 *    int => Integer
		 *    String=> String
		 *    float=> Float
		 *    double=> Double * 
		 * */
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(80);
		l.add(8);
		l.add(30);
		l.add(10);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		//   0    1    2    3  
		//   80   8    30  10
		// remove an element : know the index 
		l.remove(2);
		System.out.println(l);
        // retrieval : know the index
		System.out.println(l.get(1));
		
		// iteration:  
		//for each/enhanced for loop:     for(datatype tempvariable: namefclction){}
		
		for(int x: l)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
	}

}
