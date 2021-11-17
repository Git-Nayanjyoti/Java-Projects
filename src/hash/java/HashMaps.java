package hash.java;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {
	

		/*
		 * HashMap
		 * is a class implementing Map Interface
		 * also used to store elements
		 * we store key and value pair
		 * a key and value together is called as one pair
		 * a key and value together is also called as bucket/entry
		 * group of buckets/entry is called as entryset
		 * 
		 * Rules:
		 * Duplicate values are allowed
		 * Duplicates keys are not allowed, if given will work as an Update
		 * Multiple null values are allowed
		 * Only one null key is allowed
		 */
		
		public static void main(String[] args) {
			HashMap<Integer, String> map = new HashMap<>();
			map.put(1, "Ajay");
			map.put(2, "Shayak");
			map.put(3, "Robin"); 
			System.out.println(map);
			System.out.println(map.get(2));
			map.put(4, "Ajay");
			map.put(5, "Ajay");
			map.put(2, "ShayakUpdated");
			map.put(6, null);
			map.put(7, null);
			map.put(null, "Hello");
			map.put(0, "JAVA");
			System.out.println(map);
			System.out.println(map.keySet());
			Set<Integer> keySet = map.keySet();
			
			System.out.println(map.isEmpty());
			//map.clear();
			
			for(Entry<Integer, String> a : map.entrySet()) {
				System.out.println("Key is "+a.getKey() + " Value is " + a.getValue());
			}
			System.out.println(.getKey());
			
			 
		}

}
