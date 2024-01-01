package JavaSession;

public class Datatypes {
	
/**
 * This class is used to explain different Data types in Java
 * Strict Data type/ Static data type - We need to provide data type of varibale while declaring or initalizing the varibale.
 * @param args
 */
	
	public static void main(String[] args)
	{
		//Primitive DataType:
		// 		1. Booelan Type: true/false
		//      2. Numeric Type:
		// 				b.1 character : char
		//				b.2 Integral:
		//					b.2.1 : Integer : byte,int,long,double
		// 					b.2.1 : floating point : float,double
		// Non-Primitive Data type :- string,arrays,Classes,Interface ....Object
		
		// byte
		//size: 1byte = 8bits
		//range : -128 to 127
		
		byte b1 = 10;
		b1 = 20;
		System.out.println(b1);
		
		//short
		// size : 2bytes=16bit
		// range: -32768 to 32767
		
		short s = 100;
		System.out.println(s);
		
		// int
		// size : 4byte = 32bit
		// range : -2147483648 to 2147483647
		
		int i = 1000;
		System.out.println(i);
		int i1 = -10;
		int i2 = 400;
		System.out.println(i1);
		
		System.out.println(i+i1+i2);
		
		// long
		// size: 8bytes = 64 bit
		// range :
		
		long l1 = 1000000;
		System.out.println(l1);
		
		// float
		// size 4 byte = 32bit
		// range : upto 7 digits after .
		float f1 = 12.33f;
		float f2 = (float)18.99;
		
		System.out.println(f1+" "+f2);
		
		// double
		// size: 8bytes = 64bit
		// range: upto 16 digits after .
		double d1 = 12.333333;
		
		// char --> Only singel digit value (can be alphabet, digit or special character)
		// 2bytes = 16bit
		// UNICODE + LANGUAGE CODE --> ASCII Code
		
		//a-z : 97 to 122
		//A-Z: 65 to 90
		//0-9 : 48 to 57
		char c1 = 'a'; //a-z
		char c11 = 'b';
		char c2 = '4'; // 1-9
		char c3 = '&'; // 
		
		System.out.println(c1);
		System.out.println(c1+c11);
		
		// Boolean value
		// size: ~1 bit
		boolean flag = true;
		boolean flag1 = false;
		
		// String: defualt class in java
		// not aprimitive data type
		
		String str = "Hello World";
		System.out.println(str);
		
		int d = 128;
		System.out.println((byte)d);
		
		char d2 = (char)99;
		System.out.println(d2);
		
	}

}
