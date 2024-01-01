package NaveenAutomationLabs.PracticeSession;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name = "Tom";
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void loginTest()
	{
		System.out.println("Login to App");
		int i = 9/0;
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);
	}

}
