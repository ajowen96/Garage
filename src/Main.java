
public class Main {

	public static void main(String[] args) {
		Car v1 = new Car(1, 3, 2019, "Ferrari", 3);
		Car v2 = new Car(2, 5, 2013, "Range Rover", 2);
		Car v3 = new Car(3, 2, 2018, "Bugatti", 4);
		Motorcycle v4 = new Motorcycle(4, 0, 2014, "Harley-Davidson", 500);
		Motorcycle v5 = new Motorcycle(5, 0, 2019, "Ducati", 1000);
		Motorcycle v6 = new Motorcycle(6, 0, 2016, "Yamaha", 850);
		Helicopter v7 = new Helicopter(7, 2, 2007, "Boeing", 2);
		Helicopter v8 = new Helicopter(8, 4, 2014, "Air Bus", 1);
		Helicopter v9 = new Helicopter(9, 1, 2011, "Textron", 1);
		
		Garage.addVehicle(v1);
		Garage.addVehicle(v2);
		Garage.addVehicle(v3);
		Garage.addVehicle(v4);
		Garage.addVehicle(v5);
		Garage.addVehicle(v6);
		Garage.addVehicle(v7);
		Garage.addVehicle(v8);
		Garage.addVehicle(v9);
		
		Garage.removeVehicleByNoOfDoors(0);
		
		Garage.viewGarage();
	}
}
