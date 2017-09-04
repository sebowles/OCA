
import java.util.List;
import static java.util.Arrays.asList;

public class StaticImports2 {
	
	
	/* If we create an asList method in this class java would give it preference
	 * over the imported one and the method we coded would be used
	 */
	public static void main(String[] args){
		
		List<String> list = asList("one", "two");
		
	}

}
