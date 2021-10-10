package MultiThreadingConcept;

/* 
 * When two thread wait for each other 
 * Because of synchronized keyword causes deadlock situation.
 * Several prevention technique are available.
 */

class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread 1 starts Execution of d1 method");
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Thread 1 tries to call B's last Method");
		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("Inside A's last method");
	}
	
}

class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread 2 starts execution of d2 method");
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e)
		{}
		System.out.println("Thread 2 tries to call A's last method");
		a.last();
	}
	
	
	public synchronized void last()
	{
		System.out.println("Inside B's last method");
	}
	
}

public class DeadLock extends Thread{
	
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		a.d1(b);											// Will be executed by Main Thread
	}
	
	public void run()
	{
		b.d2(a);                                            // Will be executed by Child Thread
	}
	
	public static void main() throws InterruptedException
	{
		//Thread.currentThread().join();                    // It will stop execution of main thread itself.
		
		DeadLock d = new DeadLock();
		d.m1();
		
	}

}
