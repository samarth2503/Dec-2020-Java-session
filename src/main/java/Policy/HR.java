package Policy;

import Super.Employee;

public class HR extends Employee {

	public static void main(String[] args) {
		
		HR h = new HR();
		
		h.m1();
		h.m3();
		
		System.out.println("Name is "+ h.name);
	}

}
