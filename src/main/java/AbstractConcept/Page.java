package AbstractConcept;

// Abstract class - 
// We need declare class as abstract eg:- public abstract class <<Name of class>>
// Abstract class can have abstract and non abstract method both.
// We can't create object for abstract class because abstract class contain abstract method(Without implementation), so it is useless to create object for it.
// Abstract ,final and abstract, static is not and valid combination for method and it is invalid


public abstract class Page {
	
	// Abstract class constructor can be created, but it will be called when you create object of child class.
	public Page()
	{
		System.out.println("Inside Page Class Constructor...");
	}
	
	public abstract void pageTitle();								// Abstract - No body only method declaration.
	
	public abstract void header();
	
	public abstract void url();
	
	// Non-Abstract Method
	public final void pagecontent()
	{
		System.out.println("Page content Method...");
	}
	
	public void logo()
	{
		System.out.println("Page logo....");
	}

}
