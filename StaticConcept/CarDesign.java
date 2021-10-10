/*
 *  We use static Concept for Memory Management
 * 	If we created 100 Object of car class then wheels will take 400 byte of memory,but using static it will be stored in CMA(Common memory Allocation)-- it will take 4bytes
 * 	
 * 
 */

package StaticConcept;

public class CarDesign {
	
	String name;
	int price;
	String color;
	static int wheels=4;														// It will be common for all the Objects
	
	public static void main(String[] args)
	{
		CarDesign cd = new CarDesign();
		
		cd.name="BMW";
		cd.price=500000;
		cd.color="Green";
		
		CarDesign cd1 = new CarDesign();
		
		cd1.name="Audi";
		cd1.price=400000;
		cd1.color="Red";
		
		CarDesign cd2 = new CarDesign();
		
		cd1.name="Range Rover";
		cd1.price=900000;
		cd1.color="White";
		
		
	}

}
