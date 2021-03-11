package MethodOverLoading;

public class MethOverTest2 {
	
	// Case-2(child type arugement and Parent type arugement)
	// Priority will be given to child type
	
	public void m1(String s)
	{
		System.out.println("String type s is "+s);
	}
	
	public void m1(Object o)
	{
		System.out.println("Object type O is "+o);
	}
	
	// Case-3 (Having same parent)
	
	/*public void m1(StringBuffer sb)
	{
		System.out.println("Object type O is "+sb);						// It will throw Error as ambigious method
	} */
	
	// Case-4 (Var-args method gets least priority 
	
	
	// Case-5(Automatic Promation)
	
	public void m2(long l)
	{
		System.out.println("Long value is "+l);
		
	}
	
	public void m2(double d)
	{
		System.out.println("Double value is "+d);
	}
	
	public void m2(int i)
	{
		System.out.println("Int value is "+i);
		
	}
	
	
	public static void main(String[] args)
	{
		MethOverTest2 t = new MethOverTest2();
		
		t.m1("Durga");
		t.m1(new Object());
		t.m1(null);
		
		t.m2(1);
		t.m2(10.5f);
	}

}
