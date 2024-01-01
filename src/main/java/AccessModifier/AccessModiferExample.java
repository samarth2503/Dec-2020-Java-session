package AccessModifier;

// Private :- Can be access only in same class not accessible outside class
// Default :- Can be acessed only in same package

class A
{
//	private int i = 10;
//	
//	private void m1()
//	{
//		System.out.println(i);
//	}
	
	int i = 10;
	void m1()
	{
		System.out.println(i);
	}
}

public class AccessModiferExample {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.m1();							// Cannot access as it is private

	}

}
