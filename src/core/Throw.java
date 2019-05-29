package core;

public class Throw {
	
	public static void checkAge(int age) {
		
		if(age<18)
		throw new ArithmeticException("Minor- Not eligible for voting");	
	
	    else 
		System.out.println("Eligible for voting");
	
	}
	
	

	public static void main(String[] args)  {
		
		checkAge(19);
		System.out.println("End of my code");
		
		try {
			Throws.calculator(12, 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
