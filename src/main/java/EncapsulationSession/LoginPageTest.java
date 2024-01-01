/*
 * Login is common Template,which can be used by various people like Seller,Customer,Distrubutor.
 * 
 */

package EncapsulationSession;

public class LoginPageTest {

	public static void main(String[] args) {
		
		LoginPage lp_cust = new LoginPage("Customer@gmail.com","Customer@123");
		
		lp_cust.setPassword("samarth@gamil.com");									// For different user we were using same Object to Login.( first Approach)
		lp_cust.setPassword("Samarth@123");
		
		lp_cust.doLogin(lp_cust.getUsername(), lp_cust.getPassword());
		
		lp_cust.setUsername("sellar@gmail.com");
		lp_cust.setPassword("sellar@789");
		
		//lp.doLogin(lp.getUsername(), lp.getPassword());
		
		LoginPage lp_seller = new LoginPage();											// 2nd Approach using different object for different user
		
		lp_seller.setPassword("sellar@123");
		lp_seller.setUsername("sellar123@gmail.com");
		
		
		LoginPage lp = new LoginPage("Samarth890@gmail.com","Sam@1234");					// Third Approach.... Using Default Constructor
		
//		lp.setUsername("Samarth890@gmail.com");
//		lp.setPassword("Sam@1234");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
	}
	

}
