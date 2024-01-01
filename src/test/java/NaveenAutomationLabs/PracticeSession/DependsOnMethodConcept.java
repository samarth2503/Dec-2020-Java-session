package NaveenAutomationLabs.PracticeSession;

import org.testng.annotations.Test;

/*
 * If the depends method is failed then the test which is dependent of that failed test will no be executed.
 */

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest()
	{
		System.out.println("Login to App");
	}
	
	@Test(dependsOnMethods="loginTest",priority=1)
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	
	@Test(dependsOnMethods="loginTest",priority=2)
	public void paymentTest()
	{
		System.out.println("Payment Test");
	}

}
