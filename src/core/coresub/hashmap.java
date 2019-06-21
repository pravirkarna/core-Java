package core.coresub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Naveen");
		hm.put(null, "Pravir");
		hm.put(34, "Pravir");
		hm.put(1, "New Naveen");
		
		hm.remove(1);
		
		System.out.println(hm);
		
		Iterator iterator = hm.entrySet().iterator();
		
		while(iterator.hasNext()) {		
			
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println("Key is "+ entry.getKey());
			System.out.println("Value is "+ entry.getValue());
			
		}
		
		 

	}

}
