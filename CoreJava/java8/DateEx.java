package java8;

import java.time.LocalDate;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		
		LocalDate date1 = LocalDate.now();
		
		System.out.println(date1);
	}

}
