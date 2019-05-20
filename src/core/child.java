package coreJavaBatch;

public class child extends overriding {
	
	
	
	final static int a=10;
	

	 //concrete or general method
	 public int sub (int a,int b) {
		 System.out.println("child");
			return a+b;
		}
	
	
	
	 
	 
	 public int add (int a,int b) {
		 System.out.println("child");
			return a+b;
		}
	
	

	public static void main(String[] args) {
		
		//obj of child
		child child = new child();
		child.rate();
		child.print();
		
		System.out.println(child.add(12, 12)); //overriding
		
		//obj of parent
		
		overriding over = new child(); //runtime overriding
		over.rate();
		over.print();
		System.out.println(over.add(12, 12));
		
		
		System.out.println(a);
		System.out.println();
		
	

	}

}
