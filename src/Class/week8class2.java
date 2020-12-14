package Class;

public class week8class2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to our zombie killer program!!!");
		
		String backpack [] = {"Shotgun" , "Assault Rifle" , "Sniper"};
		String zombies [] = { "Close-range zombie" , "Mid-range zombie" , "Long-range zombie"};
		int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};
		int numbersZombiesNotHATE[] = {} ;
		numbersZombiesNotHATE = new int[5]; 
		numbersZombiesNotHATE[0] = 2;
		numbersZombiesNotHATE[1] = 20;
		numbersZombiesNotHATE[2] = 200;
		numbersZombiesNotHATE[3] = 2000;
		numbersZombiesNotHATE[4] = 77;
		
		System.out.println("\nBackpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);
		
		System.out.println("\nThese are the zombies!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println("\n" +numbersZombiesHATE[3]);
		System.out.println("\n" +numbersZombiesHATE[3]);
		System.out.println("\n" +numbersZombiesNotHATE[4]);

		

	}

}
