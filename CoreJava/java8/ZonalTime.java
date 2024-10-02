package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalTime {
	
	public static void main(String[] args) {
		
//			Set<String> zones = ZoneId.getAvailableZoneIds();
//			
//			for(String zone :zones) {
//				System.out.println(zone);
//			}
			
			ZoneId zone = ZoneId.of("Cuba");
		
			ZonedDateTime date = ZonedDateTime.now(zone);
			
			System.out.println(date);
			
			
	}
}
