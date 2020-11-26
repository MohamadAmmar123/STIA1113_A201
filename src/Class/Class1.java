package Class;

public class Class1 {

	public static void main(String[] args) {  
		
		printFor();
		printWhile();
		
	}
		
		public static void printFor() {
		
		for (int i = 0 ; i<10 ; i++) {
			System.out.println(i);
		}
		for (int i = 9 ; i>10 ; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i<10 ; i++ ) {
			for (int j= 9 ; j>0 ; j--) {
				System.out.println(i  +" " +j);
			}
		}
		
		for (int i = 0 ; i< 5 ; i++) {
			for(int j= 0 ; j<i ; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0 ; i< 6 ; i++) {
			for(int j = 5 ; j>i ; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	
		}
		
		public static void printWhile() {
			int i= 0;
			while ( i<10 ) {
				System.out.println(i);
				i++ ;
			}
			int j = 0;
			while ( j>10 ) {
				System.out.println(j);
				j-- ;
			}
			int x=0  ;
			while (x<10) {
				int y=9;
				while (y>0) {
				System.out.println(x  +" " +y);
				y--;
				}
				x++ ;
			}
			int P = 0;
			while (P< 5 ) {
				int Q = 0;
				while ( Q<P ) {
				System.out.print("*");
				Q++;
				}
				System.out.println();
			P++;
			
		}
			int R = 0;
			while (R < 6) {
				int S = 5;
				while ( S > R ) {
				System.out.print("*");
				S--;
				}
				System.out.println();
			R++;
	}
			System.out.println("\nDo While :");
            int e = 0;
            do {
                int f = 5 ;
                do {
                    System.out.print("#");
                    f--;
                }while(f >= e);
            System.out.println();
            e++;
            }while(e < 6  );
 }
}
