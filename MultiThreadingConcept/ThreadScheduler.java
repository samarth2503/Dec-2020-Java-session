package MultiThreadingConcept;

/* Thread Scheduler :- It is the part of JVM
 * 
 * 1. It is responsible to schedule thread. 
 * 2. If multiple thread are waiting then when thread to execute is decided by thread scheduler.
 * 
 */

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Inside Child Thread....");
		}
//		System.out.println("No Arg run Method...");
	}
	
	public void run(int i)
	{
		for(int j=0;j<10;j++)
		{
			System.out.println("Inside Child Thread....");
		}
//		System.out.println("Arg run Method...");
	}
}

public class ThreadScheduler {
	
	public static void main(String[] arg)
	{
		MyThread th = new MyThread();
		th.start();							// A New thread will be created and run method will be executed
		
//		th.run();							// No New Thread will be created.
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Inside Main Thread....");
		}
		
	}
	
	
}
