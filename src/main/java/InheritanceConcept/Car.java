package InheritanceConcept;

public class Car extends Vechile{							// final class cannot be parent class
															
	
	public void start()											// Method with access specifier as final cannot be overidden.
	{
		System.out.println("Car -- Start");
	}
	
	public void stop()
	{
		System.out.println("Car -- Stop");
	}
	
	public void refuel()
	{
		System.out.println("Car -- Refuel");
	}

	public int test(int i)
	{
		System.out.println("Value of i is "+i);
		return 500;
	}
	
	private void testing()
	{
		System.out.println("Private method cannot be overriden");
	}
}
