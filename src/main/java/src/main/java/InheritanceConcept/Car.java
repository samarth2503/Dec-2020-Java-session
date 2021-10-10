package InheritanceConcept;

public class Car extends Vechile{							// final class cannot be parent class
	
	public static void start()										// cannot be overriden if Final
	{
		System.out.println("Car--Start");
	}
	
	public void stop()
	{
		System.out.println("Car---Stop");
	}
	
	public void refuel()
	{
		System.out.println("Car---Refuel");
	}
	
	@SuppressWarnings("unused")
	private void testing()
	{
		System.out.println("Car ----- Testing");
	}
	
	public static void launch()
	{
		System.out.println("Car---launch");
	}
	
	public final void engine()
	{
		System.out.println("Car---Engine");
	}

}
