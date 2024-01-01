package StaticConcept;

public class StaticMethOverloading {
	
	public static void test()
	{
		System.out.println("Default Method");
	}
	
	public static void test(long l,int i)
	{
		System.out.println("Long and int variable");
	}
	
	public static void test(int i,long l)
	{
		System.out.println("int and long variable");
	}
	
	public static void test(String s,int i)
	{
		System.out.println("String and int variable");
		
	}
	
	public static void main(String[] args)
	{
		test("A",100);
	}

}
