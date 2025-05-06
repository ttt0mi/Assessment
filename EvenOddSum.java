import java.util.Scanner;

public class EvenOddSum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int evenSum = 0; //Initialises the evenSum variable
	int oddSum = 0; //Initialises the oddSum variable
	
	System.out.print("Enter an integer: ");
	int numb1 = input.nextInt();

	System.out.print("Enter another integer: ");
	int numb2 = input.nextInt();

	System.out.print("Enter another integer: ");
	int numb3 = input.nextInt();

	System.out.print("Enter another integer: ");
	int numb4 = input.nextInt();

	System.out.print("Enter one more integer: ");
	int numb5 = input.nextInt();

	if(numb1 % 2 == 0) {
	evenSum += numb1;
	}
	if(numb1 % 2 != 0) {
	oddSum += numb1;
	}

	if(numb2 % 2 == 0) {
	evenSum += numb2;
	}
	if(numb2 % 2 != 0) {
	oddSum += numb2;
	}

	if(numb3 % 2 == 0) {
	evenSum += numb3; //evenSum = evenSum + numb3;
	}
	if(numb3 % 2 != 0) {
	oddSum += numb3;
	}

	if(numb4 % 2 == 0) {
	evenSum += numb4;
	}
	if(numb4 % 2 != 0) {
	oddSum += numb4;
	}

	if(numb5 % 2 == 0) {
	evenSum += numb5;
	}
	if(numb5 % 2 != 0) {
	oddSum += numb5;
	}

	System.out.println("The sum of even integers is " + evenSum);
	System.out.println("The sum of odd integers is " + oddSum);

}}

	