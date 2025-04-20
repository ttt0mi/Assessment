import java.util.Scanner;
import java.util.Random;

public class MysteryGameApp2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random rnumber = new Random();

	double humanGuess = 0;
	int CompGuess = rnumber.nextInt(10) + 1;
	int counter = 0;

	while(humanGuess != CompGuess){
		System.out.print("Guess a number between 1 and 10: ");
		humanGuess = input.nextDouble();

		if(humanGuess < 1 || humanGuess > 10){
			System.out.println("Invalid Input mate");
		}
		else if(humanGuess > CompGuess){
			System.out.println("Too High, Try Again");
		}
		else if(humanGuess < CompGuess){
			System.out.println("Too Low, Try Again");
		}
		else{}
		counter += 1;
	}
	if(humanGuess == CompGuess){
		if(counter == 1) {
			System.out.println("Congratulations. You took " + counter + " guess");
		}
		else {
			System.out.println("Congratulations. You took " + counter + " guesses");
		}

	}

}}








