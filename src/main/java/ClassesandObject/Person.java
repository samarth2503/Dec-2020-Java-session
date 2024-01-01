package ClassesandObject;

public class Person {
	
	// Properties or variable act as template
	String name;
	String city;
	int age;
	
	public static void main(String[] args)
	{
		Person p1 = new Person();
		
		p1.name="Tom";
		p1.city="Mumbai";
		p1.age=27;
		
		Person p2 = new Person();
		
		p2.name="Suman";
		p2.city="Pune";
		p2.age=25;
		
		Person p3 = new Person();
		
		p3.name="Samarth";
		p3.city="Nagpur";
		p3.age=30;
		
		Person p4 = new Person();
		
		p4.name="Alex";
		p4.city="Chennai";
		p4.age=31;
		
		Person p5 = new Person();
		
		p5.name="Jordan";
		p4.city="Hyderabad";
		p4.age=43;
		
		//System.out.println(p1.name+" "+p1.city+" "+p1.age);				// Before refering
		
		p1=p2;															// Reference exchange mechanism
		
		System.out.println(p1.name+" "+p1.city+" "+p1.age);				// p1 has break the refernce with (Tom) and p1 and p2 assigned to suman
		System.out.println(p2.name+" "+p2.city+" "+p2.age);				// After refering
		
		p2=p3;
		
		System.out.println(p2.name+" "+p2.city+" "+p2.age);				
		System.out.println(p3.name+" "+p3.city+" "+p3.age);	
		
		p3=p1;
		
		System.out.println(p3.name+" "+p3.city+" "+p3.age);				
		System.out.println(p1.name+" "+p1.city+" "+p1.age);	
		
		p5=p1;
		
		System.out.println(p5.name+" "+p5.city+" "+p5.age);				
		System.out.println(p1.name+" "+p1.city+" "+p1.age);	
		
	}

}
