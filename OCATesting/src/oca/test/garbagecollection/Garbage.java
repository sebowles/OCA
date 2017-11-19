package oca.test.garbagecollection;

public class Garbage {
	
	public static void main(String args[]){
		String one, two;
		one = "a";
		two = "b";
		one = two;
		System.out.println(one);
		two = "c";
		System.out.println(one);
		String three = one;
		one = null;
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}
