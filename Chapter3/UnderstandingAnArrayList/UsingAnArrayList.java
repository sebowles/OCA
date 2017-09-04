import java.util.ArrayList;
import java.util.List;

public class UsingAnArrayList {

	public static void main(String[] args) {
		// add()
		ArrayList list = new ArrayList();
		list.add("hawk");			// [hawk]
		list.add(Boolean.TRUE);		// [hawk, true]
		System.out.println(list);	// [hawk, true]
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
//		safer.add(Boolean.TRUE);	// DORES NOT COMPILE
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");				// [hawk]
		birds.add(1, "robin");			// [hawk, robin]
		birds.add(0, "blue jay");		// [blue jay, hawk, robin]
		birds.add(1, "cardinal");		// [blue jay, cardinal, hawk, robin]
		System.out.println(birds);		// [blue jay, cardinal, hawk, robin]
		
		// remove()
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); 	// [hawk]
		birds2.add("hawk");		// [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); 	// prints false
		System.out.println(birds2.remove("hawk"));	// prints true
		System.out.println(birds.remove(0)); 	// prints hawk
		System.out.println(birds); 	// []
		
		
		// set()
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk");		//[hawk]
		System.out.println(birds.size()); 	// 1
		birds.set(0, "robin"); 		// [robin]
		System.out.println(birds.size());	// 1
		birds.set(1,  "robin"); 	// IndexOutOfBoundsException
		
		// isEmpty() and size()
		System.out.println(birds.isEmpty());  		 // true
		System.out.println(birds.size());		// 0
		birds.add("hawk");		// [hawk]
		birds.add("hawk");		// [hawk, hawk]
		System.out.println(birds.isEmpty());  	// false
		System.out.println(birds.size()); 		// 2
		
		// clear()
		List<String> birds4 = new ArrayList<>();
		birds4.add("hawk");						// [hawk]
		birds4.add("hawk");						// [hawk, hawk]
		System.out.println(birds4.isEmpty());	// false
		System.out.println(birds4.size());		// 2
		birds4.clear();							// []
		System.out.println(birds4.isEmpty());	// true
		System.out.println(birds4.size());		// 0
		
		// contains()
		List<String> birds5 = new ArrayList<>();
		birds5.add("hawk");								// [hawk]
		System.out.println(birds5.contains("hawk"));	// true
		System.out.println(birds5.contains("robin"));	// false
		
		// equals()
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));	// true
		one.add("a");							// [a]
		System.out.println(one.equals(two));	// false
		two.add("a");							// [a]
		System.out.println(one.equals(two));	// true
		one.add("b");							// [a,b]
		two.add(0, "b");						// [b,a]
		System.out.println(one.equals(two));	// false
		
		
		

	}

}
