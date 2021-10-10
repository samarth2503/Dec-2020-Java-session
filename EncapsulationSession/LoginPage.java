package EncapsulationSession;

public class LoginPage {

	private String username;
	private String password;
	
	public LoginPage()
	{
		
	}
	
	public LoginPage(String un,String pwd)										// Without using setter we can use constructor for setting value
	{
		this.username=un;
		this.password=pwd;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String un ,String pwd)
	{
		System.out.println("Entering Username "+un);
		System.out.println("Entering Password "+pwd);
		System.out.println("Clcik on Login");
		System.out.println("User has Logged In");
	}
	
	public void logout()
	{
		System.out.println("User has Logged Out");
	}
	
	

}
