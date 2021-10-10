package MultiThreadingConcept;

/*
 * 1> yield Method causes to pass current executing Thread to give chance for waiting Thread of same Priority
 * 2> If there is no waiting Thread or all waiting Thread have low priority the same Thread can continue its execution.
 * 3> If Multiple Thread are waiting with same priority,we cant except when thread will get chance it depends on Thread scheduler.
 * 
 */

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread....");
			Thread.yield();
		}
	}
}

public class YeildExample {
	
	public static void main(String[] args)
	{
		DemoThread d = new DemoThread();
		
		d.start();
		//System.out.println("Main Thread Priority "+Thread.currentThread().getPriority());
		//System.out.println("Child Thread Priority "+d.getPriority());
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread....");
			Thread.yield();
		}
	}

}
