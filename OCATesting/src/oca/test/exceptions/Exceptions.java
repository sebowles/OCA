package oca.test.exceptions;

import java.io.IOException;

public class Exceptions {

	public static void exceptionA(){
		
	}
	
	/*****************************************************************
	 * Declare Checked exception. No Exception is thrown
	 * 
	 * @throws IOException
	 * ***************************************************************/
	
	public static void exceptionB() throws IOException{
		
	}
	
	
	/*****************************************************************
	 * Declare and throw Checked exception
	 * 
	 * @throws IOException
	 * ***************************************************************/
	
	public static void exceptionC() throws IOException{
		throw new IOException();
	}
	
	/*****************************************************************
	 * 	Compile Error: Unhandled exception
	 *	Need to add throws clause to method declaration eg. throws IOException
	 *
	 * ***************************************************************/
	/*
	public static void exceptionD(){
		throw new IOException();
	}
	*/
	
	
	/*****************************************************************
	 * 	Handled exception
	 *	Throws clause is not required in method declaration
	 *
	 * ***************************************************************/
	public static void exceptionE(){
		try{
			throw new IOException();
		}
		catch(IOException e){
			System.out.print("An IOException occurred");
		}
	}
	
	
	/*****************************************************************
	 * Declare Unchecked exception. No Exception is thrown
	 * 
	 * @throws IOException
	 * ***************************************************************/
	
	public static void exceptionF() throws NumberFormatException{
		
	}
	
	
	/*****************************************************************
	 * Declare and throw Unchecked exception
	 * 
	 * @throws IOException
	 * ***************************************************************/
	
	public static void exceptionG() throws NumberFormatException{
		throw new NumberFormatException();
	}
	
	/*****************************************************************
	 * Throw Unchecked exception. No exception is declared
	 * 
	 * @throws IOException
	 * ***************************************************************/
	
	public static void exceptionH() {
		throw new NumberFormatException();
	}
	

}
