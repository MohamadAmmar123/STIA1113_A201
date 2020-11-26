package Class;
import java.util.Scanner;
public class CGPA{

	public static void main(String[] args) {
		
		
		
		//printRepetition();
		printArray();
		
	}
	
	
	public static void printRepetition() {
	Scanner sc= new Scanner(System.in);
	
	int student, quiz, midterm, finalscores, higher=0, lowest=0 ;
	double average =0  ;
		
	System.out.print("Number of Student:");
	student = sc.nextInt();
	
		for (int i = 0 ; i < student ; i++) {
			System.out.print("Enter Quiz scores:");
			quiz = sc.nextInt();
			System.out.print("Enter mid-term scores:");
			midterm = sc.nextInt();
			System.out.print("Enter Final scores:");
			finalscores = sc.nextInt();
			
			average = (quiz + midterm + finalscores) /3 ;  
			
			if (quiz >= midterm && quiz >= finalscores) {
				higher = quiz;
			}
			else if (midterm >= quiz && midterm >= finalscores) {
				higher = midterm;
			}
			else if (finalscores >= quiz && finalscores >= midterm) {
				higher = finalscores;
			}
			
			if (quiz <= midterm && quiz <= finalscores) {
				lowest = quiz;
			}
			else if (midterm <= quiz && midterm <= finalscores) {
				lowest = midterm;
			}
			else if (finalscores <= quiz && finalscores <= midterm) {
				lowest = finalscores;
			}
			
			
			System.out.println("Average score: " +average);
			System.out.println("Highers score: " +higher);
			System.out.println("Lowest score : " +lowest);
			
			
			
			if (average >= 90) {
				System.out.println("Your grade is A");
			}
			else if (average >=70 && average <90) {
				System.out.println("Your grade is B");
			}
			else if (average >=50 && average <70) {
				System.out.println("Your grade is C");
			}
			else 
				System.out.println("Your grade is F");
		}
		

	}
	
	public static void printArray() {
		Scanner sc= new Scanner(System.in);
		
		int student, quiz, midterm, finalscores ;
		double average =0  ;
		
		System.out.print("Number of Student:");
		student = sc.nextInt();
		int[] counter = new int [student];
		for (int i=0 ; i< counter.length ; i++) {
			System.out.print("Enter Quiz scores:");
			quiz = sc.nextInt();
			System.out.print("Enter mid-term scores:");
			midterm = sc.nextInt();
			System.out.print("Enter Final scores:");
			finalscores = sc.nextInt();
			
			average = (quiz + midterm + finalscores) /3 ; 
			System.out.println("Average score: " +average);
			if (average >= 90) {
				System.out.println("Your grade is A");
			}
			else if (average >=70 && average <90) {
				System.out.println("Your grade is B");
			}
			else if (average >=50 && average <70) {
				System.out.println("Your grade is C");
			}
			else 
				System.out.println("Your grade is F");
		}
		
		
	}

}