package intro;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("************Registration************");
		
		System.out.print("Please enter your name:-");
		
		String name = scan.next();
		
		System.out.print("please enter your age:-");
		
		byte age = scan.nextByte();
		
		System.out.print("Please enter your contact number:-");
		
		long contact = scan.nextLong();
		
		System.out.println("You r registered successfully");
		
		System.out.println("Your details are :-");
		
		System.out.println("name:-"+name+" age:-"+age+" contact:-"+contact);
	}

}
