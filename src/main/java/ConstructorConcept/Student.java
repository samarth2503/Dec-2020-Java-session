/*
 * Constructor will help to create Object on basis given template varibale
 * It is part of class it should be created within class not within method
 * 
 */

package ConstructorConcept;

public class Student {
	
	String name;
	int studId;
	int a;
	
	public Student()
	{
		System.out.println("Inside Default Constructor....");
	}
	
	public Student(int a)
	{
		this.studId = a;
		System.out.println("Value of a is "+a);
	}
	
	public Student(String name)
	{
		this.name= name;
		System.out.println("Name of Student is "+name);
	}
	
	public Student(String name,int studId)
	{
		this.name = name;
		this.studId = studId;
	}
	
	public static void main(String[] args)
	{
		Student s = new Student("Samarth",78);
		System.out.println("Student name is "+s.name+" and Student Id is "+s.studId);
	}
	
	

}
