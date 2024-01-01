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
			return 90;
		}
		else if(name.equals("Tom"))
		{
			try {
				int a = 9/3;
				return 12;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inside catch Method ..");
				return 45;
				//e.printStackTrace();
			}
			finally {
				System.out.println("Finally Method...");
				return 10;
			}
		}
		else if(name.equals("Sujan"))
		{
			return 95;
		}
		return -1;
	}

}
