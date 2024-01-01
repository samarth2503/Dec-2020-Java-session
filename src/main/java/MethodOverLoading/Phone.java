package MethodOverLoading;

public class Phone {
	
	public int getstudentMarks(String name)
	{
		System.err.println("Name of  student is "+ name);
		
		if(name.equals("Samarth"))
		{
			return 90;
		}
		else if(name.equals("Durjan"))
		{
			return 100;
		}
		else if(name.equals("Alex"))
		{
			return 80;
		}
		else {
			System.out.println("Student not found...");
			return -1;
		}
	}
	
	public int getStMarks(String name)
	{
		int marks = -1;
		System.err.println("Name of  student is "+ name);
		
		if(name.equals("Samarth"))
		{
			marks = 90;
		}
		else if(name.equals("Durjan"))
		{
			marks = 100;
		}
		else if(name.equals("Alex"))
		{
			marks=80;
		}
		else {
			System.out.println("Student not found...");
		}
		
		return marks;
	}

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		int marks = p.getStMarks("Samarth");
		System.out.println("Marks of Samarth is "+marks);

	}

}
