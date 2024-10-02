package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		
		
		LocalDate bthdate = LocalDate.of(1997,8,17);
		
		LocalDate currentd = LocalDate.now();
		
		Period p = Period.between(bthdate, currentd);
		
		System.out.printf("Your age is :- %d years, %d months, %d days",p.getYears(),p.getMonths(),p.getDays());;
		
		
	}
}
