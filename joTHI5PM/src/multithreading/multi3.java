package multithreading;

public class multi3 {
	public static void main(String[] args) {
		
	//creating a single thread and single task
	Thread t1=new Thread(){  
	    public void run(){  
	      System.out.println("FIRST Task");  
	    }  
	  }; 
	  //createing a single thread and single task
	  // 2 threads<=> 2 tasks 
	  Thread t2=new Thread(){  
	    public void run(){  
	      System.out.println("Second TASK");  
	    }  
	  };  
	  
	  
	  t1.start();// calling a task1 with thread 1  
	  t2.start(); //calling a task2 with thread 2 
	 }  
	}  


