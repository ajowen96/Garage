
public class Motorcycle extends Vehicle{
	
	int cc;
	public String move() {
		return "ride";
	}
	
	public Motorcycle(int iD, int noOfDoors, int year, String manufacturer, int cc) {
		super(iD, noOfDoors, year, manufacturer);
		this.cc = cc;
	}
	
	public String toString() {
		return "iD: " + this.iD + "    noOfDoors: " + this.noOfDoors + "    Year: " + this.year + "    Manufacturer: " + this.manufacturer + "    cc: " + this.cc + "    movementMethod: " + this.move();
	}
}
