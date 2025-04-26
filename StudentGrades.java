import java.util.Scanner;

public class StudentGrades{

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

				
		
		if(grade < 0 || grade > 100){

			System.out.println(" invalid Input!");
			 invalidGradesCounter++;
		}

		if(grade >= 0 && grade <= 100){

			switch(grade / 10){
				case 0, 1, 2, 3, 4: {
					System.out.println("This Student Got an F! ");
					fCounter++;
					break;
				}
				case 5: {
					System.out.println("This Student Got a D! ");
					dCounter++;
					break;
				}
				case 6: {
					System.out.println("This Student Got a C! ");
					cCounter++;
					break;
				}
				case 7: {
					System.out.println("This Student Got a B! ");
					bCounter++;
					break;
				}
				case 8, 9, 10: {
					System.out.println("This Student Got a A! ");
					aCounter++;
					break;
				}

			} //switch end
			
			validGradesCounter++;

		}if end
	
	} //while end

	System.out.println();
	System.out.printf("There are %d A's, %d B's, %d C's, %d D's & %d F's",  aCounter, bCounter, cCounter,  dCounter,  fCounter);    
	System.out.println();
	System.out.printf("There were also %d invalid inputs", invalidGradesCounter);
	
}}
	