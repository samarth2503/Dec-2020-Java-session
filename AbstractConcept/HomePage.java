package AbstractConcept;

public class HomePage extends Page {

	@Override
	public void title() {
		System.out.println("Page Title from Remote");
	}

	@Override
	public void haeder() {
		System.out.println("Page Header from Remote");
	}

	@Override
	public void url() {
		System.out.println("Page Url from Remote");
	}
	
	

}
