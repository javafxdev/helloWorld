
public class helloWorld {

	public static void main(String[] args) {
		System.out.println("Hallo Welt!");
		Bike myBike = new Bike("Petrol", 240, 2, 2, "Short");
		System.out.println(myBike);
		
		Vehicle vehic = new Vehicle("Petrol", 240, 2, 2);
		System.out.println(vehic);
	}

}
