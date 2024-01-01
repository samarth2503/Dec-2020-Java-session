/*
 * Overriding :- It is process in which Parent class method which is available to child method through inheritance can change the implementation of child method,with same method Signature
 * Independent Method:- Method which is part of child class(not inherited), not overridden and cannot be accessed with parent reference child Object(Topcasting)
 * 
 * Rules of Method Overriding -
 * When we have a method in parent class and same method in child class with same name and with same number of parameters.
 */

package InheritanceConcept;

public class BMW extends Car {
	
	@Override
	public void start()													// BMW own start method, and it is overridden from Car class(Parent)
	{
		System.out.println("BMW -- start");
	}
	
	public void autoParking()											// Independent Method 
	{
		System.out.println("BMW---AutoParking");
	}
	
	//@Override															// Static methods are not part of Object
	public static void launch()
	{
		System.out.println("BMW---launch");
	}
	
	//@Override															// 	Private methods cannot be overridden		
	private void testing()
	{
		System.out.println("BMW---Testing");
	}
	
//	@Override
//	public void engine()
//	{
//		System.out.println("BMW---Engine");
//	}
	
	public int test(int i)
	{
		System.out.println("Value of i is "+i);
		return 300;
	}
	
	

}
