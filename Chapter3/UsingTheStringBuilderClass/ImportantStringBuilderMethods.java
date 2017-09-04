
public class ImportantStringBuilderMethods {
	
	public static void main(String[] args){
		
		// charAt(), indexOf(), length(), and substring()
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		
		// append()
		StringBuilder sb2 = new StringBuilder().append(1).append('c');
		sb2.append("-").append(true);
		System.out.println(sb);		// 1c-true
		
		// insert()
		StringBuilder sb3 = new StringBuilder("animals");
		sb.insert(7, "-");			// sb = animals-
		sb.insert(0,  "-");			// sb = -animals-
		sb.insert(4,  "-");			// sb = -ani-mals
		System.out.println(sb);
		
		// delete() and deleteCharAt()
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb.delete(1, 3);		// sb = adef
		sb.deleteCharAt(5);		// throws an exception
		
		// reverse()
		StringBuilder sb5 = new StringBuilder("ABC");
		sb5.reverse();
		System.out.println(sb5);
		
		// toString()
		String s = sb.toString();
		
		/* StringBuilder vs. StringBuffer
		 * StringBuffer does the same thing as StringBuilder but more slowly because it is thread safe
		 */
		

	}

}
