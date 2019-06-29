package core;

//Multithreading can be achieved via 2 procee
//extend Thread class
//implement Runnable Interfac

class Hi implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++) {			
		System.out.println("Hi Class");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		}
	}
	
}

class Hello  implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++) {			
		System.out.println("Hello Class");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}

		
		}
	}
	
}





public class multithreading {


public static void main (String args[]) throws InterruptedException {
	
	 Hi obj1 = new Hi();
	 Hello obj2 = new Hello();
	 
	 
	 
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	
	
	t1.start();
	t2.start();
	
	System.out.println(t1.isAlive());
	
	t1.join();
	t2.join();
	System.out.println(t1.isAlive());
	System.out.println("Main Thread ");
	
		

}	
		
		

	}


