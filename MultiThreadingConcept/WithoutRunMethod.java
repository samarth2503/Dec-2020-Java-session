package MultiThreadingConcept;

/* Highy recommed to oveeride run Method. Or dont use Muthithreading concept
 * 
 */

class Demo extends Thread
{
	
}

public class WithoutRunMethod {
	
	public static void main(String[] args)
	{
		Demo th = new Demo();
		
		th.start();							
		System.out.println("Main Method..");
	}

}
