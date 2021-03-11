package ClassesandObject;

public class Car {
	
	String model;
	String color;														// OBMW can have different color
	String name;
	int price;
	boolean isAvailable;
	boolean isAutomatic;
	
	public static void main(String[] args)
	{
		Car c1 = new Car();
		
		c1.model = "MX100";
		c1.name = "BMW";
		c1.price = 700000;
		c1.isAvailable = true;
		c1.isAutomatic = true;
		
	}

}
