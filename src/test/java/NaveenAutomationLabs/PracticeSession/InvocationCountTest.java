package NaveenAutomationLabs.PracticeSession;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount=10)
	public void loginTest()
	{
		System.out.println("Login to App");
	}

}
