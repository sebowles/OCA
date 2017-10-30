package oca.test.exceptions;

import java.io.IOException;

public class ExceptionsTester {

	public static void main(String[] args) {

		/*****************************************************************
		 * Unreachable catch block
		 * 
		 * Exception A does not have a throws clause therefore
		 * it will not be possible to catch IOException
		 * 
		 * ***************************************************************/
		/*
		try{
			Exceptions.exceptionA();
		}
		catch(IOException ex){
			System.out.println("Exception A has a problem");
		}
		*/
		
		/*****************************************************************
		 * Reachable catch block
		 * 
		 * Exception A does not have a throws clause
		 * 
		 * However, in below code Exception is not an issue
		 * 
		 * ***************************************************************/
		
		try{
			Exceptions.exceptionA();
		}
		catch(Exception ex){
			System.out.println("Exception A has a problem");
		}
		
		
		/*****************************************************************
		 * Reachable catch block
		 * 
		 * Exception A does not have a throws clause
		 * 
		 * In below code ArithmicException is not an issue as it is an
		 * unchecked exception
		 * 
		 * ***************************************************************/
		
		try{
			Exceptions.exceptionA();
		}
		catch(ArithmeticException ex){
			System.out.println("Exception A has a problem");
		}
		
		/*****************************************************************
		 * Unreachable catch block
		 * 
		 * Unreachable catch block for ArithmeticException
		 * 
		 * Super class catch is prior to sub class catch
		 * 
		 * ***************************************************************/
		/*
		try{
			Exceptions.exceptionA();
		}
		catch(RuntimeException ex){
			System.out.println("Exception A has a problem");
		}
		catch(ArithmeticException ex){
			System.out.println("Exception A has a problem");
		}
		*/
		
		
//		Exceptions.exceptionB();
		
		/*****************************************************************
		 * Exception B has a throws clause for a checked exception but
		 * does not actually throw an exception
		 * 
		 * ***************************************************************/
		try{
			Exceptions.exceptionB();
		}
		catch(IOException ex){
			System.out.println("Exception B has a problem");
		}
		
		
		/*****************************************************************
		 * Exception C has a throws clause for a checked exception and does
		 * throw a checked exception
		 * 
		 * ***************************************************************/
		try{
			Exceptions.exceptionC();
		}
		catch(Exception ex){
			System.out.println("Exception C has a problem");
		}
		
		
		/*****************************************************************
		 * Exception E already handles an exception
		 * 
		 * No try/catch is required around this method
		 * 
		 * ***************************************************************/
		Exceptions.exceptionE();
		
		/*****************************************************************
		 * Unreachable catch block
		 * 
		 * Exception E handles an exception but no exception is thrown
		 * from this method
		 * 
		 * ***************************************************************/
		/*
		try{
			Exceptions.exceptionE();
		}
		catch(IOException ex){
			System.out.println("Exception E has a problem");
		}
		*/
		
		/*****************************************************************
		 * Exception F declares an unchecked exception but no exception is
		 * thrown
		 * 
		 * No try/catch is required around this method but it is not an issue
		 * if one is included. Try/catch is optional.
		 * 
		 * ***************************************************************/
		Exceptions.exceptionF();
		
		try{
			Exceptions.exceptionF();
		}
		catch(RuntimeException ex){
			System.out.println("Exception F has a problem");
		}
		
		/*****************************************************************
		 * Exception G declares an unchecked exception and an 
		 * unchecked exception is thrown
		 * 
		 * No try/catch is required around this method
		 * 
		 * ***************************************************************/
		Exceptions.exceptionG();
		
		try{
			Exceptions.exceptionG();
		}
		catch(RuntimeException ex){
			System.out.println("Exception G has a problem");
		}
		
		/*****************************************************************
		 * Exception H does not declare an unchecked exception but
		 * an unchecked exception is thrown
		 * 
		 * No try/catch is required around this method
		 * 
		 * ***************************************************************/
		Exceptions.exceptionH();
		
	}

}
