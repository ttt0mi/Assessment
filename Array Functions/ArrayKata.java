public class ArrayKata{

//1
	public int maximumIn(int[] array){

		int largestNum = Integer.MIN_VALUE;

		for(int index = 0; index < array.length; index++){

			if(array[index] > largestNum) largestNum = array[index];

		}
		return largestNum;

	}


//2
	public int minimumIn(int[] array){

		int smallestNum = Integer.MAX_VALUE;

		for(int index = 0; index < array.length; index++){

			if(array[index] < smallestNum) smallestNum = array[index];

		}
		return smallestNum;

	}


//3
	public int sumOf(int[] array){

		int sum = 0;

		for(int index = 0; index < array.length; index++){

			sum += array[index];

		}
		return sum;

	}


//4
	public int sumOfEvenNumbersIn(int[] array){

		int evenSum = 0;

		for(int index = 0; index < array.length; index++){

			if(array[index] % 2 == 0) evenSum += array[index];

		}
		return evenSum;

	}



//5
	public int sumOfOddNumbersIn(int[] array){

		int oddSum = 0;

		for(int index = 0; index < array.length; index++){

			if(array[index] % 2 != 0) oddSum += array[index];

		}
		return oddSum;		

	}



//6
	public int[] maximumAndMinimumOf(int[] array){

		int largestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;

		for(int index = 0; index < array.length; index++){

			if(array[index] > largestNum) largestNum = array[index];

			if(array[index] < smallestNum) smallestNum = array[index];

		}

		int [] minMax = {largestNum, smallestNum};

		return minMax;


		//return new int[] {largestNum, smallestNum}

	}



//7
	public int noOfOddNumbersIn(int[] array){

		int oddCounter = 0;

		for(int index = 0; index < array.length; index++){

			if(array[index] % 2 != 0) oddCounter++;

		}
		return oddCounter;	

	}



//8
	public int noOfEvenNumbersIn(int[] array){

		int evenCounter = 0;

		for(int index = 0; index < array.length; index++){

			if(array[index] % 2 != 0) evenCounter++;

		}
		return evenCounter;	

	}



//9
	public int[] evenNumbersIn(int[] array){


		int evenNumberCounter = 0;

		for(int index = 0; index < array.length; index++){

			if(array[index] % 2 == 0) evenNumberCounter++;
		}



		int[] evenNumbers = new int[evenNumberCounter];

		int evenNumbersIndex = 0;


		for(int index = 0; index < array.length; index++){
			
			if(array[index] % 2 == 0){

				evenNumbers[evenNumbersIndex] = array[index];
				evenNumbersIndex++;
			}
		}
		return evenNumbers;


		
	}



//10
	public int[] oddNumbersIn(int[] array){


		int oddNumberCounter = 0;

		for(int index = 0; index < array.length; index++){

			if(array[index] % 2 != 0) oddNumberCounter++;
		}

		

		int[] oddNumbers = new int[oddNumberCounter];

		int oddNumbersIndex = 0;


		for(int index = 0; index < array.length; index++){
			
			if(array[index] % 2 != 0){

				oddNumbers[oddNumbersIndex] = array[index];
				oddNumbersIndex++;
			}
		}
		return oddNumbers;

	}



//11
	public int[] squareNumbersIn(int[] array){

		int square = 0;

		int[] squaredNumbers = new int[array.length];

		int squaredNumbersIndex = 0;


		for(int index = 0; index < array.length; index++){
			
			square = (int) Math.pow(array[index], 2);

			squaredNumbers[squaredNumbersIndex] = square;
			squaredNumbersIndex++;

		}
		return squaredNumbers;
		
	}


}