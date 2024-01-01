package ConstructorConcept;

import java.io.PrintStream;

public class Customer {
	
	// Global variable
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
	
	public Customer(String n,int c)							// Params inside constructor is a local variable.
	{
		// It will print default value of String and int as we have not initalized name and custid of global varibale
		name=n;
		custid=c;
	}
	
	public Customer(String name, String city) {
		
		this.name = name;
		this.city = city;
	}

	public Customer(String name, String city, int custid, String offerId, boolean isActive, long age) {
		
		this.name = name;
		this.city = city;
		this.custid = custid;
		this.offerId = offerId;
		this.isActive = isActive;
		this.age = age;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Samarth",1002);      		// When we pass can argument value by this we are intilalizing local variable not global variable
		System.out.println(c1.name);						  	// c1.name is global variable not local variable
		System.out.println(c1.custid);
		System.out.println("Customer Name is "+c1.name);
		
		Customer c2 = new Customer("Rakesh","Bangalore",203,"78ID",true,34);
		System.out.println(c2.name+" "+c2.age+" "+c2.custid+" "+c2.offerId);
		
	}

	

}
