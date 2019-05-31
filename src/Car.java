
public class Car extends Vehicle {
	
	int noOfTransformations;
	public String move() {
		return "drive";
	}
	
	public Car(int iD, int noOfDoors, int year, String manufacturer, int noOfTransformations) {
		super(iD, noOfDoors, year, manufacturer);
		this.noOfTransformations = noOfTransformations;
	}
	
	public String toString() {
		return "iD: " + this.iD + "    noOfDoors: " + this.noOfDoors + "    Year: " + this.year + "    Manufacturer: " + this.manufacturer + "    noOfTransformations: " + this.noOfTransformations + "    movementMethod: " + this.move();
	}
}
