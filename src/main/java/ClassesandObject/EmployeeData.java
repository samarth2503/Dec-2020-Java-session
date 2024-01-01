package ClassesandObject;

public class EmployeeData {
	
	public String getName(){
		return "IBM";
	}
	
	public int getcount() {
		return 1000;
	}

	public Object[] getInfo() {
		// get Name and count
		
		Object[] obj = new Object[2];
		obj[0] = "Infosys";
		obj[1] = 1000;
		
		return obj;
	}
	
	public static void main(String[] args) {
		
		EmployeeData d = new EmployeeData();
		
		Object[] ob = d.getInfo();
		
		System.out.println("Name is :" +ob[0]);
		System.out.println("Count is : "+ob[1]);
		
		

	}

}
