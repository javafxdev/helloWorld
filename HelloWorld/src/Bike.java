
public class Bike extends Vehicle {
	private String handle;

	public Bike(String engine, int horsepower, int doors, int seats, String handle) {
		super(engine, horsepower, doors, seats);
		this.handle = handle;
	}

	@Override
	public String toString() {
//		return "Bike [handle=" + handle + "]";
//		return "Vehicle [enginge = " + super.getEngine() + 
//				", horsepower = " + super.getHorsepower() + 
//				", doors = " + super.getDoors() + 
//				", seats = " + super.getDoors() + 
//				", handle = " + handle + "]";
		return super.toString() + " : Bike [handle = " + handle + "]";
	}
	
	
	
}
