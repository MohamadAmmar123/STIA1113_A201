package Exercise;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		
		
		printQuestion1();
		printQuestion2();
		printQuestion3();
		printQuestion4();
		
	}
	
	
	
		public static void printQuestion1() {
		 //Declare an array alpha of 15 elements of type int.
		 int[] alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		 int[] beta = new int [20];
		
		 //Output the value of the tenth element of the array alpha.
		 System.out.println(alpha[9]);
		
		 //Set the value of the fifth element of the array alpha to 35.
		 alpha[4] = 35 ;
		 System.out.println(alpha[4]);
		
		 //Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
		 alpha[8] = alpha[5] + alpha[12];
		 System.out.println("Sum = " +alpha[8]);

	}
		
		public static void printQuestion2() {
		 /*Write a statement that declares a string array initialized with the following strings:
		   "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".*/
		//Write a loop that displays the contents of each element in the array that you declared.
			
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday" };
		for (int i = 0 ; i< days.length; i++ ) {
			System.out.println(days[i]);
		}
		System.out.println();	
		int j = 0;
		while (j < days.length) {
			System.out.println(days[j]);
			j++ ;
		}
		
		
		System.out.println();	
		int k = 0;
		 do {
		  System.out.println(days[k]);
		  k++;
		 }while (k < days.length);
			
	}
		
		public static void printQuestion3() {
			
			final int num = 10;
			int[] number = new int[num];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter 10 numbers: ");
		
			
			for (int a = 0 ; a< num ; a++) {
				number[a] = sc.nextInt();
			}
			for (int a = 0 ; a< num ; a++) {
				System.out.println(number[a]);
			}
			
			int sum = 0;
			for(int a = 0 ; a < num ; a++) {
				sum = sum + number[a];
				
			}
			
			System.out.println("Sum of numbers: " +sum);
			
		}
		
		public static void printQuestion4() {
		  Scanner sc = new Scanner(System.in);
		  int [] list1 = new int[5];
		  int[] list2 = new int[5];
		  
		  System.out.print("Enter five number for List1: ");
		  for (int i=0; i<list1.length; i++) {
				list1[i] = sc.nextInt() ;
		  }
		  
		  System.out.println("list1: ");
		  for (int i=0; i<list1.length; i++) {
			  System.out.println(list1[i]);
			}
		  
		  System.out.println("list2: ");
			for (int i=0; i<list1.length; i++) {
			  list2[i] = list1[i];
			  System.out.println(list2[i]);
			}
		  
		}
		

}
