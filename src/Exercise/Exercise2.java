package Exercise;

import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		
		
		
		printQ1();
		//printQ2();
		//printQ3();
		//printQ4();
		//printQ5();
		//printQ6();
		//printQ7();
		//printQ8();
		//printQ9();
		//printQ10();
	}
	
	
	
	public static void printQ1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input seconds: ");
		int seconds = sc.nextInt();
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		System.out.print( p2 + "h:" + p3 + "m:" + p1 +"s");
		System.out.print("\n");
		
	}
	//determine number has reminder or not
	public static void printQ2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nInput a number: ");
		int n = sc.nextInt(); 
		if (n % 2 == 0) {
		System.out.println(1); }
		else {
	    System.out.println(0); }
		
	}
	
	public static void printQ3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter two integer number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int product = num1*num2;
		System.out.print("Your product of two numbers are " +product +".");
		System.out.print("\n");
		
	}
	// two double variables and test if both strictly between 0 and 1 and false otherwise
	public static void printQ4() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\nInput first number: ");
         double n1 = sc.nextDouble();
         System.out.print("Input second number: ");
         double n2 = sc.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
		 System.out.print("\n");
	}
	
	public static void printQ5() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("\nInput a positive integer: ");
		  int n = sc .nextInt();
		  System.out.print("Is the said number perfect square? \n" + is_Perfect_Square(n));
		  System.out.print("\n");
		 }

	 public static boolean is_Perfect_Square(int n) {
		  int x = n % 10;
		  if (x == 2 || x == 3 || x == 7 || x == 8) {
		   return false;
		  }
		  for (int i = 0; i <= n / 2 + 1; i++) {
		   if ((long) i * i == n) {
		    return true;
		   }
		  }
		  return false;
	 }
		 
	  public static void printQ6(){
            Scanner sc = new Scanner(System.in);
            System.out.print("\nInput x : ");
            int x = sc.nextInt();  
            System.out.print("Input n : ");
            int n = sc.nextInt(); 
            System.out.print("Input y : ");
            int y = sc.nextInt(); 
            double result = Math.pow(x, n);
            double result1 = result % y;
            System.out.println("x^n % y = " + result1); 
            System.out.print("\n");
		  }
		 
	  public static void printQ7(){ 
	        Scanner sc = new Scanner(System.in);
			System.out.println("\nInput number of straight lines:");
	     	int n=sc.nextInt();
			System.out.println("Number of regions:");
	        System.out.println((n * (n + 1) >> 1) + 1);
	        System.out.print("\n");
	    }
	  
	  public static void printQ8(){
	       boolean b = true;
	       Scanner sc = new Scanner(System.in);
	       System.out.print("\nInput a number : ");
	       int num = sc.nextInt();       
	       System.out.print("\n");
	       
	     while(num!=1)
	      {
	        if(num%2!=0)
	          { 
	            b=! b;
	            System.out.print(b);
	            System.exit(0);
	          }
	            num = num / 2;
	      }
	       System.out.print(b);
	       System.out.print("\n");
	     }
	  
	  public static void printQ9() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("\nInput side1: ");
		  int s1 = sc.nextInt();
		  System.out.print("Input side2: ");
		  int s2 = sc.nextInt();
		  System.out.print("Input side3: ");
		  int s3 = sc.nextInt();

		  System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
		  System.out.print("\n");
		 }
		 public static boolean isValidTriangle(int a, int b, int c) {
		  return (a + b > c && b + c > a && c + a > b);
		 }
		 
		 public static void printQ10() {
			 Scanner sc = new Scanner(System.in);
			 System.out.print("\nInput first number: ");
	         int num1 = sc.nextInt();
	         System.out.print("Input second number: ");
	         int num2 = sc.nextInt();
			 System.out.print("Input third number: ");
	         int num3 = sc.nextInt();
	         System.out.print("Input fourth number: ");
	         int num4 = sc.nextInt();		
			
			if (num1 == num2 && num2 == num3 && num3 == num4) 
			  {
				System.out.println("Numbers are equal.");
	                               }
			else
				{
				System.out.println("Numbers are not equal!");
			}
			System.out.print("\n");
		 }
}