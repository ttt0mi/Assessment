import java.util.Scanner;

public class InvestmentCalc {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your Initial Investment Amount: ");
	double investment = input.nextDouble();

	System.out.print("Enter the Annual Interest Rate: ");
	double annualInterestRate = input.nextDouble();

	System.out.print("Enter the Number of Years for your Investment: ");
	double InvestmentYears = input.nextDouble();

	double monthlyInterestRate = (annualInterestRate / 100)/12;
	double futureInvestment = investment * Math.pow((1 + monthlyInterestRate), 12); //E no dey chapter 2 boss

	System.out.printf("The Future Investment Value is $%.2f", futureInvestment);


	}
}