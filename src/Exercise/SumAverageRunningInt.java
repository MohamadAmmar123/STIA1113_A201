package Exercise;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		System.out.println("For Loop");
		int sum = 0;
		double average ;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum = number + sum;
		}
		
		average = sum / 100 ;
		
		System.out.println("The sum of 1 to 100 is " +sum);
		System.out.println("The average is " +average);
		
		System.out.println("\nWhile Loop");
		int sumWhile = 0 ;
		double averageWhile ;
		int lowerboundWhile = 1;
		int upperboundWhile = 100;
		while (lowerboundWhile <= upperboundWhile ){
			sumWhile = lowerboundWhile + sumWhile;
			lowerboundWhile = lowerboundWhile + 1;
		}
		averageWhile = sumWhile /100 ;
		System.out.println("The sum of 1 to 100 is " +sumWhile);
		System.out.println("The average is " +averageWhile);
		
		
		System.out.println("\nDo While Loop");
		int sumDoWhile = 0 ;
		double averageDoWhile ;
		int lowerboundDoWhile = 1;
		int upperboundDoWhile = 100;
		do {
			sumDoWhile = lowerboundDoWhile + sumDoWhile;
			lowerboundDoWhile = lowerboundDoWhile + 1;
		}while (lowerboundDoWhile <= upperboundDoWhile );
		
		
		averageDoWhile = sumDoWhile /100 ;
		System.out.println("The sum of 1 to 100 is " +sumDoWhile);
		System.out.println("The average is " +averageDoWhile);
		
		
		

	}

}
