import java.util.Scanner;

public class InterestCalc {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter Annual Interest Rate: ");
	double interestRate= input.nextDouble();


	double interest = balance * (interestRate/1200);

	System.out.printf("The Interest is %.5f", interest);
	
	}

}