import java.util.Scanner;

public class PrimeNumber{
	 public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a positive number: ");
	int number = input.nextInt();

	int numbSQR = number * number;

	if(number < 0) {
		System.out.print("There are no negative prime numbers");
	}
	else
	if(number == 2 || number == 3 ){
		System.out.print(number + " is not a prime number");
	}
	else
	if(numbSQR - 1 % 24 == 0){
		System.out.print(number + " is a prime number");
	}
	else{
		System.out.print(number + " is not a prime number");
	}

//incomplete

}}