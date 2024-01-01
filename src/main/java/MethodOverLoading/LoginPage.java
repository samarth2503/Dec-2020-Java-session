package MethodOverLoading;

// Within same class
// We have different method with same name, but with different params(different data types) and different parameter sequence.
// Method Overloading aka Compile time Overloading

public class LoginPage {
	
	
	
	public void login()
	{
		System.out.println("Default Login...");
	}
	
	public void login(long phoneNumber)
	{
		System.out.println("Login with phone Number: "+ phoneNumber);
	}
	
	public void login(long phoneNumber,int otp)
	{
		System.out.println("Login with phone Number: "+ phoneNumber+" and otp is :"+otp);
	}
	
//	public void login(int otp,long phoneNumber)
//	{
//		System.out.println("Login with phone Number: "+ phoneNumber+" and otp is :"+otp);
//	}
	
	public void login(String un, String pwd)
	{
		System.out.println("USer name is "+un+" password is "+pwd);
	}
	
	

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.login(232323232, 8856);
		lp.login("Samarth", "Sam@123");
		lp.login();

	}

}
