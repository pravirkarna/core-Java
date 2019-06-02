package core.coresub;

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {

	public static void main(String[] args) {
		
		String str = "Virat";
		
		
		ArrayList <String> al = new ArrayList<>(); // equal to ArrayList <Integer> AL = new ArrayList<Integer>();
		al.add(str);
		al.add("Yuvraj");
		al.add("Dhoni");
		al.add("Gayle");
		
		//displaying
		System.out.println(al);
		
		//remove
		al.remove("Dhoni");
		System.out.println(al);
		
		al.add(2, "Naveen");
		System.out.println(al);
		
		//remove
		al.remove(2);
		System.out.println(al);
		
		
		ArrayList <String> al1 = new ArrayList<>();
		al1.add("Sweden");
		al1.addAll(al);
		al1.add("India");
		System.out.println(al1);
		
		System.out.println(al1.contains("india"));
		al1.trimToSize();
		System.out.println(al1);
		
		System.out.println(al1.get(3)); //searching 
		Collections.reverse(al1);
		System.out.println(al1);
		

		
		
		
		
		//

	}

}
