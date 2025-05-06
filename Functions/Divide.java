import java.util.Scanner;

public class Divide{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	Kata kata = new Kata(); 

	System.out.print("Enter a number: ");
	int numb1 = input.nextInt();

	System.out.print("Enter a number: ");
	int numb2 = input.nextInt();

	System.out.print(kata.divide(numb1, numb2));

	
	

}}