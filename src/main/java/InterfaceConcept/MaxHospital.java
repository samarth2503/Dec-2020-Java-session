package InterfaceConcept;

public class MaxHospital implements USMedical,IndianMedical {

	@Override
	public void pediaServices() {
		System.out.println("FH --- PediaService");
	}

	@Override
	public void cardioServcies() {
		
		System.out.println("FH --- cardioServices");		
	}

	@Override
	public void physioServcies() {
		System.out.println("FH --- physioServices");
		
	}

	@Override
	public void doctors(int count) {
		System.out.println("FH --- doctors");
		
	}

	@Override
	public String getHospitalInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyservices");
		
	}

	@Override
	public void orthServcies() {
		System.out.println("FH -- orthoservices");
		
	}

	@Override
	public void opthoServices() {
		System.out.println("FH -- opthoServices");
		
	}

	@Override
	public void covidTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HealthFund() {
		// TODO Auto-generated method stub
		
	}
	
	

}
