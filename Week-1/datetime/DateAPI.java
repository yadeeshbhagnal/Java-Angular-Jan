package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateAPI {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.isLeapYear());

		LocalDate date2  = LocalDate.of(2023, 11,30);
		System.out.println(date2.plusDays(1));
		
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		
		LocalTime date4 = LocalTime.now();
		System.out.println(date4);
		
		System.out.println(date1.plusYears(2));
		System.out.println(date1.withYear(1947));
		
		
	}

}
