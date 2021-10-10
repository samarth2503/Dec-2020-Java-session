package AbstractConcept;

public abstract class Page {
	
	public Page()
	{
		System.out.println("Page const...");
	}
	
	public abstract void title();					// no method body only declaration
	
	public abstract void haeder();
	
	public abstract void url();
	
	public final void logo()
	{
		System.out.println("App --- logo");
	}
	
	public void loadingTimeOut()
	{
		System.out.println("loading timeout is 20 sec...");
	}

}
