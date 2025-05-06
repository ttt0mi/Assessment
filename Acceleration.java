import java.util.Scanner;

public class Acceleration{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the Initial Velocity(metres/second): ");
	float v0 = input.nextFloat();

	System.out.print("Enter the Final Velocity(metres/second): ");
	float v1 = input.nextFloat();

	System.out.print("Enter the Time Taken(seconds): ");
	float t = input.nextFloat();

	float acceleration = (v1 - v0)/t;

	System.out.println("The Average Acceleration is " + acceleration);
    }
}