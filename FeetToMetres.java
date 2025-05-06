import java.util.Scanner;

public class FeetToMetres {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Length in Feet('): ");
	double lengthInFeet = input.nextDouble();

	double lengthInMetres = 0.305 * lengthInFeet;

	System.out.printf("The Length in Metres is %.4f", lengthInMetres);

	}
}