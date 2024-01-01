package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		Fortishospital fh = new Fortishospital();
		
		fh.cardioServcies();
		fh.hospitalInfra();
		fh.doctors(100);
		fh.hospitalInfra();
		
		fh.covidTest();
		fh.orthServcies();
		fh.billing();
		
		USMedical us = new Fortishospital();
		
		us.billing();
		us.pediaServices();
		us.cardioServcies();
		us.doctors(20);
		
		IndianMedical im = new Fortishospital();
		
		im.HealthFund();
		im.oncologyServices();
		im.orthServcies();
	}

}
