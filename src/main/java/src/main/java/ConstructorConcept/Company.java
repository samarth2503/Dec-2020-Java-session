package ConstructorConcept;

public class Company {
	
	String name;
	String ceoname;
	String logo;
	int empcount;
	String HQ;
	
	public Company(String name,String ceoname,String logo,int empcount,String hq)
	{
		this.name=name;
		this.ceoname=ceoname;
		this.logo=logo;
		this.empcount=empcount;
		HQ=hq;
	}
	
	public Company(String name, int empcount,String ceoname)
	{
		this.ceoname=ceoname;
		this.empcount=empcount;
		this.ceoname=name;
	}
	
	public String getcompanyname()
	{
		return name;
	}
	
	public String getInfo()
	{
		return "Some info";
	}
	
	public static void main(String[] args)
	{
		Company c1 = new Company("Samarth","Alex Peter","Infosys",1001,"Chennai");
		
		String n = c1.getInfo();
		String cn = c1.getcompanyname();
		
		System.out.println("Company Info is "+n+" "+"Company name is "+cn);
	}

}
