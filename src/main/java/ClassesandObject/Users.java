package ClassesandObject;

import java.util.ArrayList;

public class Users {
	
	String name;
	String[] devicelist;
	int id;
	ArrayList<String> orderhistory;
	
	public static void main(String [] args)
	{
		Users u1 = new Users();
		
		u1.name="Peter";
		u1.id = 1002;
		u1.devicelist = new String[3];
		
		u1.devicelist[0]="Apple iPhoneX";
		u1.devicelist[1]="Samsung X";
		u1.devicelist[2]="One plus 5";
		
		u1.orderhistory= new ArrayList<String>();
		
		u1.orderhistory.add("T Shirt");
		u1.orderhistory.add("Nike Shoes 2020");
		u1.orderhistory.add("Monitor 2019");
		
		for(String e : u1.orderhistory)
		{
			System.out.println(e);
		}
		
	}

}
	