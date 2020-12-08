package Class;

public class Week {

	public static void main(String[] args) {
		
		printExercise1();
		
	}
	
	public static void printExercise1() {
		
		int choice = 1, total = 0;
		while (choice<4) {
			total = choice++;
			System.out.print(total);}
		
		
	}
	
	public static void printExercise2() {
		
		 for(int number = 2; number < 20 ;number++) {
			 number = number *2;
			 if (number < 15) {
				 System.out.print(number);
			 }
		 }
	}
	
	public static void printExercise3() {
		int i= 1;
		do {
			if ((i%2)==0) {
				System.out.print(i);
				i++;
			}
		}while(i<5);
	}

}