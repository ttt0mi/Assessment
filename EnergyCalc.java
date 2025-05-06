import java.util.Scanner;

public class EnergyCalc{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Amount of Water in Kilograms: ");
	double water = input.nextDouble();

	System.out.print("Initial Temperature of the Water in Celsius: ");
	double initialTemp = input.nextDouble();

	System.out.print("Final Temperature of the Water in Celsius: ");
	double finalTemp = input.nextDouble();

	double energyNeeded = water * (finalTemp - initialTemp) * 4184;

	System.out.printf("The Energy Needed is %.1f", energyNeeded);




	}
}