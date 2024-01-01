package MyApp;

public class Registration {
	
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String address;
	
	public Registration (String firstname, String lastname, String email,String phone, String address)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		
	}
	
	public void registerUser(Registration register)
	{
		System.out.println("Username is "+register.firstname+" lastname is "+register.lastname);
	}

	public static void main(String[] args) {
		
		

	}

}
