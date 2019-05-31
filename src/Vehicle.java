
public abstract class Vehicle {
	
	int iD;
	int noOfDoors;
	int year;
	String manufacturer;
	String movementMethod;
	public String move() {
		return movementMethod;
	}
	
	public Vehicle(int iD, int noOfDoors, int year, String manufacturer) {
		this.iD = iD;
		this.noOfDoors = noOfDoors;
		this.year = year;
		this.manufacturer = manufacturer;
	}
}
