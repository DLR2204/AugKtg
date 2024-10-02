package collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

import oops.Employee;

public class TreeMapEx {

	public static void main(String[] args) {

//		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
//
//		tm.put(104, "apple");
//
//		tm.put(103, "rose");
//
//		tm.put(105, "orange");
//
//		tm.put(100, "Sasank");
//
//		tm.put(101, "nikhil");
//
//		tm.put(102, "surya");
//
//		System.out.println(tm);
//
//		System.out.println(tm.get(100));
		
		
		Employee emp1 = new Employee("Sasank",100,"india",938749823);
		
		Employee emp2 = new Employee("Surya",101,"india",938749823);
		
		Employee emp3 = new Employee("Nikhil",102,"india",938749823);
		
		TreeMap<Integer,Employee> emp = new TreeMap<Integer,Employee>();
		
		
		emp.put(100,emp1);
		
		
		emp.put(101,emp2);
		
		emp.put(102,emp3);

		
		
		
		Set<Integer> keys = emp.keySet();
		
		for(Integer employee:keys) {
			
			System.out.println(employee +"\t"+emp.get(employee));
			
		}
		
		
		
		
		
	}

}
