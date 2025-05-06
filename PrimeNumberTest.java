import java.util.Scanner;

public class PrimeNumberTest{
	 public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a positive number: ");
	int number = input.nextInt();

	int primeCounter = 0;

//	int numbSQR = number * number;

	if(number < 0) {
		System.out.print("There are no negative prime numbers");
	}
	else
	if(number == 0 || number == 1){
		System.out.print(number + " is not a prime number");
	}
	else
	if(number == 2){
		System.out.print(number + " is a prime number");
	}
	else{
		for(int counter = 1; counter <= number; counter++){
			
			if(number % counter == 0) primeCounter++;
		
		}
	if(primeCounter == 2) System.out.print(number + " is a prime number");
	else System.out.print(number + " is not a prime number");

	}
}}





/*	


	if(numbSQR - 1 % 24 == 0){
	System.out.print(number + " is a prime number");
	else{
	System.out.print(number + " is not a prime number");
	}
*/