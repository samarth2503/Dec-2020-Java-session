package NaveenAutomationLabs.PracticeSession;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC2 {
	
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
	public void m3(String browser, String url)
	{
		System.out.println("Inside M3 Method");
		System.out.println("Browser is "+browser);
		System.out.println("Url is "+url);
	}
	
	@Test
	public void m4()
	{
		System.out.println("Inside M4 Method");
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
