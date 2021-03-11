package AbstractConcept;

public class LoginPage extends Page{
	
	public LoginPage()
	{
		System.out.println("LoginPage const....");
	}

	@Override
	public void title() {
		System.out.println("LoginPage title");
	}

	@Override
	public void haeder() {
		System.out.println("LoginPage Header");
	}

	@Override
	public void url() {
		System.out.println("LoginPage Url");
	}

}
