package Super;

public class Employee {
	
	public String name;
	protected int age;
	String empId;
	private double salary;
	
	public void m1()
	{
		System.out.println("m1...");
	}
	
	private void m2()
	{
		System.out.println("m2 Method..");
	}
	
	protected void m3()
	{
		System.out.println("m3 Method..");
	}
	
	void m4()
	{
		System.out.println("m4 Method...");
	}

	public static void main(String[] args) {
		
		Employee e= new Employee();
		
		e.name = "Tom";
		e.salary = 34500.78;
		e.empId = "test101";
		e.age = 34;
		
		e.m2();
		e.m3();
		e.m4();

	}

}
