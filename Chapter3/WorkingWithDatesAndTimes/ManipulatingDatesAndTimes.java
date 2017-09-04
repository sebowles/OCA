import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDatesAndTimes {
	
	public static void main(String args[]){
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time2);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		date3.plusDays(10);
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
//		date = date.plusMinutes(1);  // DOES NOT COMPILE
		
		
	}

}
