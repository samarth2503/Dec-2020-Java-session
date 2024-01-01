package AbstractConcept;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();					// On creating object first it will call parent class constructor then child class constructor.
		
		lp.pageTitle();
		lp.url();
		lp.logo();
		
		// Top casting in Abstract class 
		
		Page p = new LoginPage();
		
		p.logo();
		p.pagecontent();
		
		//Page p1 = new Page()                        // Object for parent abstract class can't be created beacuse method doesn't have implementation, so it becomes useless
		

	}

}
