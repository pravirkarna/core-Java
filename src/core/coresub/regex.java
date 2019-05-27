package core.coresub;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		
			//1st way
		
		String input="nav";
		
	
		 Pattern p= Pattern.compile("..b"); Matcher m = p.matcher(input); boolean b =
		m.matches(); System.out.println(b);
		  
		 //2nd way
		  
		 boolean a = Pattern.compile("..m").matcher("am").matches();
		  System.out.println(a);
		 
		
		//3rd way
		
		boolean c = Pattern.matches(".a", "na");
		System.out.println(c);

	}

}
