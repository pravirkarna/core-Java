package core;

public class BMW {

	public static void main(String[] args) {
		
		car[] c =new car[150];
		
		c[0]=new car(10, 2345);
		
		
		c[1]=new car(13,5678);
		
		//Calling ENUM datatype
		
		Directions dir = Directions.East;
			
		switch (dir) {
		
			case East:
			System.out.println("In East side");
			break;
			
			case West:
				System.out.println("In west side");
				break;
				
			case North:
				System.out.println("In North side");
				break;
				
			case South:
				System.out.println("In South side");
				break;
				
		}
		
		
				
		

	}

}
