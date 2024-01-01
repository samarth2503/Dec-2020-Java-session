package SuperKeyword;

public class HR extends Department{
	
	int depth_code = 102;
	
	@Override
	public void getDeptId()
	{
		// Accessing parent class variable without object creation
		System.out.println("HR -- get Dept id...");
	}
	
	public void getDeptInfo()
	{
		getDeptId();
		super.getDeptId();
	}

}
