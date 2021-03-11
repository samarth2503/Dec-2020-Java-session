package WebDriverArch;

public interface WebDriver extends SearchContext{
	
	public void getText(String xpath);
	
	public void close();
	
	public void quit();
	
	public void click();
	
	public void get();
	
	@Override
	public void findElements(String path);
	
	@Override
	public void findElement(String path);

}
