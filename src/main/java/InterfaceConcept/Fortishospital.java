package InterfaceConcept;

public class Fortishospital extends CentralHospital implements USMedical,IndianMedical  {

	public void pediaServices() {
		
		System.out.println("Fortis hospital---Pedia Servcies");
	}

	public void cardioServcies() {
		
		System.out.println("Fortis hospital---Cardio Servcies");
	}

	public void physioServcies() {															// We will override once if services is available 2 times
		
		System.out.println("Fortis hospital---Physio Servcies");
	}

	public void oncologyServices() {
		
		System.out.println("Fortis hospital---Oncology Servcies");
	}

	public void orthServcies() {
		
		System.out.println("Fortis hospital---Ortho Servcies");
	}

	public void doctors(int count) {
		
		System.out.println("Numbers of doctors are "+count);
	}

	public String getHospitalInfo() {
		
		return "Fortis hospital";
	}
	
	// Non-Overridden Method
	
	public void medicalTraining()
	{
		
	}
	
	public void medicalInsurance()
	{
		
	}
	
	public void pathologyServices()
	{
		
	}

	@Override
	public void opthoServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void covidTest() {
		
		System.out.println("FH -- covid19Test");
		
	}

	@Override
	public void HealthFund() {
		// TODO Auto-generated method stub
		
	}

}
