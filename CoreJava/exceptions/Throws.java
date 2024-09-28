package exceptions;

import java.io.FileNotFoundException;

public class Throws {
	
	public static void div(int a,int b) throws FileNotFoundException,NullPointerException {
		System.out.println("The division result is:-"+(a/b));
	}
	
	public static void main(String[] args) throws FileNotFoundException   {
		
		
		div(23,0);
		
		
	}
	
	

}
