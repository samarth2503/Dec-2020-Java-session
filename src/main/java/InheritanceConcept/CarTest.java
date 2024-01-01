package InheritanceConcept;

public class CarTest {								// Vechile GrandParent and Car Parent

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();				// Overridden from Parent class so BMW's start method will be called
		b.autoParking();        // BMW class method
		b.refuel();				// Car class Method
		b.stop();				// Car class method
		b.launch();
		
		Car c = new Car();
		
		c.start();					//Car class method will be executed
		c.stop();
		c.refuel();
		//c.autoParking();			//Since autoParking belongs to BMW class only BMW reference will be allowed to access it not Car Refernce.This concept is Reference type check						
		c.engine();
		
		// Child class Object can be referred using Parent class reference
		// Top Casting
		
		Car c1 = new BMW();										
		System.out.println("-----------------------------------------------");
		c1.start();							// BMW start method will be executed as BMW has overridden it
		c1.stop();
		c1.refuel();
		//c1.autoParking					// We can't access auto parking method(it is independent method, if it would have been overridden the we could have accessed it) of BMW class as the reference type check is of Class Car.
		//c1.launch();
		c1.engine();
		
		//BMW b1 = (BMW)new Car();					// Class cast Exception:- Every car is not BMW, but every BMW is a car.
		
		Vechile v1 = new BMW();
		
		v1.engine();
		
	}

}
