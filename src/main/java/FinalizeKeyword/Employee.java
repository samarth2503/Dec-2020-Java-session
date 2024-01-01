package FinalizeKeyword;

import FinalizeKeyword.Person;

public class Employee {
	
	@Override
	public void finalize()
	{
		System.out.println("Inside Employee class Finalize Method...");
	}

	public static void main(String[] args) {
		
		System.out.println("Emp class...");
		
		Person p = new Person();
		p=null;
		
		Employee e = new Employee();									// Finalize Method will be called if the class contain finalize method
		e = null;
		System.gc();
		
		//System.gc();
		
		System.out.println("Emp class is done...");
	}

}
