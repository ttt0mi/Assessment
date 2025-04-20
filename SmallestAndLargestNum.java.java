import java.util.Scanner;

public class SmallestAndLargestNum{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int numb = 1;
	int minNum =  2000000000;
	int maxNum = -2000000000;

	while(numb != 0){
		
			System.out.print("Enter a number or enter 0 to quit: ");
			numb = input.nextInt();

			if(numb == 0) {}
			else
			if(numb <= minNum) minNum = numb; 
			else
			if(numb >= maxNum) maxNum = numb;
			else{}


	}
	System.out.println("The End");
	System.out.print("The Smallest & Largest Numbers are " + minNum);
	System.out.print(" and " + maxNum + " respectively");

}}