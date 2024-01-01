package StringConept;

public class IncrementDecrement {

	public static void main(String[] args) {

		// Post Increment: ++
		int m = 1;
		int n = m++;
		
		System.out.println(m);
		System.out.println(n);
		
		int p = -99;
		int q = p++;
		
		System.out.println(p);
		System.out.println(q);
		
		// Pre Increment: 
		
		int a = -10;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		// Post decrement
		
		int m1 = 1;
		int n1 = m1--;
		
		System.out.println(m1);
		System.out.println(n1);
		
		int a1 = -10;
		int b1 = --a;
		
		System.out.println(a1);
		System.out.println(b1);
		
		int m2 = 100;
		System.out.println("the value od m2 is "+ m2++);
		System.out.println("the value of m2 is "+m2);

	}

}
