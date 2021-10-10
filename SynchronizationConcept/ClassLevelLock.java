package SynchronizationConcept;

/* 
 * Class Level Lock :- Every class in java has unique lock which is known as class level lock.
 * If a thread wants to execute static synchronize method then thread require class level lock.
 * Once Thread got class level lock it is allowed to execute any static synchronized method of that class.
 * Once method execution complete automatically thread release lock.
 * 
 * When Thread execute static synchronize method remaining Thread are not allowed to execute any static synchronize method of that class simultaneously.
 * But remaining thread are allowed to execute following method simultaneously
 *  Normal static methods.
 *  Synchronized instance method.
 *  Normal Instance Method
 */

class DisplayNumberChar
{
	public static synchronized void displayn()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	public static synchronized void displayc()
	{
		for(int i=65;i<75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {}
		}
	}
}

class Mythread1 extends Thread
{
	DisplayNumberChar d;
	
	Mythread1(DisplayNumberChar d)
	{
		this.d = d;
	}
	
	public void run()
	{
		d.displayc();
	}
}

class Mythread2 extends Thread
{
	DisplayNumberChar d;
	
	Mythread2(DisplayNumberChar d)
	{
		this.d = d;
	}
	
	public void run()
	{
		d.displayn();
	}
}

public class ClassLevelLock {
	
	public static void main(String[] args)
	{
		DisplayNumberChar d = new DisplayNumberChar();
		
		Mythread1 t1 = new Mythread1(d);
		Mythread2 t2 = new Mythread2(d);
		
		t1.start();
		t2.start();	
	}
}
