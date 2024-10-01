package collections;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(104, "apple");

		tm.put(103, "rose");

		tm.put(105, "orange");

		tm.put(100, "Sasank");

		tm.put(101, "nikhil");

		tm.put(102, "surya");

		System.out.println(tm);

		System.out.println(tm.get(100));
		
		
		
		
		

	}

}
