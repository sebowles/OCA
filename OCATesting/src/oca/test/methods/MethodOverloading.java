package oca.test.methods;

public class MethodOverloading {
	
	int height = 0;
	int width = 0;
	
	public int calculateArea(){
		return height * width;
	}
	
	public int calculateArea(int a){
		return (height * width) + a;
	}
	
	public long calculateArea(int a, int b){
		return height;
	}
	
	
	public final void calculateArea(long a){
		
	}
	
	public String calculateArea(float a){
		return null;
	}
	
	public String calculateArea(double a){
		return null;
	}
	
	public void calculateArea(short a){
		return;
	}
	
	/*
	int calculateArea(){
		return height;
	}
	
	public static int calculateArea(){
		return height;
	}

	public final int calculateArea(){
		return height;
	}
	
	public long calculateArea(){
		return height;
	}
	*/

}