package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class qu {
	public static void main(String[] args) {
		/*
		 * queue: 
		 * 
		 *     not index based
		 *     add
		 *     remove
		 *     retrieve only head of the queue
		 *     iteration
		 *     size limitation
		 *     
		 *     syntax:
		 *     
		 *     ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
* 
		 * */
		
		ArrayBlockingQueue<Double>g= new ArrayBlockingQueue<>(4);
		g.add(9.8);
		g.add(3.4);
		g.add(1.0);
		g.add(7.3);
		System.out.println(g);
		
		g.remove(7.3);
		System.out.println(g);
		
		System.out.println(g.peek());
		
		for(double x:g)
		{
			System.out.println(x);
		}
	}

}
