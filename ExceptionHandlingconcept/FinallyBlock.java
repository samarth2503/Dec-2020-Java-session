package ExceptionHandlingconcept;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			int b = 9/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Some Exception Occured");
		}
		finally
		{
			System.out.println("Bye......");
		}
		
		/*try {
			int b = 9/0;
		}
		
		finally															// doesnt matter wheather Exception occurs or not finally block with always be executed
		{
			System.out.println("Bye......");
		}*/
		
		System.out.println("Marks are "+getMarks("Tom"));

	}
	
	
	@SuppressWarnings("finally")
	public static int getMarks(String name)
	{
		
		if(name.equals("Sonam"))
		{
			return 95;
		}
		else if(name.equals("Tom"))
		{
			try {
				int a = 9/3;
				return 45;
			}
			catch(Exception e)
			{
				System.out.println("Some Exception occured");
				return 15;
			}
			
			finally
			{
				System.out.println("Inside Finally");
				return 10;
			}
		}
		else if(name.equals("Rahul"))
		{
			return 95;
		}
		else
		{
			return -1;
		}
	}

}
