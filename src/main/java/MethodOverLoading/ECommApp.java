package MethodOverLoading;

public class ECommApp {
	
	public void serach()
	{
		
	}
	
	public void serach(String name, int price)
	{
		
	}
	
	public void serach(String name, int price,String color)
	{
		
	}
	
	public void payment(String CC)
	{
		
	}
	
	public void payment(String UPI, int otp)
	{
		
	}
	
	public void payment(String CC, int otp,String cvv)
	{
		
	}
	
	public String bookingCab(String st, String end)
	{
		System.out.println(st + " to " +end);
		return "Booked";
	}
	
	public void bookingCab(String st, String end, String carType)
	{
		
	}
	
	public boolean bookingCab(String st, String end, String carType,double rating)
	{
		System.out.println(st + " to " + end + " with " + carType + " rating "+rating);
		return true;
	}
	
	public static void main(String[] args) {
		
		ECommApp obj = new ECommApp();
		
		String msg = obj.bookingCab("Bangalore", "Mysore");
		System.out.println(msg);
		
		boolean b = obj.bookingCab("Bangalore", "Mysore","Premium",4.0);
		System.out.println(b);
	}

}
