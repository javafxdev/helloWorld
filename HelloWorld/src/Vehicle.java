
public class Vehicle {
	private String engine;
	private int horsepower;
	private int doors;
	private int seats;
	
	public Vehicle(String engine, int horsepower, int doors, int seats) {
		this.engine = engine;
		this.horsepower = horsepower;
		this.doors = doors;
		this.seats = seats;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", horsepower=" + horsepower + ", doors=" + doors + ", seats=" + seats
				+ "]";
	}
	
	
}
