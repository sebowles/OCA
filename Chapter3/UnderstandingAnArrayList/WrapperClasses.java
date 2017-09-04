
public class WrapperClasses {

	public static void main(String[] args) {
		boolean a = Boolean.parseBoolean("true");
		Boolean a2 = Boolean.valueOf("TRUE");
		
		byte b = Byte.parseByte("1");
		Byte b2 = Byte.valueOf("2");
		
		short c = Short.parseShort("1");
		Short c2 = Short.valueOf("2");
		
		int d = Integer.parseInt("1");
		Integer d2 = Integer.valueOf("2");
		
		long e = Long.parseLong("1");
		Long e2 = Long.valueOf("2");
		
		float f = Float.parseFloat("1");
		Float f2 = Float.valueOf("2");
		
		double g = Double.parseDouble("1");
		Double g2 = Double.valueOf("2");
		
		// Character doesn't participate in the parse/valueOf methods

	}

}
