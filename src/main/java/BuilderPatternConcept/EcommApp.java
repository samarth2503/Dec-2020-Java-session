package BuilderPatternConcept;

// We can't do verification in builder pattern it's the disadvantages of 
public class EcommApp {
	
	public EcommApp doLogin()
	{
		System.out.println("Default Login...");
		return this;
	}
	
	public EcommApp doLogin(String un,String pwd)
	{
		System.out.println("Username is "+un+" and Password is "+pwd);
		return this;
	}
	
	public EcommApp doSearch(String prodName)
	{
		System.out.println("Product Name is "+prodName);
		return this;
	}
	
	public EcommApp doSearch(String prodName,int price)
	{
		System.out.println("Product Name is "+prodName+" and Price is "+price);
		return this;
	}
	
	public EcommApp selectProduct(String prodName,int price)
	{
		System.out.println("Product Name is "+prodName+" and Price is "+price);
		return this;
	}
	
	public EcommApp addtoCart(String prodName)
	{
		System.out.println("Product "+prodName+" is addedd to the Cart");
		return this;
	}
	
	public int generateOrderId()
	{
		//System.out.println("Product Name is "+prodName+" and Price is "+price);
		return 1002;
	}
	
	public EcommApp doPayment(String paymentMode,String pwd)
	{
		System.out.println("Payment Mode is "+paymentMode+" and passwor is "+pwd);
		return this;
	}
	
	public EcommApp doLogout()
	{
		System.out.println("Logging Out of System");
		return this;
	}

}
