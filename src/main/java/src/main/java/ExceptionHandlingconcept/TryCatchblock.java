package ExceptionHandlingconcept;

public class TryCatchblock {
	
	String name;
	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		
		try {
			int d = 9/0;
		}
		catch(Exception e)
		{
			System.out.println("Some Exception has Occured");
			e.printStackTrace();
		}
		
		
		try {																	// Throwable is parent and Exception is child
			int d = 9/0;
		}
		catch(Throwable e)
		{
			System.out.println("Some Exception has Occured");
			e.printStackTrace();
		}
		
		System.out.println("Bye...");
		
		try {
			
			TryCatchblock tb =null;
			tb.name="Tom";
			System.out.println("Name is "+tb.name);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception has Occured");
			e.printStackTrace();
		}
		
		// Error and exception are child of Throwable class
		// exception Occur becuase of your code logic
		// Error:- Memory issue,Fatal error(JDK corrupted),syntax error,configration issue

	}

}
