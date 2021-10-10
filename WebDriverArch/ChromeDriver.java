package WebDriverArch;

public class ChromeDriver implements WebDriver {

	public ChromeDriver()
	{
		System.out.println("Launching ChromeDriver");
	}
	
	@Override
	public void getText(String xpath) {
		System.out.println("Get Text of Chrome driver "+xpath);
	}

	@Override
	public void close() {
		System.out.println("Close method of Chrome driver" );
	}

	@Override
	public void quit() {
		System.out.println("Quit method of Chrome driver");
	}

	@Override
	public void click() {
		System.out.println("Click method of Chrome driver" );
	}

	@Override
	public void findElements(String path) {
		System.out.println("FindElement method of Chrome driver "+path);
	}

	@Override
	public void findElement(String path) {
		System.out.println("FindElements method of Chrome driver "+path);
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

}
