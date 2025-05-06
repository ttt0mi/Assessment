import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("How Far are you Travelling? "); //Miles Per Gallon
	double drivingDistance = input.nextDouble();

	System.out.print("How Many Miles does the Car Travel Per Gallon of Fuel? ");
	double fuelEfficiency = input.nextDouble(); 

	System.out.print("What is the Price Per Gallon of Fuel? ");
	double price = input.nextDouble();

	double costOfDriving = (drivingDistance * price)/fuelEfficiency;

	System.out.printf("The Cost of Driving is $%.2f", costOfDriving);
	

	}
}