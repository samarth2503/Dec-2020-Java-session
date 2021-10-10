package WebDriverArch;

public class FireFoxDriver implements WebDriver{
	
	public FireFoxDriver()
	{
		System.out.println("Launching FireFoxDriver");
	}
	
	@Override
	public void getText(String xpath) {
		System.out.println("Get Text of FireFox driver "+xpath);
	}

	@Override
	public void close() {
		System.out.println("Close method of Firefox driver" );
	}

	@Override
	public void quit() {
		System.out.println("Quit method of Firefox driver");
	}

	@Override
	public void click() {
		System.out.println("Click method of FireFox driver" );
	}

	@Override
	public void findElements(String path) {
		System.out.println("FindElement method of Firefox driver "+path);
	}

	@Override
	public void findElement(String path) {
		System.out.println("FindElements method of Firefox driver "+path);
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
}
