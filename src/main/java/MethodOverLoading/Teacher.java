package MethodOverLoading;

import java.util.ArrayList;

public class Teacher {
	
	// WAF to return list of faculty on basis of College name
	
	public ArrayList<String> getFaculty(String collegeName)
	{
		System.out.println("College name is "+collegeName);
		ArrayList<String> facultyList = new ArrayList<String>();
		
		switch(collegeName) {
		
		case "IIBM":
			facultyList.add("Tom");
			facultyList.add("Steve");
			facultyList.add("Peter");
			break;
			
		case "IITD":
			facultyList.add("Alex");
			facultyList.add("Andrew");
			break;
			
		default:
			System.out.println("College NAme not found....");
			break;
			
		}
		
		return facultyList;
	}

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		ArrayList<String> fac = t.getFaculty("IITD");
		
		//String[] fac = t.getFaculty("IIM");
		
		System.out.print("Faculties are ");
		for(String f : fac)
		{
			System.out.print(f+" ");
		}
		
		System.out.println();

	}

}
