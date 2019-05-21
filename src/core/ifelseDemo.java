package core;

public class ifelseDemo {

	
	  //Decision flow
	
	public static void main(String[] args) {
		
		//a)if statement
		/*
		 * int sum=80;
		 * 
		 * if(sum<50) {
		 * 
		 * System.out.println("sum is less than 50");
		 * 
		 * }
		 */
		
		//b)nested if statement
		
		/*
		 * int sum=50;
		 * 
		 * if(sum<=50) {
		 * 
		 * System.out.println("sum is less than 50");
		 * 
		 * }
		 * 
		 * if (sum>50) {
		 * 
		 * System.out.println("sum is greater than 50"); }
		 */
		
		/*
		 * int sum=50;
		 * 
		 * if(sum<50) {
		 * 
		 * System.out.println("sum is less than 50");
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * System.out.println("sum is greater than or equal to 50"); }
		 */
		
		
		int sum=5;
		
		if(sum<100 && sum >=10) {
			
			System.out.println("It is 2 digit number");
			
		}
		
		else if (sum<1000 && sum >=100){
			
			System.out.println("sum is 3 digit number");
		}
		
		else {
			System.out.println("sum is 1 digit number");
		}
		

	}//main

}//class
