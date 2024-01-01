/*
 *  Class : - It is Template from which we can create n number of Object.
 *  Object :- To create Object we use new keyword. It will be stored in heap memory
 *  Variable e1 which is referring Object will be stored in Stack memory.
 *  Object have copy of variable
 *  
 */

package ClassesandObject;

public class Employeeclass {
	
	// Properties or variabl should be created before main method in inside main method
	// Object will be created in Heap memory
	// Reference Variable for object will be stored in stack memory
	String name;														// name,age,empid,salary are class variable or instance variable		
	int age;														
	int empid;
	double salary;
	
	public static void main(String[] args)
	{
		Employeeclass e1 = new Employeeclass();							// new EmployeeClass() is Object and e1 is reference or name to Object
		
		e1.name="Tom";
		e1.age=20;
		e1.empid = 1001;
		e1.salary = 78900.7;
		
		System.out.println(e1.name +" "+e1.age+" "+e1.empid+" "+e1.salary);				// Tom 20 1001 7900.7
		
		Employeeclass e2 = new Employeeclass();
		
		e2.name="Shiva";
		e2.age=30;
		
		System.out.println(e2.name +" "+e2.age+" "+e2.empid+" "+e2.salary);				// Shiva 30 0 0.0
		
	}
	

}
