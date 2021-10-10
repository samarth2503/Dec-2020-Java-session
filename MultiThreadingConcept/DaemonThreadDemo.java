package MultiThreadingConcept;

class MyThreadDaemon extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread.....");
			
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {}
		}
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		
		MyThreadDaemon t = new MyThreadDaemon();
		
		t.setDaemon(true);
		
		t.start();
		
		System.out.println("End of Main thread....");

	}

}
