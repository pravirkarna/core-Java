package core.coresub;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//for adding elements
		ll.add("Element1");
		ll.add("Ele2");
		ll.add("Element3");
		ll.add("Ele4");
	
		
		//print
		System.out.println(ll);
		
		//add first and last element
		ll.addFirst("Naveen");
		ll.addLast("Pravir");
		System.out.println(ll);
		
		//how to set /get values
		
		ll.set(2, "India");
		System.out.println(ll);		
		System.out.println(ll.get(3));
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//add to a position
		
		ll.add(3, "Sweden");
		ll.add(4, "Sweden");
		System.out.println(ll);
	
		
	}

}
