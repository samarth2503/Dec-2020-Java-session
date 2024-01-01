package ClassesandObject;

public class Car {
	
	String name;
	int price;
	boolean isAvailable;
	String model;
	String color;
	boolean isAutomatic;
	
	
	public static void main(String[] args)
	{
		Car c1 = new Car();
		
		c1.name = "BMW";
		c1.price = 75;
		c1.model = "520d";
		c1.isAvailable = true;
		c1.isAutomatic = true;
		c1.color = "Black";
		
		System.out.println(c1.name + " "+ c1.price+" "+c1.model+" "+c1.isAvailable+" "+c1.isAutomatic+" "+c1.color);
		
	}

}
