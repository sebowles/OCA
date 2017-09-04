
public class TheSwitchStatement {
	
	public static void main(String[] args){
		
		/* Data types supported by switch statements include the following
		 * byte and Byte
		 * short and Short
		 * char and Character
		 * int and Integer
		 * String
		 * enum values
		 */
		
		/* Compile-time constant values
		 * The values in each case statement must be compile-time constant values
		 * of the same data type as the switch value. This means you can use only
		 * literals, enum constants, or final constant variables of the same data type.
		 * By final constant, we mean that the variable must be marked with the
		 * final modifier and initialized with a literal value in the same expression
		 * in which it is declared
		 */
		/*
		int dayOfWeek = 5;
		switch(dayOfWeek){
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
		*/
		
		/* Output:
		 * Weekday
		 * Saturday
		 * For any given value of dayOfWeek, 5, the code will jump to the default
		 * block and then execute all of the proceeding case statements in order
		 * until it finds a break statement or finishes the structure
		 */
		int dayOfWeek = 5;
		switch(dayOfWeek){
		case 0:
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;
		}
		
		/* If the value oof dayOfWeek was 0, all three statements would be output:
		 * Sunday
		 * Weekday
		 * Saturday
		 * Notice that in this last example, the default is executed since there was
		 * no break statement at the end of the preceeding case block. While the code
		 * will not branch to the default statement if there is a matching case value
		 * within the switch statement, it will execute the default statement if it
		 * encounters it after a case statement for which there is no terminating
		 * break statement.
		 */
		
	}
	
	private int getSortOrder(String firstName, final String lastName){
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch(firstName) {
			case "Test":
				return 52;
			case middleName:	// DOES NOT COMPILE
				id = 5;
				break;
			case suffix:
				id = 0;
				break;
			case lastName:	// DOES NOT COMPILE
				id = 8;
				break;
			case 5:			// DOES NOT COMPILE
				id = 7;
				break;
			case 'J':		// DOES NOT COMPILE
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY:	// DOES NOT COMPILE
				id = 15;
				break;
		}
		
		return id;
		
	}

}
