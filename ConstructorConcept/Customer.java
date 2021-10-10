package ConstructorConcept;

public class Customer {
	
	String name;
	String city;
	int custid;
	String offerId;
	boolean isActive;
	long age;
	
	public Customer()
	{
		System.out.println("Default constructor");
	}
	
	public Customer(String n,int c)
	{
		// It will print default value of String and int as we have not initalized name and custid of global varibale
		name=n;
		custid=c;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Samarth",1002);
		System.out.println(c1.name);
		System.out.println(c1.custid);
		System.out.println("Customer Name is "+c1.name);
		
		
	}

}
