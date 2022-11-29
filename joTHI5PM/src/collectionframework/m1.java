package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {
public static void main(String[] args) {
	
	/*map:  container : elements will be stored along with its key
	 * 
	 * add
	 * remove
	 * retrieve
	 * iterate
	 * 
	 * TreeMap          : keys : alphabetical order/ascending order
	 * Hashmap          : keys : unpredictable order
	 * LinkedHashMap    : keys : insertion order
	 * 
	 *TreeMap<dtypeofkey,dtypefelement> name= new TreeMap<>();
	 * 
* 
	 * */
	
	TreeMap<Integer,String>t= new TreeMap<>();
	t.put(400, "ant");
	t.put(0, "banana");
	t.put(9, "cat");
	t.put(100, "dog");
	System.out.println(t);
	
	LinkedHashMap<Integer,String>t1= new LinkedHashMap<>();
	t1.put(400, "ant");
	t1.put(0, "banana");
	t1.put(9, "cat");
	t1.put(100, "dog");
	System.out.println(t1);
	
	HashMap<Integer,String>t2= new HashMap<>();
	t2.put(400, "ant");
	t2.put(0, "banana");
	t2.put(9, "cat");
	t2.put(100, "dog");
	System.out.println(t2);
	
	
}}