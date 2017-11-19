package oca.test.datesandtimes;

import java.time.*;

public class DatesAndTimes {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		
		LocalDate myDate = LocalDate.of(2012, 12, 31);
		System.out.println(myDate);
		
		LocalTime myTime = LocalTime.of(8, 55);
		System.out.println(myTime);
		
		myDate = myDate.plusDays(2);
		myDate = myDate.plusWeeks(1);
		myDate = myDate.plusYears(5);
		System.out.println(myDate);
		
		Period period = Period.ofMonths(1);
		myDate = myDate.plus(period);
		System.out.println(myDate);
		
		Period biAnnually = Period.ofYears(2);
		Period everyThreeWeeks = Period.ofWeeks(3);
		
		Period wrong = Period.ofYears(2).ofWeeks(3);
		Period right = Period.of(2,  0,  3);
		
		LocalTime anyTime = LocalTime.of(9, 15);
		System.out.println(anyTime.plus(everyThreeWeeks));   // throws UnsupportedTemporalTypeException
		
	}
	
	


}
