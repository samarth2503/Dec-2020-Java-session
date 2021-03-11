package InterfaceConcept;

public interface USMedical {
	
	int min_fee=100;
	
	// By Default variable are static and final
	// No Method Body
	// Only Method Decalartion
	// Only Prototype
	// It contains Abstract Methods
	// It is just used to create blueprint or prototype and implementation is provided by child class
	// We cannot create Object of Interface
	// No constructor inside interface as we have dont create Object of Interface
	// Interface cannot have Parent class
	// Prototype method or abstract method cannot be static  
	// A interface an extends multiple Interface
	
	public void pediaServices();
	
	public void cardioServcies();
	
	public void physioServcies();
	
	public void doctors(int count);
	
	public String getHospitalInfo();
	
	
	// After JDK 1.8
	
	public static void bloodTest()
	{
		System.out.println("US Medical --- BloodTest");
	}
	
	public static void main(String[] args)
	{
		bloodTest();
		System.out.println("Minimum Fee is "+min_fee);
	}
	
	default void billing()
	{
		System.out.println("US Medical --- Billing");
	}

}
