package NaveenAutomationLabs.PracticeSession;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupingConcept {
	
	
	@Test(groups= {"sanity"})
	@Parameters({"browser","url"})
	public void m1(String browser, String url)
	{
		System.out.println("Inside m1 Method.....");
		System.out.println("Browser is "+browser);
		System.out.println("Url is "+url);
	}
	
	@Test(groups= {"sanity"})
	public void m2()
	{
		System.out.println("Inside m2 Method.....");
	}
	
	@Test(groups= {"regression"})
	public void m3()
	{
		System.out.println("Inside m3 Method.....");
	}
	
	@Test(groups= {"regression"})
	public void m4()
	{
		System.out.println("Inside m4 Method.....");
	}
	
	@Test(groups= {"sanity","regression"})
	public void m5()
	{
		System.out.println("Inside m5 Method.....");
	}

}
