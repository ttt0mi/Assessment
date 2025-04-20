import java.util.Scanner;
import java.util.Random;

public class MysteryGameLoopedW{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random rnumber = new Random();


	int CompGuess= rnumber.nextInt(11);
	int counter = 1; 


	while(counter <= 3){

	System.out.print("Guess a number between 1 and 10: ");
	double humanGuess = input.nextDouble();
	
		if(humanGuess < 1 || humanGuess > 10){
			System.out.println("Invalid Input mate");
			counter += 3;
		}
		else 
		if(humanGuess == CompGuess){
			System.out.println("You Win");
			counter += 3;
		}
		else
		if(humanGuess > CompGuess){
			System.out.println("Too High");
		}
		else
		if(humanGuess < CompGuess){
			System.out.println("Too Low");
		}
		else{
			System.out.println("Invalid Input"); 
		}

	counter += 1;

	}








}}
