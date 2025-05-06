public class MaximumAndMinimum{
	public static void main(String... args){

	ArrayKata kata = new ArrayKata();
	
	int [] numbers = {22, 38, 51, 23, 48};

	int [] result = kata.maximumAndMinimumOf(numbers);


	for(int index = 0; index < result.length; index++) System.out.print(result[index] + " ");
	

}}