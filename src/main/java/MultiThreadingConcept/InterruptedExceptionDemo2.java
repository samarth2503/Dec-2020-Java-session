package MultiThreadingConcept;

class InterruptedExp extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("I am inside Lazy thread "+i);
		}
		
		System.out.println("I want to sleep");
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Interupped Exception....");
		}
	}
}

public class InterruptedExceptionDemo2 {

	public static void main(String[] args)
	{
		InterruptedExp i = new InterruptedExp();
		
		i.start();
		i.interrupt();
		System.out.println("End of Main Thread....");
	}
}
