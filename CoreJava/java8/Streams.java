package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		
	List<Integer> obj= new ArrayList<Integer>(); //empty list
	
	List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	obj = number.stream().map(num->num*19).collect(Collectors.toList());	
	
	System.out.println(obj);
	
	obj = number.stream().filter(a->a%2==0).map(n->n*19).collect(Collectors.toList());
	
	
	System.out.println(obj);
	
	}
}
