package ClassesandObject;

import java.util.ArrayList;

public class Users {
	
	String name;
	int id ;
	String deviceList[];
	ArrayList<String> orderHistroy;
	
	public static void main(String[] args)
	{
		Users u1 = new Users();
		
		u1.name = "Samarth";
		u1.id = 101;
		u1.deviceList = new String[2];
		
		u1.deviceList[0] = "Samsung Galaxy 800";
		u1.deviceList[1] = "Apple 15";
		
		u1.orderHistroy = new ArrayList<String>();
		
		u1.orderHistroy.add("Nike shoes");
		u1.orderHistroy.add("Yoga Mat");
		
		System.out.println(u1.name+" "+u1.id+" "+u1.deviceList[0]+" "+u1.orderHistroy);
	}

}
	