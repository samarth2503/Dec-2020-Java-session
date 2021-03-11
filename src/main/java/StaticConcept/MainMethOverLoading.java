/************** Interview Question ********************
 *  Can we Overload main Methdo
 * 	
 * 	Yes we can Overload main Method 
 * 
 */
package StaticConcept;

public class MainMethOverLoading {
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");											// Only this method will be executed
		
		//MainMethOverLoading o = new MainMethOverLoading();
		
		//main(5,6);
		//main(10);
	}
	
	public static void main(int a,int b)
	{
		System.out.println("Main Method will 2 Integer "+a+b);
	}
	
	public static void main(int c)
	{
		System.out.println("Main Method will 1 Integer "+c);
	}
	
	

}
