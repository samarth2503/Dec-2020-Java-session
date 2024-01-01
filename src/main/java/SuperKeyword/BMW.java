package SuperKeyword;

public class BMW extends Car{
	

	public BMW()
	{
		super();
		this.name = "Samarth";
		this.price = 500;
		System.out.println("BMW Default constructor...");
	}
	
	public BMW(String name, int price)
	{
		super(name,price);
		System.out.println("BMW Parametrized constructor...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
