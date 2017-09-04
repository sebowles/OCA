import java.time.*;

public class WorkingWithPeriods {
	
	/*
	public static void main(String args[]){
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(start, end);
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end){
		LocalDate upTo = start;
		while(upTo.isBefore(end)){    // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);   // add a month
		}
	}
	*/
	
	public static void main(String args[]){
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start, end, period);
		
		periodExamples();
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
		LocalDate upTo = start;
		while(upTo.isBefore(end)){    // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);   // adds the period
		}
	}
	
	
	private static void periodExamples(){
//		Period annually = Period.ofYears(1);
//		Period quarterly = Period.ofMonths(3);
//		Period everyThreeWeeks = Period.ofWeeks(3);
//		Period everyOtherDay = Period.ofDays(2);
//		Period everyYearAndWeek = Period.of(1, 0, 7);
		
		// You cannot chain  methods when creating Period. The following code looks like
		// it is equivalent to the everyYearAndWeek example, but it's not. Only the last
		// method is used because the Period.ofXXX methods are static methods
		Period wrong = Period.ofYears(1).ofWeeks(1);   // generates compiler warning
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6,  15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		
		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		System.out.println(time.plus(period));  // UnsupportedTemporalTypeException
		
	}

}
