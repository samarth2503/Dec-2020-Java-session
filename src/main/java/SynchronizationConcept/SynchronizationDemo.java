package SynchronizationConcept;

/* Synchronization Keyword applicable for methods,block but not for class and varibale 
 * Race Condition :- If multiple Thread operating on same Java object then may be possibility of data inconsitency.
 * We can overcome this problem by using synchronization keyword
 * Object Lock :- Whenever Thread required to execute instance synchronized method
 * Class Level Lock :- when Thread wants to execute static synchronized method
 */

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread
{
	private Display d;
	private String name;
	
	public MyThread(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		
/*
 * 		Case 1:- With single Object
 */
		Display d3 = new Display();
		
		MyThread t3 = new MyThread(d3,"Dhoni");
		MyThread t4 = new MyThread(d3,"Yuvraj");
		
		t3.start();
		t4.start();
		
/*
 * 	Case 2:- With multiple Object
 * 	Multiple Thread operating on multiple java Object then synchronization is not required.
 */
		
		Display d1 = new Display();
		Display d2 = new Display();
		
		MyThread t1 = new MyThread(d1,"Dhoni");
		MyThread t2 = new MyThread(d2,"Yuvraj");
		
		t1.start();
		t2.start();
	}

}
