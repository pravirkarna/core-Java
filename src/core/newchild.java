package coreJavaBatch;

public class newchild extends father {
	
	public void childmethod() {
		System.out.println("i am into child class");
	}
	
	public   void abc () {
		System.out.println("overriding :i am into child class");
		
		
	}

	public static void main(String[] args) {
		
		grandfather gf1 = new father(); //run time overriding parent can not access its child class methods
		gf1.abc();
		
		/*
		 * ((father)gf1).run();//downcasting ((father)gf1).display()
		 */;
		


	
		
		/*
		 * 
		 * 
		 * //normal overriding newchild ch = new newchild(); ch.abc(); ch.run();
		 * ch.childmethod(); ch.abcd();
		 * 
		 * //runtime overriding with grandfather class grandfather gf = new newchild();
		 * gf.abc(); gf.abc();
		 * 
		 * 
		 * 
		 * //runtime overriding with father class father f = new newchild();
		 */
		

	}

}
