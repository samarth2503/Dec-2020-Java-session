package MultiThreadingConcept;

class Test extends Thread
{
	public void run()
	{
		//System.out.println("Child Thread.....");
		System.out.println("Child Thread got executed by "+Thread.currentThread().getName());
	}
}

public class DefiningThread {
	
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println("Default Priority "+t.getPriority());
		
		t.setPriority(7);
		
		System.out.println("Default Priority "+t.getPriority());
		
		Thread t1 = new Thread(t);
		System.out.println(t.getName());
		System.out.println(t.getId());
		t.setName("Samarth");
		
		t1.start();
		System.out.println("Main Thread got executed by "+Thread.currentThread().getName());
		
		System.out.println("Main Thread....");
		System.out.println(t.getName());
		
		System.out.println("Min Priority is "+Thread.MIN_PRIORITY);
		System.out.println("Normal Priority is "+Thread.NORM_PRIORITY);
		System.out.println("Max prority is "+Thread.MAX_PRIORITY);
		
		t1.setPriority(13);
		System.out.println(t1.getPriority());
	}

}
