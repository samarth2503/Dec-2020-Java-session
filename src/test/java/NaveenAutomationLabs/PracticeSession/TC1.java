package NaveenAutomationLabs.PracticeSession;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Inside Before Suite Method...'");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("Inside Before Suite Method...'");
	}
	
	
	@Test
	@Parameters({"browser","url"})
	public void m1(String browser, String url)
	{
		System.out.println("Inside M1 Method");
		System.out.println("Browser is "+browser);
		System.out.println("Url is "+url);
	}
	
	
	@Test
	public void m2()
	{
		System.out.println("Inside M2 Method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Inside After Suite Method...'");
	}
	
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("Inside After Class Method...'");
	}

}
