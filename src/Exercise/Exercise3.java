package Exercise;

import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double quiz, midterm, finalscores ,average ;
		
		System.out.print("Enter Quiz scores:");
		quiz = sc.nextDouble();
		System.out.print("\nEnter mid-term scores:");
		midterm = sc.nextDouble();
		System.out.print("\nEnter Final scores:");
		finalscores = sc.nextDouble();
		
		average = (quiz + midterm + finalscores) /3 ;
		
		
		if (average >= 90) {
			System.out.print("\nYour grade is A");
		}
		else if (average >=70 && average <90) {
			System.out.print("\nYour grade is B");
		}
		else if (average >=50 && average <70) {
			System.out.print("\nYour grade is C");
		}
		else 
			System.out.print("\nYour grade is F");
		
		sc.close();

	}

}