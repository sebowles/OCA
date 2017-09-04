import java.time.*;

public class CreatingDatesAndTimes {
	
	public static void main(String args[]){

		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		System.out.println(date1);
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15, 30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
//		LocalDate d = new LocalDate();  // DOES NOT COMPILE
		
		LocalDate.of(2015, Month.JANUARY, 32);  // throws DateTimeException
		
	}

}
