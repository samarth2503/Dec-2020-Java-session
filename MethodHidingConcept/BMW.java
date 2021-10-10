package MethodHidingConcept;

class Car
{
	public static void start()
	{
		System.out.println("Car--- Start method");
	}
}

public class BMW extends Car {
	
	public static void start()
	{
		System.out.println("BMW--- Start method");
	}
	
	public static void main(String[] args)
	{
		BMW b = new BMW();
		
		//BMW.start();
		//Car.start();
	}

}
