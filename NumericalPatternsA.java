import java.util.Scanner;

public class NumericalPatternsA{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	for(int counterR = 1; counterR <= 6; counterR += 1){  		 //iterates the rows 6 times

		for(int counterC = 1; counterC <= counterR; counterC+= 1){	//column counter is always set to 1 when next iteration starts
								//column counter < row counter so the inner loop can iterate in increment i.e. 
								//i.e. if row is 2, since column always starts from 1, it will loop 2 times (to meet row counter's value and fulfill it's condition)
								//i.e. if row is 3, since column always starts from 1, it will loop 3 times (to meet row counter's value and fulfill it's condition)

			System.out.print(" " + counterC);		//print this everytime the inner loop iterates, value inside is displayed based on how many times the inner loop iterates
								//S.out has no println so it will print on the same line
								//i.e if the inner loop iterates 3 times, it will print the value 3 times on the same line
		
		}

		System.out.println();				//Start the next iteration of the inner loop on a new line 
	
	}


}}