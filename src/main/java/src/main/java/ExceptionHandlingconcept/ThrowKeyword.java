package ExceptionHandlingconcept;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		try {
			throw new Exception("Some blank cell data Exception");
		}
		catch(Exception e)
		{
			System.out.println("Some Exception occur");
			e.printStackTrace();                                              // Details message about Exception
		}
		

	}

}
