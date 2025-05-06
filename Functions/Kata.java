public class Kata{
	
//1
	public boolean isEven(int number){
	
		boolean even = number % 2 == 0;
		return even;
	}


//2
	public boolean isPrimeNumber(int number){
	
		int primeCounter = 0;
		boolean prime;

		if(number < 2) prime = false;
		else{
			for(int counter = 1; counter <= number; counter++){
			
				if(number % counter == 0) primeCounter++;
		
			}
			 prime = primeCounter == 2;
		}
		return prime;
	}


//3
	public int subtract(int number1, int number2){

		int difference = Math.abs(number1 - number2);
		return difference;
	}


//4
	public float divide(int number1, int number2){

		float quotent = 0;

		if(number2 != 0){
			quotent = (float) number1 / number2;
			return quotent;
		}
		else return quotent;
	}


//5
	public int factorOf(int number){
	
		int factorCounter = 0;
		for(int counter = 1; counter <= number; counter++ ){
		
			if(number % counter == 0) factorCounter++;
		}
		return factorCounter++;
	}


//6
	public boolean isSquare(int number){

		boolean square = false;
		for(int counter = 1; counter <= number; counter++ ){
	
			if(number / counter == counter) square = true;
		}
		return square;	
	}


//7
	public boolean palindrome(int number){

		int oldNum = number;
		int remNum = 0;
		int reversedNum = 0;

		while(number != 0){

			remNum = number % 10;
			reversedNum = reversedNum * 10 + remNum;
			number = number / 10;
		}
		return oldNum == reversedNum;

	}


//8
	public long factorialOf(int number){
	
		long answer = 1L;
		for(int counter = 0; counter <= number; counter++ ){
	
			answer = answer * (number - counter);
		}
		return answer;

	}


//9
	public long squareOf(int number){

		return number * number;
	}


}