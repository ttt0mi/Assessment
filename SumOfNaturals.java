public class SumOfNaturals{
	 public static void main(String... args){

	int nTerms = 10;
	int naturalNumSum = 0;
	int naturalNumCounter = 1;

	while(naturalNumCounter <= nTerms){

		naturalNumSum += naturalNumCounter  ;
		naturalNumCounter += 1;
	
	}

	System.out.print("The Sum of All Natural Numbers are " + naturalNumSum);


}}
