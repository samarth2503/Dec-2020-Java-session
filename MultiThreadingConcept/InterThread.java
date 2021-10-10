package MultiThreadingConcept;

/* 
 * Two Thread can communicate with each Other using wait(),notify(), notify All() Method
 * wait(),notify() and notifyAll() methods are present in Object class,but not in Thread class
 * wait(),notify() and notifyAll() can be called only from Synchronized area otherwise we will RE(IllegalMonitorStateException)
 * If thread call wait method on any Object it immediately release lock of that particular Object and enter into Waiting state. 
 * If Thread call Notify() on any Object it releases the lock of Object but not immediately.
 * Expect wait,notify and notifyAll there is no other method(yield,join,sleep) in Thread that releases lock.
 * We can use notify method to give notification to only one waiting thread,If multiple threads are waiting then only one thread is notified and remaining thread have to wait for further notification
 * Which thread will be notified we can't expect it depends on JVM.
 * notifyAll() :- We use this method to give notification for all waiting threads for a particular object.
 * Even though multiple thread notified but execution will be performed one by one because Threads require lock and only one lock is available.
 * 
 */

class ThreadB extends Thread
{
	int total = 0;
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child Thread started Calculation.....");
			
			for(int i=1;i<101;i++)
			{
				total = total + i;
			}
			
			System.out.println("Child Thread giving Notification.....");
			
			this.notify();
		}
	}
}

public class InterThread {
	
	public static void main(String[] args) throws InterruptedException
	{
		ThreadB b = new ThreadB();
		
		b.start();
		Thread.sleep(10000);
		synchronized(b)
		{
			System.out.println("Main Thread trying to calling wait method.....");
			b.wait();
			System.out.println("Main Thread got notification.....");
		}
		
		System.out.println(b.total);
	}
}


