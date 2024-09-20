package oops;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println("6.The sum of two integers:-" + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("10.The sum of 3 integers:-" + (a + b + c));
	}

	public void add(int a, float b) {
		System.out.println("14.The sum of an int and float:-" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("18.The sum of float and int:-" + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("22.The sum of 2 floats:-" + (a + b));
	}

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();

		obj.add('a', 'b');
		
		
		

	}

}
