
public class Helicopter extends Vehicle {
	
	int noOfPropellers;
	public String move() {
		return "fly";
	}
	
	public Helicopter(int iD, int noOfDoors, int year, String manufacturer, int noOfPropellers) {
		super(iD, noOfDoors, year, manufacturer);
		this.noOfPropellers = noOfPropellers;
	}
	
	public String toString() {
		return "iD: " + this.iD + "    noOfDoors: " + this.noOfDoors + "    Year: " + this.year + "    Manufacturer: " + this.manufacturer + "    noOfPropellers: " + this.noOfPropellers + "    movementMethod: " + this.move();
	}
}
