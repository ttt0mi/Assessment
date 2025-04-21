import java.util.Scanner;

public class NumericalPatternsB{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);


	for(int counterR = 6; counterR >= 1; counterR -= 1){  		 //iterates the rows 6 times
								//This time, It loops 6 times first and decreses from there

		for(int counterC = 1; counterC <= counterR; counterC+= 1){	//column counter is always set to 1 when next iteration starts
								//column counter < row counter so the inner loop can iterate in decrement i.e. 
								//i.e. if row is 6, since column always starts from 1, it will loop 6 times (to meet row counter's value and fulfill it's condition)
								//i.e. if row is 5, since column always starts from 1, it will loop 5 times (to meet row counter's value and fulfill it's condition)

			System.out.print(" " + counterC);		//print this everytime the inner loop iterates, value inside is displayed based on how many times the inner loop iterates
								//S.out has no println so it will print on the same line
								//i.e if the inner loop iterates 4 times, it will print the value 4 times on the same line
		
		}

		System.out.println();				//Start the next iteration of the inner loop on a new line 
	
	}

}}