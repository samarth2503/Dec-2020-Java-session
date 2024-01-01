package StringConept;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringConcatnation {
	
	public static void main(String[] args) {
		
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		double d1 = 10.33;
		double d2 = 20.33;
		
		// Executio happens from left to right
		// Adding with String is called concatination
		// Adding number is called Arithmetic opertion not concatination.
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+a);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+d1+d2);
		System.out.println(x+y+a+b+d1+d2);
		
		System.out.println("The value of a is : "+a);
		System.out.println("the value of b is : "+b);
		
		System.out.println("The sum of a and b is : "+a+b);
		System.out.println("The sum of a and b is : "+(a+b));
		
		byte b1 = 10;
		System.out.println(b1+"Hello");
		
		int t1 = 10;
		int t2 = 3;
		
		System.out.println(t1/t2);    // Expected answer is 3.333 but since both the number are int the will in int (i.e 3).
		
		System.out.println(10.0/3);		// Either of them is floating value them answer will be in floating, answer is 3.333..
		
		System.out.println(10%2);    // % Modules operator will give reminder as answer
		
		//System.out.println(10%0);    // This is equivalent to 10/0 so it will through exception
		
		System.out.println(11 % 2);  // Answer is 1
		
		System.out.println(0 % 9);   // Answer is 0
		
		System.out.println(10.20 % 2.1);  // Answer will be in floating 
		

	}

}
