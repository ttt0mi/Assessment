import java.util.Scanner;

public class DoWhileLoop_s{
	 public static void main(String... args){
	Scanner input = new Scanner(System.in);

	double sentinelValue = 1;

	do{

		System.out.print("Enter a number: ");
		double numb = input.nextDouble();
		System.out.print("Enter another number: ");
		double numb2 = input.nextDouble();

		double sum = numb + numb2;

		System.out.println("The Sum of Both Numbers is " + sum);

		System.out.println();

		System.out.print("If you wish to perform this operation again, enter 0. To quit, enter 1. ");
		sentinelValue = input.nextDouble();

	}
	while(sentinelValue == 0);

	if(sentinelValue < 0 || sentinelValue > 1) System.out.println("only 0 or 1 mate");
	else
	if(sentinelValue == 1) System.out.println("'preciate you mate, i'm out");
	else System.out.println("'mate? that's invalid.. only 0s or 1s");


}}