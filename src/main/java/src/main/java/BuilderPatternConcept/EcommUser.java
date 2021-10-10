package BuilderPatternConcept;

public class EcommUser {

	public static void main(String[] args) {
		
		EcommApp shop = new EcommApp();
		
		shop.doLogin("samarthjain", "Sam@123")
		.doSearch("Nike Shoes")
		.doSearch("Nike Shoes", 10000)
		.addtoCart("Nike Shoes")
		.doPayment("GPAY", "test@123")
		.doLogout();
		
		// OR Another way to write
		
		shop.doLogin().doPayment("PhonePay", "test@890").doLogout();
		
		int orderId = shop.generateOrderId();
	}

}
