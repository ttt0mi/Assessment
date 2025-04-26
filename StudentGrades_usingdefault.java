import java.util.Scanner;

public class StudentGrades_usingdefault{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int grade = -1;
	int validGradesCounter = 0;
	int invalidGradesCounter = 0;
	int aCounter = 0;
	int bCounter = 0;
	int cCounter = 0;
	int dCounter = 0;
	int fCounter = 0;


	while(validGradesCounter < 10 ){

		System.out.print("Enter the score of a student: ");
		grade = input.nextInt();

		switch(grade / 10){
			case 0, 1, 2, 3, 4: {
				System.out.println("This Student Got an F! ");
				fCounter++;
				validGradesCounter++;
				break;
			}
			case 5: {
				System.out.println("This Student Got a D! ");
				dCounter++;
				validGradesCounter++;
				break;
			}
			case 6: {
				System.out.println("This Student Got a C! ");
				cCounter++;
				validGradesCounter++;
				break;
			}
			case 7: {
				System.out.println("This Student Got a B! ");
				bCounter++;
				validGradesCounter++;
				break;
			}
			case 8, 9, 10: {
				System.out.println("This Student Got a A! ");
				aCounter++;
				validGradesCounter++;
				break;
			}
			default: {
				System.out.println(" invalid Input!");
			 	invalidGradesCounter++;
			}

		} //switch end

	} //while end
	

	System.out.println();
	System.out.printf("There are %d A's, %d B's, %d C's, %d D's and %d F's",  aCounter, bCounter, cCounter,  dCounter,  fCounter);    
	System.out.println();
	System.out.printf("There were also %d invalid inputs", invalidGradesCounter);
	
}}
