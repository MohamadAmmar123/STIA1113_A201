package Assignment;

import java.util.Scanner;

public class Assignment2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String name  ;
			String ic ;
			long acc ;
			int age, balance = 0, year , register, gift = 0 ;
			double intrest=0, yearbalance=0 , totalintrest=0;

			
			
			System.out.println("*****WELCOME TO AMMAR BANK*****");
			System.out.println("\nEnter Name: ");
			name = sc.nextLine();
			System.out.println("Enter Age: ");
			age = sc.nextInt();
			System.out.println("Enter IC number:");
			ic = sc.next();
			System.out.println("Enter Account Number: ");
			acc = sc.nextLong();
			
			System.out.println("For your information, your intrest rate will increase to 4.0% after 10 year your registration.");
			
			System.out.println("\nEnter how many year you registered with this bank account: ");
			register = sc.nextInt();
			
			if (register <= 10) {
			System.out.println("How many year did you want to Check Interest?");
			year = sc.nextInt();
			
			System.out.print("\nEnter Current Saving Account: RM ");
			balance = sc.nextInt();
			System.out.println("Intrest rate for this account is 2.0% per year");
			
			
			for(int i = 0 ; i < year ; i++) {
			
			intrest = balance * 0.02 ;
			
		    totalintrest = intrest + totalintrest ;
			}
			
			yearbalance = balance + totalintrest ;
			}
			else if (register > 10) {
				System.out.println("How many year did you want to Check Interest?");
				year = sc.nextInt();
				
				System.out.print("\nEnter Current Saving Account: RM ");
				balance = sc.nextInt();
				System.out.println("\nIntrest rate for this account is 4.0% per year.");
					for(int i = 0 ; i < year ; i++) {
					
					intrest = balance * 0.04 ;
					
				    totalintrest = intrest + totalintrest ;
					}
					
					yearbalance = balance + totalintrest ;
					
					System.out.println("Did you know that you will get free gift because of your loyalty in our service");
					System.out.println("You can choose one of this item: ");
					System.out.println("1.Umbrella");
					System.out.println("2.Bottle");
					System.out.println("3.Tote Bag ");
					System.out.print("Enter the number of the gift: ");
					gift = sc.nextInt();
					
				}
				
			
			System.out.println();
			System.out.println("*************************************************");
		    System.out.println("NAME                : "+name);
		    System.out.println("AGE                 : "+age);
		    System.out.println("IC NUMBER           : "+ic);
		    System.out.println("ACCOUNT NUMBER      : "+acc);

		    System.out.println("\nYour year intrest          :RM " + intrest);
		    System.out.println("Your total intrest         :RM " + totalintrest);
		    System.out.println("Your balance before intrest : RM " +balance);
			System.out.println("Your balance after intrest : RM " +yearbalance);
			if (gift == 1) {
				System.out.println("You will get Umbrella as a gift.");
			}
			else if(gift == 2) {
				System.out.println("You will get Bottle as a gift.");
			}
			else if (gift == 3) {
				System.out.println("You will get Tote Bag as a gift.");
			}
			else {
			System.out.println("You don't receive any gift.");	
			}
			
			System.out.println("\n*Thank You For Using Our Services*");
			System.out.println("*************************************************");
			sc.close();

		}

}
