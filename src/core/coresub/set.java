package core.coresub;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		
		
		

		
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer> ();
		ht.put(10,100);
		ht.put(12, 120);
		ht.put(11, 110);
		ht.put(11,150);
		ht.put(17,150);
		
		System.out.println(ht);
		
		
	
		HashSet <Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(9);
		set.add(8);
		set.add(678);
		
		
		System.out.println(set);
		
		TreeSet <Integer> tset = new TreeSet<Integer>(set);
		System.out.println(tset);
		
		tset.add(12);
		tset.add(10);
		tset.add(910);
		tset.add(910);
		System.out.println(tset);
		
		
		

	}

}
