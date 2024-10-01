package collections;

import java.util.LinkedHashSet;
//(1)Growable in nature

//(2)It will stores both homogenous,heterogenous data

//(3)It will have lots of uility methods.
//Set:-

//(1)It wil allows not duplicates

//(2)It will  the insertion order

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("hello");

		lhs.add(98734);

		lhs.add('c');

		lhs.add(true);

		lhs.add(3.14f);
		
		lhs.add("hello");

		lhs.add(98734);

		lhs.add('c');

		lhs.add(true);

		lhs.add(3.14f);
		
		System.out.println(lhs);
	}
}
