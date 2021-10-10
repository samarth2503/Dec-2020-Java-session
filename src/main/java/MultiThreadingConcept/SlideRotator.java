package MultiThreadingConcept;

class ThreadInterrupt extends Thread
{
	public void run()
	{
		try {
			
			for(int i=0;i<10;i++)
			{
				System.out.println("Inside child Thread...");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Inside Interrupted Exception....");
		}
	}
}

public class SlideRotator {
	
	public static void main(String[] args)
	{
		ThreadInterrupt t = new ThreadInterrupt();
		
		t.start();
		t.interrupt();
		
		System.out.println("End of Main Thread....");
	}

}
