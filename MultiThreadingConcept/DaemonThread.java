package MultiThreadingConcept;

/*
 * The thread which are executing in background are called daemon threads. Eg :Garbage collector,signal Dispatcher,Attach Listener etc
 * The main Objective of Daemon thread is to provide support for non-daemon threads(main Thread) Eg:- If main Threads runs with low memory then JVM runs garbage collector to destroy useless objects
 * We can check daemon nature of a Thread but using isDaemon() Method of Thread class.
 * We can change daemon nature of thread by using setDaemon(boolean b) method.
 * But changing daemon nature is possible before starting of thread only.
 * After starting thread if we try to change daemon nature we will get run time Exception : IllegalThreadStateException
 * By default main Thread is always non-daemon and for all remaining threads daemon nature will be inherited from parent to child i.e parent thread is daemon then automatically child thread is also daemon
 * If parent thread is non daemon the automatically child thread is also non-daemon.
 * It is impossible to change daemon nature of main thread, because it is already started by JVM at start.
 * Whenever last daemon thread terminate 
 */

class Daemon extends Thread
{
	
}

public class DaemonThread {
	
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().isDaemon());		// false
		
		//Thread.currentThread().setDaemon(true);					// IllegatThreadStateException
		
		Daemon t = new Daemon();
		
		System.out.println(t.isDaemon());							// false
		
		t.setDaemon(true);
		
		System.out.println(t.isDaemon());							// true
	}

}
