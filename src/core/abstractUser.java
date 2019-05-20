package coreJavaBatch;

public class abstractUser extends abstractDemo {

	
	
	
	public static void main(String[] args) {
		abstractDemo user = new abstractUser();
		user.abc();
		user.display();
		user.name();

		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void city() {
		// TODO Auto-generated method stub
		
	}


	
	public void display() {
		System.out.println("I am in abstract child class");
	}



}
