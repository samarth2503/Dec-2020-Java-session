package ExceptionHandlingconcept;

// It is a bad practice to throws Exception from one method to another method.

public class ThrowsKeyword {
	
	public void m1() throws ArithmeticException
	{
		System.out.println("m1");
		m2();
	}
	
	public void m2() throws ArithmeticException
	{
		System.out.println("m2");
		m3();
	}
	
	public void m3() throws ArithmeticException
	{
		System.out.println("m3");
		m4();
	}
	
	public void m4() throws ArithmeticException
	{
		System.out.println("m4");
		
		int i = 9/0;
	}

	public static void main(String[] args) throws ArithmeticException
	{
		ThrowsKeyword th = new ThrowsKeyword();
		th.m4();
	}
}
