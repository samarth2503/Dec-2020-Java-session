/*
 * Overriding :- It is process in which Parent class method which is available to child method through inheritnce can change the implementation of child method,with same method Signature
 * Idependent Method:- Method which is part of child class(not inherited), not overriden and cannot be accessed with parent refernce child Object(Topcasting)
 * 
 */

package InheritanceConcept;

public class BMW extends Car {
	
	
	public static void start()
	{
		System.out.println("BMW---start");
	}
	
	public void autoParking()											// Idependent Methd 
	{
		System.out.println("BMW---AutoParking");
	}
	
	//@Override															// Static methods are not part of Object
	public static void launch()
	{
		System.out.println("BMW---launch");
	}
	
	//@Override															// 	Private methods cannot be overriden		
	private void testing()
	{
		System.out.println("BMW---Testing");
	}
	
//	public void engine()
//	{
//		System.out.println("BMW---Engine");
//	}
//	
	

}
