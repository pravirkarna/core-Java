package coreJavaBatch;

public interface bank  extends bankRbi,bank3{
	
	// all methods will be by default static
	//all variables will be final by default
	//all methods will be abstract only - it will have only method name 
	
	int a=12;
	 int b=10;
	//abstract method
	public int ROI(int a);
	public void savingaccount();
	public void current();
	public void rate();
	
	
	

}
