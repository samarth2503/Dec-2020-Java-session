package EncapsulationSession;

public class EncapTest {

	public static void main(String[] args) {
		
		EncapConcept obj = new EncapConcept();
		obj.name = "Samarth";
		obj.id = 101;
		
		obj.setSalary(100000);
		int sal = obj.getSalary();
		System.out.println("Salary is "+sal);

	}

}
