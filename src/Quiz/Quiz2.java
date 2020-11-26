package Quiz;

public class Quiz2 {

	public static void main(String[] args) {
		System.out.println("1.");
		int max = 5;
		int n= 1;
		while ( n <= max) {
		    System.out.println(n);
		    n++;
		}
		System.out.println();
		
		
		System.out.println("2.");
		int total = 25;
		int number = 1;
		while ( number <= (total / 2)) {
		    total = total - number;
		    System.out.println(total + " " + number);
		    number++;
		}
		System.out.println();
		
		
		System.out.println("3.");
		int i =1;
		while ( i <= 2) {
			int j= 1;
		    while ( j <= 3) {
		    	int k = 1;
		        while ( k <= 4) {
		            System.out.print("*");
		            k++;
		        }
		        System.out.print("!");
		        j++;
		    }
		    System.out.println();
		    i++;
		}
		System.out.println();
		
		
		
		System.out.println("4.");
		int num = 4;
		int count = 1;
		while ( count <= num ) {
		    System.out.println(num);
		    num = num / 2;
		    count ++ ;
		}
	}

}
