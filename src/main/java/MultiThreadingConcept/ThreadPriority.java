package MultiThreadingConcept;

class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread....");
		}
	}
}

public class ThreadPriority {
	
	public static void main(String[] args)
	{
		ThreadDemo t = new ThreadDemo();
		
		t.setPriority(10);
		System.out.println(t.getPriority());
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread....");
		}
	}

}
