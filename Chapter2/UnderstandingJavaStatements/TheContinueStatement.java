
public class TheContinueStatement {

	public static void main(String[] args) {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++){
			for(char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}
	}
	
	/* Output = 1a 3a 4a
	 * 
	 * Remove the FIRST_CHAR_LOOP label in the continue statement
	 * so that control is returned to the inner loop instead of the outer.
	 * Output = 1a 1c 3a 3c 4a 4c
	 * 
	 * Remove the continue statement and associated if-then statement altogether
	 * Output = 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
	 */
	
	
}
