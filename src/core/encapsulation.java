package coreJavaBatch;

public class encapsulation {

	private String employee_name ;//variable defination
	private int employee_age;
	
	
	
	private int address=10;
	
	//getters
	public String getname(){
		return employee_name;
	}
	
	public int getage(){
		return employee_age;
	}
	
	public int getaddress(){
		return address;
	}
	
	//setters
	public void setname(String name){
		this.employee_name=name;
	}
	
	public void setage(int age){
		this.employee_age=age;
	}


	
	
}
