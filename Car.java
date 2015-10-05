// Car class Car.java
public class Car {
	double mpg; // how many miles per gallon
	double gallons; // how many gallons in the tank
	String colour = "";
	String model = "";
	int year = 0;
	String make = "";
	double horsepower = 0;
	double zts = 0;;
	public Car(double milesPG) {
		this.mpg = milesPG;
		this.gallons = 0;
	}
	public Car(double milesPG, double gal, String make, String model, String colour, int year, double hp, double zts) {
		this.mpg = mpg;
		this.gallons = gal;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;
		this.horsepower = hp;
		this.zts = zts;
	}
	public void fillUp(double fill) {
		// adds petrol
		this.gallons += fill;
	}
	public void takeTrip(double miles) {
		// removes gallons from the tank based on number of miles
		double gallonsToSubtract =  miles / mpg;
		this.gallons -= gallonsToSubtract;
	}
	public double reportFuel() {
		return gallons;
	}
	public String bragOnYourCar() {
		String output = "";
		output += "Doode, I just got dis sweet"
		output + colour + " " + year + " " + make + " " + model + "!"
		output + "It has " + horsepower + " horsepower, "
		output + "gets " + mpg + " miles per gallon"
		output + "and has a " + gallons + " gallon petrol tank! "
		output + "it goes from zero to sixty in " + zts + " seconds!"
		output + "\nIt's the greatest car I've ever owned!";
		return output;
	}
}