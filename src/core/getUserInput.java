package core;

import java.io.*;



public class getUserInput {

	public static void main(String[] args) throws IOException {
		
		int age;
		String name;
		float floatnum;
		
		/*
		 * //1) Get Input using scanner class
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter your name :");
		 * name=sc.nextLine(); System.out.println("My name is :" +name);
		 * 
		 * 
		 * System.out.println("Enter your age :"); age=sc.nextInt();
		 * System.out.println("My age is :" +age);
		 */
		
		
		//2) Get Input using Buffer Reader class
		
		/*
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("Enter your address"); String add = reader.readLine();
		 * System.out.println("Address is :" +add);
		 */
		
		//)3 Get Input using Console class 1Java1.5/java1.6
		
		System.out.println("abc");
		
		//Console read = System.console();
		
		/*
		 * if(read== null) { System.out.println("No Console"); System.exit(0); }
		 */
		
		System.out.println("Enter your city");
		String city=System.console().readLine();
		
		System.out.println("your city is "+city);

	}

}
