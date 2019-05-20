package coreJavaBatch;

public class methodoverloading {
	
	
	public void add () {
		System.out.println("nothng to add");
	}
	
	public final int add (int a,int b) {
		return a+b;
	}
	
	//method overloading
	public int add (int a,int b,int c) {
		return a+b+c;
	}
	
	//Method overloaded
	public int add (int a,int b,int c,int d) {
		return a+b+c+d;
	}

	
	
	
	public static void main(String[] args) {
		
		methodoverloading m = new methodoverloading();
		System.out.println(m.add(8,8));
		
	}

}
