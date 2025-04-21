import java.util.Scanner;

public class Factors{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number to find it's factors: ");
	int number = input.nextInt();

	int counter = 1;

	while(counter < number){
	
		if(number % counter == 0) System.out.print(counter + ", ");

		counter++;

	}
	System.out.println(number + " are the factors of " + number);

}}