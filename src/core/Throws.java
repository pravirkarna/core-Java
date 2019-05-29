package core;

public class Throws {
	
	public static void calculator(int value,int value1) throws Exception {
		
		System.out.println(value+value1);
		System.out.println(value-value1);
		System.out.println(value*value1);
		System.out.println(value/value1);
	
	}
	

	public static void main(String[] args) {
		
		System.out.println("inside");
		try {
			calculator(10,0);
		} catch (Exception e) {
			System.out.println("catch");
			//e.printStackTrace();
		}
		
		System.out.println("outside");

	}

}
