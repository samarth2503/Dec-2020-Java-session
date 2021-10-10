package WebDriverArch;

public class IEDriver implements WebDriver {
	
	public IEDriver()
	{
		System.out.println("Lauching IE Driver");
	}

	@Override
	public void getText(String xpath) {
		System.out.println("Get Text of IE driver "+xpath);
	}

	@Override
	public void close() {
		System.out.println("Close method of IE driver");
	}

	@Override
	public void quit() {
		System.out.println("Quit method of IE driver");
	}

	@Override
	public void click() {
		System.out.println("Click method of IE driver" );
	}

	@Override
	public void findElements(String path) {
		System.out.println("FindElement method of IE driver");
	}

	@Override
	public void findElement(String path) {
		System.out.println("FindElements method of IE driver");
	}

	@Override
	public void get() {
		System.out.println("FindElements method of IE driver");
	}
}
