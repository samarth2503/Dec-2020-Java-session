package ConstructorConcept;

public class Page {
	
	public static void t1()
	{
		System.out.println("t1");
		t2();
	}
	
	public static void t2()
	{
		System.out.println("t2");
		t3();
	}
	
	public static void t3()
	{
		System.out.println("t3");
		//header();									// class method cannot be called inside static method as it avaiable only to Object.
	}
	
	public void launch()
	{
		System.out.println("Launch");
		header();
		t1();										// Static method can be called inside non-static method as it is common to all and freely accessable
	}
	
	public void header()
	{
		System.out.println("haeder");
		title();
	}
	
	public void title()
	{
		System.out.println("title");
		close();
	}
	
	public void close()
	{
		System.out.println("close");
	}
	
	public static void main(String[] args)
	{
		Page p = new Page();
		p.launch();
		
		t1();
	}

}
