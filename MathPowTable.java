import java.util.Scanner;

public class MathPowTable{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("a    b      pow(a, b)");

	int aCounter = 1;
	int bCounter = 2;

	for(int counter = 0; counter < 5; counter += 1){

		int exponential = (int) Math.pow(aCounter, bCounter);

		System.out.println(aCounter + "    " + bCounter + "       " +  exponential);
	
		aCounter += 1;
		bCounter += 1;

	}


}}