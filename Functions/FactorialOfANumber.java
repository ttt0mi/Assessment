import java.util.Scanner;

public class FactorialOfANumber{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	Kata kata = new Kata(); 

	System.out.print("Enter a number: ");
	int numb1 = input.nextInt();

	System.out.print(kata.factorialOf(numb1));

	
	

}}