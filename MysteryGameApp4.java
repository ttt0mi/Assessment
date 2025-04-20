import java.util.Scanner;
import java.util.Random;

public class MysteryGameApp4{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random rnumber = new Random();

	double humanGuess = 0;
	int CompGuess = rnumber.nextInt(10) + 1;
	int counter = 0;
	int changeCounter = 0;
		
	while(humanGuess != CompGuess && counter < 20){

		System.out.print("Guess a number between 1 and 10: ");
		humanGuess = input.nextDouble();
	
		if(humanGuess < 1 || humanGuess > 10) System.out.println("Invalid Input mate");
		else
		if(humanGuess > CompGuess) System.out.println("Too High, Try Again");
		else
		if(humanGuess < CompGuess) System.out.println("Too Low, Try Again");
		else{}

		counter += 1;
		changeCounter += 1;
	
		if(changeCounter % 3 == 0){
			CompGuess = rnumber.nextInt(10) + 1;
			System.out.println("The Computers' Number's Changed mate");
		}

		if(counter == 20) System.out.println("aw, Game Over mate");

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
