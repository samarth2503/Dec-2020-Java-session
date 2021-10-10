package ExceptionHandlingconcept;

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
		int a =9/0;
	}
	
	public static void main(String[] args) throws ArithmeticException
	{
		ThrowsKeyword th = new ThrowsKeyword();							// To call instnce method inside static method we need to crate using object
		th.m1();														
	}
}
