package MultiThreadingConcept;

class ThreadJoin extends Thread
{
	public static Thread t;
	
	public void run()
	{
		try {
			t.join();
		}
		catch(Exception e) {}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread.....");
		}
	}
}

public class ThreadJoinExample2 {
	
	public static void main(String[] args) throws InterruptedException
	{
		ThreadJoin.t = Thread.currentThread();
		
		ThreadJoin th = new ThreadJoin();
		
		th.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread.....");
			Thread.sleep(2000);
		}
	}

}
