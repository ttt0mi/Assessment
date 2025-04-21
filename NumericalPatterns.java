import java.util.Scanner;

public class NumericalPatterns{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	for(int counterR = 1; counterR <= 6; counterR += 1){  

		for(int counterC = 1; counterC <= counterR; counterC+= 1){

			System.out.print(" " + counterC);
		
		}

		System.out.println();
	
	}

}}
