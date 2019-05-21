package core;

public class switchCase {
	
	public static void main (String args[]) {
		
		int num=3;
		String pwd="nav";
		
		
		switch (pwd.concat("eenn"))	
		{
		case "nav":
			System.out.println("LOgin successful at case 1");
			break;
			
		case "naveen":
			System.out.println("Login Successful at case 2");
		    break;
			
		case "":
			System.out.println("Login succesful at case 3");
			break;
			
		default:
			System.out.println("Enter correct password");
		
		
		
		
		}
		
		
		
		
	}

}
