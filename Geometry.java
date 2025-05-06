import java.util.Scanner;

public class Geometry{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	System.out.print("Enter Coordinate x1 ");
	float x1 = input.nextFloat();

	System.out.print("Enter Coordinate y1 ");
	float y1 = input.nextFloat();

	System.out.print("Enter Coordinate x2 ");
	float x2 = input.nextFloat(); 

	System.out.print("Enter Coordinate y2 ");
	float y2 = input.nextFloat();

	System.out.print("Enter Coordinate x3 ");
	float x3 = input.nextFloat();

	System.out.print("Enter Coordinate y3 ");
	float y3 = input.nextFloat();

	float area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;

	//use Math.abs() to use absolute brackets
	//Math CLASS is in the java.lang PACKAGE which is automatically imported

	System.out.printf("The area is %.1f", area);

}}











	/*float side1 = x1 + y1;
	float side2 = x2 + y2;
	float side3 = x3 + y3;

	float sideAvg = (side1 + side2 + side3)/2

	float areaOfTriange = (sideAvg(sideAvg - side 1) * (sideAvg - side 2) * (sideAvg - side 3)) / 2
	*/