import java.util.ArrayList;

public class Garage {
	
	static ArrayList<Vehicle> listVehicles = new ArrayList<>();
	public void addVehicle(Vehicle newVehicle) {
		listVehicles.add(newVehicle);
	}
	public void removeVehicle(Vehicle newVehicle) {
		listVehicles.remove(newVehicle);
	}
	public void removeVehicle(int iD) {
		for (Vehicle v: listVehicles) {
			if (v.iD == iD) {
				listVehicles.remove(v);
			}
		}
	}
}
