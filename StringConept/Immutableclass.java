package StringConept;

final class Immutableclass {

	private int i;
	
	public Immutableclass(int i)
	{
		this.i = i;
	}
	
	public int modify(int i)
	{
		if(this.i==i)
		{
			return this.i;
		}
		
		else
		{
			//new Immutableclass(i);
			return i;
		}
	}
	
	public static void main(String[] args)
	{
		Immutableclass im = new Immutableclass(10);
		System.out.println(im.modify(10));
		System.out.println(im.modify(100));
	}
	
}

