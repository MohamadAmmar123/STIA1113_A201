package Quiz;
import java.util.*;
public class Quiz1 {

		 public static void main(String[] Strings) {

		        Scanner sc=new Scanner(System.in);
		        
		        double feet,inches, f, m;
		        

		        System.out.println("Enter height in feet and inches,");
		        System.out.print("Feet: ");
		        feet = sc.nextDouble();

		        System.out.print("Inches: ");
		        inches = sc.nextDouble();

		       
		        
		        f = ((((feet-5)*12)+inches)*5)+40;
		        m = ((((feet-5)*12)+inches)*6)+50;
		        
		        System.out.println("Ideal weight for female: "+f +"kg");
		        System.out.print("Ideal weight for male: "+m +"kg");
		        sc.close();
		    }
	   }