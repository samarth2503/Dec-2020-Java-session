package WebDriverArch;

public class BrowserTest {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "IE";
		
		
		switch(browser)
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "Firefox":
			driver= new FireFoxDriver();
			break;
			
		case "IE":
			driver = new IEDriver();
			break;
		}
		
		
		driver.click();
		driver.getText("by_id");
		driver.close();

	}

}
