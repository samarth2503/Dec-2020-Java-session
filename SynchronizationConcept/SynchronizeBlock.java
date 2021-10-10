package SynchronizationConcept;

/*
 * If very few lines of code require synchronization then it is not recommended to declare entire method as synchronized.
 * We can enclose those few lines of code by using synchronize block.
 * It reduces waiting time of Thread and improve performance of system/application.
 * 
 * Synchronized block
 * a> To get lock of current Object.
 * b> To get lock of particular Object.
 * c> To get class Level Lock.
 * 
 */
class SynchBlock
{
	public void wish(String name)
	{
		;;;;;;;;// 1 lakh lines of code
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Good Morning.....");
				try {
					Thread.sleep(2000);
				}
				catch(Exception e) {}
				System.out.println(name);
			}
		}
		;;;;;;;;// 1 lakh lines of code
	}
}
class MyThread3 extends Thread
{
	SynchBlock d;
	String name;
	
	MyThread3(SynchBlock d,String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}
public class SynchronizeBlock {
	
	public static void main(String[] args)
	{
		
/*		Case 1 :- Regular Output  
		SynchBlock d = new SynchBlock();
		
		MyThread3 t1 = new MyThread3(d,"Dhoni");
		MyThread3 t2 = new MyThread3(d,"Yuvraj");
		
		t1.start();
		t2.start();     */
		
/*		Case 2:- Irregular output   */
		
		SynchBlock d1 = new SynchBlock();
		SynchBlock d2 = new SynchBlock();
		
		MyThread3 t1 = new MyThread3(d1,"Dhoni");
		MyThread3 t2 = new MyThread3(d2,"Yuvraj");
		
		t1.start();
		t2.start();   
	}

}
