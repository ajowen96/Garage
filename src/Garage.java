import java.util.ArrayList;

public class Garage {
	
	static ArrayList<Vehicle> listVehicles = new ArrayList<>();
	
	public static void addVehicle(Vehicle newVehicle) {
		listVehicles.add(newVehicle);
	}
	
	public static void removeVehicleByName(Vehicle newVehicle) {
		listVehicles.remove(newVehicle);
	}
	
	public static void removeVehicleByiD(int iD) {
		for (Vehicle v: listVehicles) {
			if (v.iD == iD) {
				listVehicles.remove(v);
				break;
			}
		}
	}
	
	public static void removeVehicleByNoOfDoors(int noOfDoors) {
		for (int v = 0; v < listVehicles.size(); v++) {
			if (listVehicles.get(v).noOfDoors == noOfDoors) {
				listVehicles.remove(v);
			}
		}
	}
	
	public static void viewGarage() {
		for (int i = 0; i < listVehicles.size(); i++) {
			System.out.println(listVehicles.get(i));
		}
	}
}
