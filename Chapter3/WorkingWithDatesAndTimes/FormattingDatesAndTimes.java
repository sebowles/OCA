import java.time.*;
import java.time.format.*;

public class FormattingDatesAndTimes {
	
	public static void main(String args[]){
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
//		System.out.println(date);
//		System.out.println(time);
//		System.out.println(dateTime);
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime));  // 20/01/20
		System.out.println(shortDateTime.format(date));   // 20/01/20
//		System.out.println(shortDateTime.format(time));   // UnsupportedTemporalTypeException
		
		//The format() method is declared on both the formatter objects and the date/time objects
		/*
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDateTime));
		System.out.println(date.format(shortDateTime));
		System.out.println(time.format(shortDateTime));
		*/
		
		LocalDate date2 = LocalDate.of(2020,  Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(11,  12, 34);
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime2));  // 20/01/20 11:12
		System.out.println(mediumF.format(dateTime2));  // 20-Jan-2020 11:12:34
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime2.format(f));  // January 20, 2020, 11:12
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		// NB: if dtf is omitted a DateTimeParseException is thrown
		// Text '01 02 2015' could not be parsed at index 0
		LocalDate date3 = LocalDate.parse("01 02 2015", dtf);
		LocalTime time3 = LocalTime.parse("11:22");
		// Below parse method call works with a date string with hyphens
		// Here an exception is not thrown if a DateTimeFormatter is not passed
		LocalDate date4 = LocalDate.parse("2015-01-20");
		LocalDate date5 = LocalDate.now();  // Gets the current date
		
		System.out.println(date3);   // 2015-01-02
		System.out.println(time3);   // 11:22
		System.out.println(date4);
		System.out.println(date5);
		
	}

}
