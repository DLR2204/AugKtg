package collections;

import java.util.LinkedList;
//(1)Growable in nature

//(2)It will stores both homogenous,heterogenous data

//(3)It will have lots of uility methods.
//List:-

//(1)It wil allows duplicates

//(2)It will stores the insertion order

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("Sasank");

		ll.add(2334);

		ll.add(true);

		ll.add(3.15f);

		ll.add('c');

		ll.add("Sasank");

		ll.add(2334);

		ll.add(true);

		ll.add(3.15f);

		ll.add('c');

		System.out.println(ll);
	}

}
