import java.util.Scanner;

public class IsItASquare{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	Kata kata = new Kata(); 

	System.out.print("Enter a number: ");
	int numb1 = input.nextInt();

	System.out.print(kata.isSquare(numb1));

	
	

}}