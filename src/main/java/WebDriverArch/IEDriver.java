package WebDriverArch;

public class IEDriver implements WebDriver {
	
	public IEDriver()
	{
		System.out.println("Lauching IE Driver");
	}

	public void getText(String xpath) {
		System.out.println("Get Text of IE driver "+xpath);
	}

	public void close() {
		System.out.println("Close method of IE driver");
	}

	public void quit() {
		System.out.println("Quit method of IE driver");
	}

	public void click() {
		System.out.println("Click method of IE driver" );
	}

	public void findElements(String path) {
		System.out.println("FindElement method of IE driver");
	}

	public void findElement(String path) {
		System.out.println("FindElements method of IE driver");
	}

	public void get() {
		System.out.println("FindElements method of IE driver");
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
