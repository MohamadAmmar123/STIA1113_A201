package Assignment;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String name  ;
		String ic ;
		long acc ;
		int age, balance ;
		double intrest, yearbalance;

		
		
		System.out.println("*****WELCOME TO AMMAR BANK*****");
		System.out.println("\nEnter Name: ");
		name = sc.nextLine();
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter IC number:");
		ic = sc.next();
		System.out.println("Enter Account Number: ");
		acc = sc.nextLong();
		
		
		System.out.print("\nEnter Current Saving Account: RM ");
		balance = sc.nextInt();
		System.out.println("Intrest rate for this Bank is 2.0% per year");
		
		intrest = balance * 0.02 ;
		yearbalance = balance + intrest ;
		
		System.out.println();
		
	    System.out.println("NAME                : "+name);
	    System.out.println("AGE                 : "+age);
	    System.out.println("IC NUMBER           : "+ic);
	    System.out.println("ACCOUNT NUMBER      : "+acc);

	    System.out.println("\nYour year intrest   :RM " + intrest);
		System.out.println("Your yearly balance : RM " +yearbalance);
		System.out.println("\n*Thank You For Using Our Service.*");
		
		sc.close();

	}

}
