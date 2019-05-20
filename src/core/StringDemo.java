package core;

public class StringDemo {
	
	/*
	 * static String name;
	 * 
	 * public StringDemo() {
	 * 
	 * }
	 * 
	 * public StringDemo(String name) { this.name=name;
	 * 
	 * }
	 */
	

	//using string literals
	
	 String str="Naveen";
	
	
	
	//using new Keyword
	
	String abc = new String();//constructor overloading
	
	public static void main (String args[]) {
		
		/*
		 * StringDemo demo = new StringDemo();
		 * 
		 * StringDemo demo2 = new StringDemo("pravir"); System.out.println(name);
		 */
		
     String a="pravir";
     String b="pravir";
     String c="Navin";
     
     String d= new String("pravir");
     String e = new String("pravir");

     
		/*
		 * System.out.println(a.equals(b));//string content comaparision is done
		 * System.out.println(a.equals(c)); System.out.println(a.equalsIgnoreCase(c));
		 * 
		 * System.out.println(a==b); //memory value is compared
		 * System.out.println(a==c);
		 */
     
     System.out.println(a.equals(d));
     System.out.println(e==d);
     
     b.concat("karna");
     System.out.println(b);
     
     a=a.concat("abc");
     System.out.println(a);
     System.out.println(b);
     a="pravir";
    
 
     String xyz = "bangalore";
     
     //This is mutable so value will be changed
  StringBuffer nav = new StringBuffer(xyz);//mutable
  System.out.println(nav.reverse());
   
  if(xyz.equals(nav.toString())) {
	  System.out.println("Palindrome");
  }
  
  else 
	  System.out.println("Not a palindrome");
  
  
  
  
	
		
		
	
	}

}
