package Class;
import java.util.Scanner;
public class Week8 {

	public static void main(String[] args) {

     //printExercise1();
     //printExercise2();
     //printExercise3();
	 //printAddNumber();
	  printAddNumbers2();

	}
	
     public static void printExercise1() {
		
		int choice = 1, total = 0;
		while (choice<4) {
			total = choice++;
			System.out.println(total);}

     }
     public static void printExercise2() {
 		
		 for(int number = 2; number < 20 ;number++) {
			 number = number *2;
			 if (number < 15) {
				 System.out.println(number);
			 }
		 }
	}
 	public static void printExercise3() {
		int i= 1;
		do {
			if ((i%2)==0) 
				System.out.println(i);
				i++;
			
		}while(i<5);

 	}
 	
 	public static void printAddNumber() {
 		int value, sum=0;
 		
 		Scanner console = new Scanner(System.in);
 		
 		System.out.print("Enter first integer (enter 0 to quit): ");
 		value = console.nextInt();
 		
 		while(value != 0) {
 			sum = sum +value;
 			
 			System.out.print("Enter next integer(enter 0 to quit): ");
 			value = console.nextInt();
 			
 		}
 		
 		System.out.println("Sum of the integers: " +sum);
 		
 		
 		}
 	public static void printAddNumbers2() {
 		int value, sum = 0 ;
 		char choice ;
 		Scanner console = new Scanner(System.in);
 		
 		do {
 		System.out.print("Enter integer: ");
 		value = console.nextInt();
 		
 		sum = sum + value;
 		
 		System.out.print("Enter Y for yes or N for no: ");
 		choice = console.next().charAt(0);
 		}
 		while(choice == 'y' || choice == 'Y');
 		
 		System.out.println("Sum of the integers: " + sum);
 		}
 	}
 	
