package WebDriverArch;

public class FireFoxDriver implements WebDriver{
	
	public FireFoxDriver()
	{
		System.out.println("Launching FireFoxDriver");
	}
	
	public void getText(String xpath) {
		System.out.println("Get Text of FireFox driver "+xpath);
	}

	public void close() {
		System.out.println("Close method of Firefox driver" );
	}

	public void quit() {
		System.out.println("Quit method of Firefox driver");
	}

	public void click() {
		System.out.println("Click method of FireFox driver" );
	}

	public void findElements(String path) {
		System.out.println("FindElement method of Firefox driver "+path);
	}

	public void findElement(String path) {
		System.out.println("FindElements method of Firefox driver "+path);
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
