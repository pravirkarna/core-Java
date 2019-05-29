package core;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String args[]) {

		// using try catch

		int x=10;
		int y=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of x");
		/*
		 * x = scan.nextInt();
		 * 
		 * System.out.println("Enter value of y"); y = scan.nextInt();
		 */

		
		  //we write the code inside try which are expected to give an exception 
		  try {
		  int num = x/y; 
		  System.out.println("Number is" +num); 
		  }
		  
		  
		  
		  
		  
		  //we try to catch that exception 
		catch(ArithmeticException ae) {
			System.out.println("Handled by Arithmetic Exception");
			//ae.printStackTrace();
		 
		 }
		  
		 
		  
		  
		  catch (RuntimeException  re) {
			  re.printStackTrace();
			  System.out.println("Handled by Runtime Exception");
		  }
		  
		  catch(Exception e) {
				System.out.println("Handled by  Exception");
							 
			 }
		  
		  catch(Throwable Te) {
				System.out.println("Handled by  Exception");
							 
			 }
		 
		  
		  //we try to catch that exception 
		
		  
		  //finally will get printed regardless of exception is there or not there
		  finally {
			  System.out.println("I am in finally block");
		  }
		  
		  

		System.out.println("Outside try catch");

	}

}
