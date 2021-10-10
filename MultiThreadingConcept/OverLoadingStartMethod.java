package MultiThreadingConcept;

class StartMethod extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("Inside Start Method....");
	}
	
	public void run()
	{
		System.out.println("Inside Run Method....");
	}
}

public class OverLoadingStartMethod {
	
	public static void main(String[] args)
	{
		StartMethod t = new StartMethod();
		
		t.start();   								// Produced by main Thread and new Thread wont be created.
		System.out.println("Main Method...");
		
		// If we dont override start method then new thread will be created which is responsible to execute run method.
		// If we override start method then only overridden start method will be executed and new thread wont be created.
		
		/*
		 * // Illegal thread state Exception
		 */
		t.start();                                 
		
		// If again try to start the Thread then Run Time exception will be thrown
	}

}
