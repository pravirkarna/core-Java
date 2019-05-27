package core.coresub;

import java.util.regex.Pattern;

public class regexexample {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("Naveen", "Naveen"));
		
		System.out.println(Pattern.matches("naveen", "Naveen"));
		
		System.out.println(Pattern.matches("[nN]aveen", "Naveen"));
		System.out.println(Pattern.matches("[nNP]aveen", "naveen"));
		System.out.println(Pattern.matches("[nNP]aveen", "Paveen"));
		
		System.out.println(Pattern.matches("[nN]aveen|[Pp]ravir", "naveen"));
		System.out.println(Pattern.matches("[nN]aveen|[Pp]ravir", "pravir"));
		
		System.out.println(Pattern.matches(".*abc.*", "deabcpqr"));
		
		System.out.println(Pattern.matches("^[^\\d].*", "1abc"));
		
		
		System.out.println(Pattern.matches("[a-zA-Z]", "nAVeen"));
		
		
		
		

	}

}
