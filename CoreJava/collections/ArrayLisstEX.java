package collections;

//(1)Growable in nature

//(2)It will stores both homogenous,heterogenous data

//(3)It will have lots of uility methods.
//List:-

//(1)It wil allows duplicates

//(2)It will stores the insertion order


import java.util.ArrayList;

public class ArrayLisstEX {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Apple");

		al.add(324234);
	

		al.add(3.14f);

		al.add(true);

		al.add('c');

		al.add(234);

		al.add(2,"sasank");

		System.out.println(al);
	}

}
