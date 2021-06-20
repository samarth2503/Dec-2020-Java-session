package InheritanceConcept;

public class CarTest {								// Vechile GrandParent and Car Parent

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		Car.start();				// Overriden from Parent class
		b.autoParking();        // BMW class method
		b.refuel();				// Car class Method
		b.stop();				// Car class methdo
		b.launch();
		
		Car c = new Car();
		
		c.start();					// Car class method will be executed
		c.stop();
		c.refuel();
		//c.autoParking();					// Since autoParking belongs to BMW class only bmw refernce will be allowed to access it not Car refernce.This concept is Refernce type check						
		c.engine();
		
		// Child class Object can be reffered using Parent class refernce
		// Top Casting
		
		Car c1 = new BMW();										
		
		c1.start();
		c1.stop();
		c1.refuel();
		c1.launch();
		c1.engine();
		
		BMW b1 = (BMW)new Car();					// Class cast Exception
		
		
		Vechile v1 = new BMW();
		
	}

}
