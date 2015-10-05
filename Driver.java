/*
 * Project: Driver.java
 * Description: One takes a trip in a car and fills up, takes petrol level, etc.
 * Author: Seunghoon Park
 * Date: 5 October, 2015
 */
public class Driver {
	public static void main(String args[]) {
		Car myBMW = new Car(24);
		myBMW.fillUp(20);
		myBMW.takeTrip(100);
		System.out.println("You have " + myBMW.reportFuel() + " gallons left.");
		Car simonyCar = new Car(42, 20, "Simony", "Noblesse X", "brown", 1998, 250, 1);
		simonyCar.bragOnYourCar();
	}
}