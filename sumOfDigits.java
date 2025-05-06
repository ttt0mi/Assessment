import java.util.Scanner; //importing Scanner CLASS from java utility PACKAGE

public class sumOfDigits{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000: ");
	int num = input.nextInt();

	if(num < 0 || num > 1000) {
	System.out.print("Invalid Input! Fuck Off");
	}

	if(num > 0 && num < 1000) {
	int digit1 = num % 10; //'unit' digit is removed from the main number using remainder operand
	int remNum = num / 10;

	int digit2 = remNum % 10; //'tenth' digit is removed from the main number using remainder operand
	remNum = remNum / 10;

	int digit3 = remNum % 10; //'hundredth' digit is removed from the main number using remainder operand
	remNum = remNum / 10;

	int sum = digit1 + digit2 + digit3;

	System.out.printf("The sum of digits in %d is %d", num, sum);

}}}


/*
OR

import java.util.Scanner; //importing Scanner CLASS from java utility PACKAGE

public class sumOfDigits{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000: ");
	int num = input.nextInt();

	if(num <= 0 || num >= 1000) {
	System.out.print("Invalid Input! Fuck Off");
	}

	int digit1 = 0;
	int digit2 = 0;
	int digit3 = 0;
	int remNum = 0;

	if(num > 0 && num < 1000) {
	digit1 = num % 10; //'unit' digit is removed from the main number using remainder operand
	remNum = num / 10;

	digit2 = remNum % 10; //'tenth' digit is removed from the main number using remainder operand
	remNum = remNum / 10;

	digit3 = remNum % 10; //'hundredth' digit is removed from the main number using remainder operand
	remNum = remNum / 10;

	int sum = digit1 + digit2 + digit3;

	System.out.printf("The sum of digits in %d is %d", num, sum);

}}}

*/
