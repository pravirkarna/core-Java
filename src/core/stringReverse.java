package core;

import java.util.Collections;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am in Sweden";
		String Str1 = "Pravir";
		String str2="I am in Sweden";
		String reverse="";
		
		
		for(int i=str.length()-1; i>=0;i--) {
			
			reverse = reverse + str.charAt(i);
			
			
		}
		
		System.out.println("Reverse is :" +reverse);
str=str.concat("naveen");//immutable
 System.out.println(str);
 System.out.println(str2);
 
  StringBuffer sb = new StringBuffer(Str1);
  System.out.println(sb.reverse());
 
 
	}
	


}
