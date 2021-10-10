/*
 * 
 */

package EncapsulationSession;

public class Browser {
	
	private int browserversion;
	
	// Getter and Setter 
	
	public void setBrowserVersion(int version)
	{
		this.browserversion=version;
	}
	
	public int getVersion()
	{
		return browserversion;
	}
	
	public void launchBrowser()													// Pulic Layer is created to access private methdos
	{
		System.out.println("Launching Browser");
		checkOS();
		checkRAM();
		OSCompatible();
		checkBrowserUpdate();
	}
	
	private void checkOS()
	{
		System.out.println("Checking OS of the System");
	}
	
	private void checkRAM()
	{
		System.out.println("Checking RAM of the System");
	}
	
	private void OSCompatible()
	{
		System.out.println("Checking OSCompatibility");
	}
	
	private void checkBrowserUpdate()
	{
		System.out.println("checkBrowserUpdate");
	}
	
	

	public static void main(String[] args) {
		

	}

}
