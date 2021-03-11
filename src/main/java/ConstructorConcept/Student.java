/*
 * Constructor will help to create Object on basis given template varibale
 * It is part of class it should be created within class not within method
 * 
 */

package ConstructorConcept;

public class Student {
	
	String name;
	int rollNumber;
	String standard;
	boolean isActive;
	String city;
	
	public Student()
	{
		System.out.println("Default Constructor");
	}
	
	public Student(String name)
	{
		System.out.println("One param "+name);
	}
	
	public String getName()
	{
		return name;
	}
	
	public Student(int a)
	{
		System.out.println("One param "+a);
	}
	
	public static void main(String[] args)
	{
		Student stu = new Student("Samarth");
		System.out.println(stu.name+" "+stu.rollNumber);
		stu.getName();
	}

}
