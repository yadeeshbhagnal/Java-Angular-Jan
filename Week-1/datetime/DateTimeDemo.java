package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		
	LocalDate date1= LocalDate.now();
	System.out.println(date1);
	
	LocalDate date2 = LocalDate.of(1947, 4, 12);
	System.out.println(date2);
	
	String str = "2012-04-24";
	LocalDate date3 = LocalDate.parse(str);
	System.out.println(date3);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy");
	String dtr2 = "12-03-2042";
	LocalDate date4 = LocalDate.parse(dtr2, dtf);
	System.out.println(date4);
	
	DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("dd MM yyy");
	String mydate = date1.format(myformatter);
	System.out.println(mydate);
	}

}

