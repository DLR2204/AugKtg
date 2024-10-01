package collections;

import java.util.Comparator;
import java.util.TreeSet;
//(1)Growable in nature

//(2)It will stores both homogenous,heterogenous data

//(3)It will have lots of uility methods.
//Set:-

//(1)It wil allows not duplicates

//(2)It will not the insertion order -ascending order,alphabetical order

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyOrder());
		
		ts.add("sasank");     // a-97  b-98     +reverse  -follows
								//97-98 =-(-ve)
		
		ts.add("nikhil");
		
		ts.add("surya");
		
		ts.add("hello");
		
		ts.add("good");
		
		ts.add("evening");
		
//		ts.add(23);
//		
//		ts.add(56);
//		
//		ts.add(12);
//		
//		ts.add(65);
//		
//		ts.add(45);
//		
//		ts.add(65);
//		
//		ts.add(20);
		
		
		System.out.println(ts);
		
		
		
		for(Object obj:ts) {
			System.out.println(obj);
		}
		
	}
}













class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}

	
	
	
	
	
	
}