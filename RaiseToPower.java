import java.util.Scanner;

public class RaiseToPower{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int numb = input.nextInt();
	System.out.print("raised to a power of ");
	int power = input.nextInt();

	int counter = 0;
	int powerAnswer = 1;

	while(counter < power) {
		
		powerAnswer *= numb; // OLD SQUARED VALUE * NUMBER = NEW SQUARED VALUE

		counter += 1; 

	}

	System.out.print("Answer is " + powerAnswer);

}}