package InheritanceConcept;

public class Audi extends Car{									// Car is PArent Audi is child
	
	@Override
	public void start()
	{
		System.out.println("Audi---start");
	}
	
	public void theftSafety()
	{
		System.out.println("Audi---theftSafety");
	}

}
