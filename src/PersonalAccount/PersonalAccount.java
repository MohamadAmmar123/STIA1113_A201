package PersonalAccount;

import java.util.Scanner;

public class PersonalAccount {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("*****WELCOME TO UUM BANK*****");
			String name  ;
			String ic ;
			long acc ;
			int age, balance = 0, year , register  ;
			double intrest=0, yearbalance=0 , totalintrest=0;

			
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
					
					
					
					int [] gift1 = {5};
					System.out.println("Did you know that you will get free gift because of your loyalty in our service");
					System.out.println("You can get random item by enter one of this number 1, 2, 3, 4, 5. ");
					
					for (int k=0 ; k<gift1.length; k++) {
					System.out.print("Enter the number of the gift: ");
					gift1[k] = sc.nextInt();
					if (gift1[k] == 1) {
						System.out.println("You will get Umbrella as a gift.");
					}
					else if(gift1[k] == 2) {
						System.out.println("You will get Bottle as a gift.");
					}
					else if (gift1[k] == 3) {
						System.out.println("You will get Tote Bag as a gift.");
					}
					else if (gift1[k] == 4) {
						System.out.println("You will get Mini Fan as a gift.");
					
					}
					else if (gift1[k] == 5) {
						System.out.println("You will get PowerBank as a gift.");
					
					}
			
				}
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
			System.out.println("Makesure to checkout your gift at bank counter by show this resit.");
			
			System.out.println("\n*Thank You For Using Our Services*");
			System.out.println("*************************************************");
			
			sc.close();

	}

}
