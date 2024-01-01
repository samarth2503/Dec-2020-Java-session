package WrapperClassess;

/*
 * Wrapper Class Constructor contain 2 constructor.
 * One which accpet primitive type as argument, Second which accepts String as argument
 * All wrapper classes except Character class contains static valueOf method to create wrapper object for given string.
 */
public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer I = new Integer(10);
		Integer I1 = new Integer("10");
		
		Double D = new Double(13.45);
		Double D1 = new Double("34.56");
		
		Float f = new Float(10.5f);
		Float f1 = new Float(10.54);		// Passing argument as Double
		Float f2 = new Float("10.56f");      // Passing arugemnt as string
		
		Boolean b1 = new Boolean("yes");	// false
		Boolean b2 = new Boolean("no");		// false
		System.out.println(b1);				//false
		System.out.println(b2);				// false
		System.out.println(b1.equals(b2));	// true
		
		
		Integer I2 = Integer.valueOf("10");
		Float F = Float.valueOf("10.5f");
		Double D2 = Double.valueOf("10.5");
		Boolean B = Boolean.valueOf("true");
		
		// valueOf(String,radix) Only Byte,Short,Integer,Long contains this method
		// Allowed radix range ---> 2 to 36
		Integer.valueOf("1111", 2);
		System.out.println(Byte.valueOf("11",36));
		
		// All Wrapper class include Charcter class contain valueOf(primitive) method
		
		Integer.valueOf(10);
		Float.valueOf(10.5f);
		Double.valueOf(10.5);
		Boolean.valueOf(true);
		
		// xxxValue():
		/*
		 * byteValue(),shortValue(),intValue(),longValue(),floatValue(),doubleValue()
		 */
		
		Integer I3 = new Integer(130);
		
		System.out.println(I3.byteValue());
		System.out.println(I3.intValue());
		System.out.println(I3.longValue());
		System.out.println(I3.floatValue());
		System.out.println(I3.doubleValue());
		System.out.println(I3.longValue());
		
		// For given Charcter object if we want to find its Primitive then go for charValue()
		Character ch = new Character('a');
		char c = ch.charValue(); 
		System.out.println(c);
		
		// Form 4:- Parsexxx(String s) method
		
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("10.56");
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
		// parseXxx(String s,int radix) :- To find primitive value for given String
		
		int i1 = Integer.parseInt("1111",2);
		System.out.println(i1);
	}

}
