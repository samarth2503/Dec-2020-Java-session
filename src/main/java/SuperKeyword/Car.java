package SuperKeyword;

public class Car {
	
	String name;
	int price;
	
	public Car()
	{
		System.out.println("Car -- Default Constructor...");
	}
	
	public Car(String name, int price)
	{
		this.name = name;
		this.price = price;
		System.out.println("Car -- Parametrized Constructor...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
