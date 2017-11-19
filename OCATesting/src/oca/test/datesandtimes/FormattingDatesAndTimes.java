package oca.test.datesandtimes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.UnsupportedTemporalTypeException;


public class FormattingDatesAndTimes {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021,  Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println("Printing LocalDate");
		System.out.println("====================");
		System.out.println(date);
		System.out.println();
		
		System.out.println("Printing LocalTime");
		System.out.println("====================");
		System.out.println(time);
		System.out.println();
		
		System.out.println("Printing LocalDateTime");
		System.out.println("====================");
		System.out.println(dateTime);
		System.out.println();
		
		System.out.println("Printing LocalDate formatted with ISO_LOCAL_DATE");
		System.out.println("==================================================");
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println();
		
		System.out.println("Printing LocalTime formatted with ISO_LOCAL_TIME");
		System.out.println("=================================================");
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println();
		
		System.out.println("Printing LocalDateTime formatted with ISO_LOCAL_DATE_TIME");
		System.out.println("==========================================================");
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println();
		
		// ofLocalizedDate
		DateTimeFormatter shortDateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		// LocalDate & ofLocalizedDate
		System.out.println("Printing LocalDate formatted with ofLocalizedDate FormatStyle.SHORT");
		System.out.println("====================================================================");
		System.out.println(shortDateFormat.format(date));
		System.out.println();
		
		// LocalTime & ofLocalizedDate
		System.out.println("Printing LocalTime formatted with ofLocalizedDate FormatStyle.SHORT");
		System.out.println("====================================================================");
		try{
			System.out.println(shortDateFormat.format(time));  // UnsupportedTemporalTypeException
		}
		catch(UnsupportedTemporalTypeException e){
			System.out.println("An Exception occurred trying to format LocalTime with ofLocalizedDate: " + e);
		}
		finally{
			System.out.println();
		}
		// LocalDateTime & ofLocalizedDate
		System.out.println("Printing LocalDateTime formatted with ofLocalizedDate FormatStyle.SHORT");
		System.out.println("=========================================================================");
		System.out.println(shortDateFormat.format(dateTime));
		System.out.println();
		
		// ofLocalizedDateTime
		DateTimeFormatter shortDateTimeFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		// LocalDate & ofLocalizedDateTime
		System.out.println("Printing LocalDate formatted with ofLocalizedDateTime FormatStyle.SHORT");
		System.out.println("=========================================================================");
		try{
			System.out.println(shortDateTimeFormat.format(date));
		}
		catch(UnsupportedTemporalTypeException e){
			System.out.println("An Exception occurred trying to format LocalDate with ofLocalizedDateTime: " + e);
		}
		finally{
			System.out.println();
		}
		
		// LocalTime & ofLocalizedDateTime
		System.out.println("Printing LocalTime formatted with ofLocalizedDateTime FormatStyle.SHORT");
		System.out.println("=========================================================================");
		try{
			System.out.println(shortDateTimeFormat.format(time));
		}
		catch(UnsupportedTemporalTypeException e){
			System.out.println("An Exception occurred trying to format LocalTime with ofLocalizedDateTime: " + e);
		}
		finally{
			System.out.println();
		}
		
		// LocalDateTime & ofLocalizedDateTime
		System.out.println("Printing LocalDateTime formatted with ofLocalizedDateTime FormatStyle.SHORT");
		System.out.println("=========================================================================");
		System.out.println(shortDateTimeFormat.format(dateTime));
		System.out.println();
		
		// ofLocalizedTime
		DateTimeFormatter shortTimeFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		// LocalDate & ofLocalizedTime
		System.out.println("Printing LocalDate formatted with ofLocalizedTime FormatStyle.SHORT");
		System.out.println("=========================================================================");
		try{
			System.out.println(shortTimeFormat.format(date));
		}
		catch(UnsupportedTemporalTypeException e){
			System.out.println("An Exception occurred trying to format LocalDate with ofLocalizedTime: " + e);
		}
		finally{
			System.out.println();
		}
		
		// LocalTime & ofLocalizedTime
		System.out.println("Printing LocalTime formatted with ofLocalizedTime FormatStyle.SHORT");
		System.out.println("=========================================================================");
		System.out.println(shortTimeFormat.format(time));
		System.out.println();
		
		// LocalDateTime & ofLocalizedTime
		System.out.println("Printing LocalDateTime formatted with ofLocalizedTime FormatStyle.SHORT");
		System.out.println("=========================================================================");
		System.out.println(shortTimeFormat.format(dateTime));
		System.out.println();
		
		
		/*
		DateTimeFormatter shortDateFormat2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(date.format(shortDateFormat2));
		
//		System.out.println(time.format(shortDateFormat2));  // UnsupportedTemporalTypeException
		
		System.out.println(dateTime.format(shortDateFormat2));
		*/
		
		// Short date time format
		System.out.println("SHORT Date Time Format");
		System.out.println("=======================");
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(fs.format(dateTime));
		System.out.println();
		
		// Medium date time format
		System.out.println("MEDIUM Date Time Format");
		System.out.println("=======================");
		DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(fm.format(dateTime));
		System.out.println();
		
		// Full date format
		System.out.println("FULL Date Format");
		System.out.println("=======================");
		DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(ff.format(date));
		System.out.println();
		
		// Long date format
		System.out.println("LONG Date Format");
		System.out.println("=======================");
		DateTimeFormatter fl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(fl.format(date));
		System.out.println();
		
		// Custom date time format
		System.out.println("Custom Date Time Format");
		System.out.println("=========================");
		DateTimeFormatter fc = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(fc.format(dateTime));
		System.out.println();
		
		// Parsing date time format
		System.out.println("Parsing Date Time Format");
		System.out.println("=========================");
		DateTimeFormatter fp = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("01 02 2015", fp);
		LocalTime time2 = LocalTime.parse("11:22:40");
		System.out.println(date2);
		System.out.println(time2);

	}

}
