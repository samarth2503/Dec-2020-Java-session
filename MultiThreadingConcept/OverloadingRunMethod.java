package MultiThreadingConcept;

/* In overloaded run method method only the method with no args will be called 
 * If we don't override run method then default run method of Thread class will be executed.
 * 
 */

class RunMethod extends Thread
{
	
	public void run()
	{
		System.out.println("No-arg run Method.....");
	}
	
	public void run(int i)
	{
		System.out.println("Arg run Method.....");
	}
}

public class OverloadingRunMethod {
	
	public static void main(String[] args)
	{
		RunMethod r = new RunMethod();
		
		r.start();
		//r.run();
	}

}
