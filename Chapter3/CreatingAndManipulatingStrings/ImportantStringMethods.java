
public class ImportantStringMethods {
	
	public static void main(String[] args){
		// length()
		String string = "animals";
		System.out.println(string.length());  // 7
		
		// charAt()
		String string2 = "animals";
		System.out.println(string2.charAt(0));  // a
		System.out.println(string2.charAt(6));  // s
		System.out.println(string2.charAt(7));  // throws exception
		
		// indexOf()
		String string3 = "animals";
		System.out.println(string.indexOf('a'));	// 0
		System.out.println(string.indexOf("al"));	// 4
		System.out.println(string.indexOf('a', 4));	// 4
		System.out.println(string.indexOf("al", 5)); // -1
		
		// substring()
		String string4 = "animals";
		System.out.println(string4.substring(3));  // mals
		System.out.println(string4.substring(string4.indexOf('m')));   // mals
		System.out.println(string4.substring(3, 4));  // m
		System.out.println(string4.substring(3, 7));  // mals
		
		System.out.println(string.substring(3, 3));  // empty string
		System.out.println(string.substring(3,2));  // throws exception
		System.out.println(string.substring(3, 8));	// throws exception
		
		// toLowerCase() and toUpperCase()
		String string5 = "animals";			
		System.out.println(string5.toUpperCase());	// ANIMALS
		System.out.println("Abc123".toLowerCase()); 	// abc123
		
		// equals() and equalsIgnoreCase()
		System.out.println("abc".equals("ABC"));	// false
		System.out.println("ABC".equals("ABC"));	// true
		System.out.println("abc".equalsIgnoreCase("ABC"));	// true
		
		// startsWith() and endsWith()
		System.out.println("abc".startsWith("a"));	// true
		System.out.println("abc".startsWith("A"));  // false
		System.out.println("abc".endsWith("c"));	// true
		System.out.println("abc".endsWith("a"));	// false
		
		// contains()
		System.out.println("abc".contains("b"));	// true
		System.out.println("abc".contains("B"));	// false
		
		// replace()
		System.out.println("abcabc".replace('a', 'A'));	// AbcAbc
		System.out.println("abcabc".replace("a", "A"));	// AbcAbc 
		
		// trim()
		System.out.println("abc".trim()); 	// abc 
		System.out.println("\t   a b c\n".trim()); 	// a b c
		
		
		
	}

}
