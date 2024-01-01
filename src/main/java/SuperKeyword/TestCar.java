package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		
		Car b2 = new BMW("BMW 500d",89);
		
		System.out.println("Name is "+b2.name+" and price is "+b2.price);
		
		Car c = new BMW();
		
		System.out.println(c.name+" : "+c.price);

	}

}
