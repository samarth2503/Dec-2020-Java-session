package MultiThreadingConcept;

/* If Thread want to wait until completion of some other Thread then we should go for join method 
 * 
 * If Thread t1 want to wait until completing Thread t2 then t1 has to call t2.join()
 * If t1 execute t2.join then immediately t1 will be entered into waiting state until t2 completes.
 * Once t2 complete then t1 can continue its execution.
 * 
 */
class JoinThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Seeta thread...."+i);
			
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Some Exception...");
			}
		}
	}
}
public class JoinExample {
	
	public static void main(String[] args) throws InterruptedException
	{
		JoinThread t = new JoinThread();
		
		t.start();
		
		//t.join();				// Main Thread will wait until child thread t gets completely executed
		
		t.join(10000);			// wait for 10 sec to continue executing child Thread.
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Rama Thread....");
		}
	}

}
