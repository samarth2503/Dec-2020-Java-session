package AbstractConcept;

public class HomePage extends Page {

	@Override
	public void title() {
		System.out.println("Page Title");
	}

	@Override
	public void haeder() {
		System.out.println("Page Header");
	}

	@Override
	public void url() {
		System.out.println("Page Url");
	}
	
	

}
