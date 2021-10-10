package StaticConcept;

public class StaticKeyword {
	
	String name;
	static int age;
	
	public static void getEmail()
	{
		System.out.println("Get mail Method");
	}
	
	public static void main(String[] agrs)
	{
		StaticKeyword s = new StaticKeyword();
		
		s.name="Tom";
		
		// Can access static method using classname
		StaticKeyword.getEmail();
		
		// access Static member without using name
		age=25;
		
		// Can access Static method using object name
		s.getEmail();
	}

}
