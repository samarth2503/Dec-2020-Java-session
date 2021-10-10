package MultiThreadingConcept;

class MyRunnable implements Runnable
{
	public void start()
	{
		System.out.println("Inside start Method....");
	}
	
	public void run()
	{
		System.out.println("Inside Run Method.....");
	}
}

public class RunableThreadImplementation {
	
	public static void main(String[] args)
	{
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);			// We have passed object of Runnable class then the run method of that class will be called.
											// If we dont pass any object then default run method will be created.
		//t.start();
		
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		System.out.println("---------T1 Object-----------");
		
		// Case - I
		t1.start();					// New Thread will be created which is responsible for execution of Thread class run method which have empty implementation
		t1.run();					// No New Thread will be created and Thread class run method will be executed just like normal method call. 
		
		System.out.println("---------T2 Object-----------");
		
		//Case - II
		t2.start();					// A new Thread will be created which is responsible for execution of myRunable class run method
		t2.run();					// A Thread wont be created and myRunable run method will be executed just like normal method call
		
		System.out.println("---------Runable Interface-----------");
		r.start();					// We will get complie time error saying 		
		r.run();					// 
	}

}
