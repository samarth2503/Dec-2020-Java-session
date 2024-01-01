import java.io.IOException;

public class JavaPractice {
	
	public static void main(String[] args)
	{
		try {
			int i = 10/0;
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
