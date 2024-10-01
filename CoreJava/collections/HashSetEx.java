package collections;

import java.util.HashSet;
//(1)Growable in nature

//(2)It will stores both homogenous,heterogenous data

//(3)It will have lots of uility methods.
//Set:-

//(1)It will not allows duplicates

//(2)It will not stores the insertion order --Random Order
public class HashSetEx {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("hello");

		hs.add(98734);

		hs.add('c');

		hs.add(true);

		hs.add(3.14f);

		hs.add("hello");

		hs.add(98734);

		hs.add('c');

		hs.add(true);

		hs.add(3.14f);

		System.out.println(hs);
	}

}
