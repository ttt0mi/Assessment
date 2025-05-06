import java.util.Scanner;

public class MinutesToYears {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Numbers of Minutes To Convert: ");
	int minutes = input.nextInt();

	int minsInADay = 60 * 24;        //1440 mins
	int noOfDays = minutes / minsInADay; //694444 days
	int noOfYears = noOfDays / 365;
	int remainderDays = noOfDays % 365;

	System.out.printf("%d minutes is approximately %d years and %d days", minutes, noOfYears, remainderDays);


	}
}

 