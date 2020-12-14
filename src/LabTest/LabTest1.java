package LabTest;
import java.util.Scanner;
public final class LabTest1 {

	public static void main(String[] args) {
		
		
		//printQuestion1();
		printQuestion2();
		
		
		
		
	}
	    public static void printQuestion1() {
		Scanner sc = new Scanner (System.in);
		
		int NoOfItem, quantity1, quantity2, quantity3 ;
		double price1, price2, price3 , totalprice = 0 , discount = 0 , PriceToPaid = 0; 
		
		
		System.out.print("Enter the number of items: ");
		NoOfItem = sc.nextInt();
		
		if(NoOfItem == 3) {

		System.out.print("Enter price of first item: RM ");
		price1 = sc.nextInt();
		System.out.print("Enter quantity of first item: ");
		quantity1 = sc.nextInt();
		
		
		System.out.print("\nEnter price of second item: RM ");
		price2 = sc.nextInt();
		System.out.print("Enter quantity of second item: ");
		quantity2 = sc.nextInt();
		
		System.out.print("\nEnter price of third item: RM ");
		price3 = sc.nextInt();
		System.out.print("Enter quantity of third item item: ");
		quantity3 = sc.nextInt();
		
		totalprice = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
		
		if(totalprice > 100) {
			discount = totalprice * 0.2;
		}
		else {
			discount = totalprice * 0.1 ;
		
		}
		
		PriceToPaid = totalprice - discount;
		
		System.out.println("\nTotal price      : RM " +totalprice);
		System.out.println("Discount received: RM " +discount);
		System.out.println("Price to be paid : RM " +PriceToPaid);
		

	}
		else if (NoOfItem == 2) {
			
			System.out.print("Enter price of first item: RM ");
			price1 = sc.nextInt();
			System.out.print("Enter quantity of first item: ");
			quantity1 = sc.nextInt();
			
			
			System.out.print("\nEnter price of second item: RM ");
			price2 = sc.nextInt();
			System.out.print("Enter quantity of second item: ");
			quantity2 = sc.nextInt();
			
			
			totalprice = (price1 * quantity1) + (price2 * quantity2) ;
			
			if(totalprice > 100) {
				discount = totalprice * 0.2;
			}
			else {
				discount = totalprice * 0.1 ;
			
			}
			
			PriceToPaid = totalprice - discount;
			
			System.out.println("\nTotal price      : RM " +totalprice);
			System.out.println("Discount received: RM " +discount);
			System.out.println("Price to be paid : RM " +PriceToPaid);
			
		}
		
		else if (NoOfItem == 1) {
			
			System.out.print("Enter price of first item: RM ");
			price1 = sc.nextInt();
			System.out.print("Enter quantity of first item: ");
			quantity1 = sc.nextInt();
			
			
			totalprice = (price1 * quantity1)  ;
			
			if(totalprice > 100) {
				discount = totalprice * 0.2;
			}
			else {
				discount = totalprice * 0.1 ;
			
			}
			
			PriceToPaid = totalprice - discount;
			
			System.out.println("\nTotal price       : RM " +totalprice);
			System.out.println("Discount received : RM " +discount);
			System.out.println("Price to be paid  3: RM " +PriceToPaid);
		}
		

 }
	    
	    public static void printQuestion2() {
	    	Scanner sc = new Scanner (System.in);
	    	
	    	int sales , hours ;
	    	double commission = 0 , wages = 0;
	    	
	    	System.out.print("Enter sales        : RM");
	    	sales = sc.nextInt();
	    	System.out.print("Enter hours worked : ");
	    	hours = sc.nextInt();
	    	
	    	if (sales > 150 && sales <= 300) {
	    		commission = sales * 0.05 ;
	    	}
	    	else if (sales > 301 && sales <= 500) {
	    		commission = sales * 0.1;
	    	}
	    	else if (sales > 500) {
	    		commission = sales * 0.15;
	    	}
	    	
	    	wages = (hours * 5) + commission ;
	    	
	    	System.out.println("\nCommission         : RM" +commission);
	    	System.out.println("Daily wages        : RM"+wages);
	    }
}
