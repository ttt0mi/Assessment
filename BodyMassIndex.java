import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Your Weight in Pounds(lb): ");
	double weightInPounds = input.nextDouble();

	System.out.print("Your Height in Inches("): ");
	double heightInInches = input.nextDouble();

	double weightInKilograms = 0.45359237 * weightInPounds;
	double heightInMetres = 0.0254 * heightInInches;

	double BMI = weightInKilograms/(heightInMetres * heightInMetres);
	
	System.out.printf("The BMI is %.4f%n", BMI);


	System.out.println("Underweight = <18.5");
	System.out.println("Normal Weight = 18.5 - 24.9");
	System.out.println("Overweight = 25 - 29.9");
	System.out.println("Obesity = BMI of 30 or greater");

	

	
	

	


	}
}