package WebDriverArch;

public class ChromeDriver implements WebDriver {

	public ChromeDriver()
	{
		System.out.println("Launching ChromeDriver");
	}
	
	public void getText(String xpath) {
		System.out.println("Get Text of Chrome driver "+xpath);
	}


	public void close() {
		System.out.println("Close method of Chrome driver" );
	}

	public void quit() {
		System.out.println("Quit method of Chrome driver");
	}

	public void click() {
		System.out.println("Click method of Chrome driver" );
	}

	public void findElements(String path) {
		System.out.println("FindElement method of Chrome driver "+path);
	}

	public void findElement(String path) {
		System.out.println("FindElements method of Chrome driver "+path);
	}

	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

}
