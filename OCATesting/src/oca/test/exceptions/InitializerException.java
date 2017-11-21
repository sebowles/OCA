package oca.test.exceptions;

public class InitializerException {
	
	
	static{
		if(true) throw new NullPointerException();
	}
	
	
	/*
	{
		throw new NullPointerException();
	}
	*/
	
	public static void main(String[] args){

	}

}
