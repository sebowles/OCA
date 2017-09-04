
public class MethodChaining {

	public static void main(String[] args) {
		String start = "AniMal   ";
		String trimmed = start.trim(); 	// "AniMal"
		String lowercase = trimmed.toLowerCase(); 		// "animal"
		String result = lowercase.replace('a', 'A');	// "AnimAl"
		System.out.println(result);
		
		String result2 = "AniMal   ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
 
	}

}
