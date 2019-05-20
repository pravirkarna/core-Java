package coreJavaBatch;

public  class test {
	
	
	static { 
        System.out.println("static block called "); 
    } 
	
	public   void abc() {
		
		System.out.println("i am in abc");
		
	}
	
   public   void abcd() {
		
		System.out.println("i am in abcd");
		
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
		//calling via object
		FirstProgram first = new FirstProgram();
		first.abc(2,6);
		
		
		FirstProgram.abcd();
		
	
		
		test obj =new test();
		obj.abcd();
		int a=10;
		
		try {
		System.out.println(a/2);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}
		
		finally {
			System.out.println("i am in finally");
		}
		
		
		System.out.println("");
		
		
		
		

	}
	

}
