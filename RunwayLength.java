import java.util.Scanner;

public class RunwayLength {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("What is a Airplane's Take-off Speed(metres/second): ");
	double speed = input.nextDouble();

	System.out.print("What is the Airplane's Acceleration(metres/second squared): " );
	double acceleration = input.nextDouble();

	double length = (speed * speed)/(2 * acceleration);

	System.out.printf("The Minimum Runway Length is %.3f", length);


	}
}