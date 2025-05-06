public class gameArrays1{
	public static void main(String... args){

	char [][] game = new char[3][3];

	game[0][0] = 'X';
	game[0][1] = 'O';
	game[0][2] = 'X';

	game[1][0] = 'O';
	game[1][1] = 'O';
	game[1][2] = 'O';

	game[2][0] = 'X';
	game[2][1] = 'X';
	game[2][2] = 'O';

	//System.out.print(game[][]);

	for(int mainArrayIndex = 0; mainArrayIndex < 3; mainArrayIndex++){

		for(int innerArrayIndex = 0; innerArrayIndex < 3; innerArrayIndex++){
		
			System.out.print(game[mainArrayIndex][innerArrayIndex] + "  ");

		}
		System.out.println();

	}

	

}}