import java.util.Scanner;

public class Factorial{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int numb = input.nextInt();

	int counter = 0;
	int answer = 1;

	while(counter < numb) {

		answer *= (numb - counter);  //answer = answer * (numb - counter)

		counter += 1; 
	
	}

	System.out.print("Answer is " + answer);

}}