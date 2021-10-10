package StringConept;

public class SCPPractice1 {

	public static void main(String[] args) {
		
		// whenever we use new keyword for creating string object one copy will be created in scp and another in heap 
		
		String s1 = new String("You cannot change me");				// 2 object will be created in 1 in heap and 1 in scp
		
		String s2 = new String("You cannot change me");				// If we have same content present in scp no new object is created in scp
		
		System.out.println(s1==s2);                                 // false as both are pointing to diff objcet
		
		String s3 = "You cannot change me";
		
		System.out.println(s1==s3);									// false 
		
		String s4 = "You cannot change me";
		
		System.out.println(s3==s4);									// true -- s3 and s4 are literal and point to same object in scp	
		
		String s5 = "You cannot " + "change me";
		
		System.out.println(s4==s5);									// true -- s4 and s5 are literal and point to same object
		
		String s6 = "You cannot ";
		
		String s7 = s6 + "change me";
		
		System.out.println(s4==s7);									// In s7 there is 1 variable and 1 constant the operation will be performed at runtime
		
		final String s8 = "You cannot ";
		
		String s9 = s8+"change me";
		
		System.out.println(s4==s9);									// true

	}

}
