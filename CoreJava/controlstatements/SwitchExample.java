package controlstatements;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your obtained marks:-");

		float om = scan.nextFloat();

		System.out.print("Please enter your max marks:-");

		float mm = scan.nextFloat();

		float percentage = (om / mm) * 100;

		System.out.println("Percentage:- " + percentage + "%");

		int gpa = (int) ((percentage / 10) % 10);

		System.out.println("Gpa:- " + gpa);
		
		System.out.print("Grade:-");

		switch (gpa) {
		case 10: {
			System.out.println("Distinction");
			break;
		}
		case 9: {
			System.out.println("Excellent");
			break;
		}
		case 8: {
			System.out.println("very good");
			break;
		}
		case 7: {
			System.out.println("good");
			break;
		}
		case 6: {
			System.out.println("average");
			break;
		}
		case 5: {
			System.out.println("imporve well");
			break;
		}
		case 4: {
			System.out.println("poor");
			break;
		}
		default: {
			System.out.println("Fail");
			break;
		}

		}

	}

}
