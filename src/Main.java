import java.util.Scanner;

public class Main {
	
	static int randomGood() {
		int min = 7;
		int max = 10;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}
	static int randomAverage() {
		int min = 4;
		int max = 10;
		int random_int2 = (int)Math.floor(Math.random()*(max-min)+min);
		return random_int2;
	}
	static int randomBad() {
		int min = 1;
		int max = 3;
		int random_int3 = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int3;
	}
	
	
	
	static void restart() throws InterruptedException{
	Scanner scan = new Scanner(System.in);
	Fighters AJ = new Fighters("Antony Joshua",randomGood(),randomAverage(),randomAverage(),randomBad(),randomGood(),100);
	Fighters Tyson = new Fighters("Tyson Fury",randomBad(),randomGood(),randomGood(),randomGood(),randomBad(),100);

	System.out.println("##################");
	System.out.println("  Select Fighter  ");
	System.out.println("##################");
	System.out.println("1: Antony Joshua");
	System.out.println("2: Tyson Fury");

	
	//Scanner getting user input
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println(" Player 1 Choose Fighter: ");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
	int userFighter = scan.nextInt();
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println(" Player 2 Choose Fighter: ");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
	int userFighter2 = scan.nextInt();
	
	//Showing the user input
	switch(userFighter) { 
	case 1:
		System.out.println("Player 1 Chosen Fighter: Antony Joshua");
	
	break;
	case 2:
		System.out.println("Player 1 Chosen Fighter: Tyson Fury");
		break;

	}

 
	switch(userFighter2) {
	case 1:
		System.out.println("Player 2 Chosen Fighter: Antony Joshua");
	break;
	case 2:
		System.out.println("Player 2 Chosen Fighter: Tyson Fury");
		break;

	}
	
	//IF Antony Joshua gets picked by Player 1
	if(userFighter == 1 && userFighter2 == 2 ) {
		System.out.println("###################################################################");
		System.out.println("The boxing fight is: Player 1: Antony Joshua V Player 2: Tyson Fury");
		System.out.println("###################################################################");
		
		
//		AJ.lightshot(Tyson);
		while(AJ.health > 0 && Tyson.health > 0) {
			//Scanner getting user input
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println(" Player 1 Select Fight Move: ");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("1: Powershot");
			System.out.println("2: Lightshot");
			int fightMove = scan.nextInt();
			
			//Showing the user input
			switch(fightMove) { 
			case 1:
				AJ.powershot(Tyson);
			
			break;
			case 2:
				AJ.lightshot(Tyson);
				break;

			}
			//Scanner getting user input
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println(" Player 2 Select Fight Move: ");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("1: Powershot");
			System.out.println("2: Lightshot");
			int fightMove2 = scan.nextInt();
			
			//Showing the user input
			switch(fightMove2) { 
			case 1:
				Tyson.powershot(AJ);
			
			break;
			case 2:
				Tyson.lightshot(AJ);
				break;

			}
		}
	
	} 
	if(userFighter == 2 && userFighter2 == 1) {
		System.out.println("###################################################################");
		System.out.println("The boxing fight is: Player 1: Tyson Fury V Player 2: Antony Joshua");
		System.out.println("###################################################################");
		
		while(AJ.health > 0 && Tyson.health > 0) {
			//Scanner getting user input
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println(" Player 1 Select Fight Move: ");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("1: Powershot");
			System.out.println("2: Lightshot");
			int fightMove = scan.nextInt();
			
			//Showing the user input
			switch(fightMove) { 
			case 1:
				Tyson.powershot(AJ);
			
			break;
			case 2:
				Tyson.lightshot(AJ);
				break;

			}
			//Scanner getting user input
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println(" Player 2 Select Fight Move: ");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("1: Powershot");
			System.out.println("2: Lightshot");
			int fightMove2 = scan.nextInt();
			
			//Showing the user input
			switch(fightMove2) { 
			case 1:
				AJ.powershot(Tyson);
			
			break;
			case 2:
				AJ.lightshot(Tyson);
				break;

			}
		}
	}
	
	
	
	
	
	//Close the scanner
	scan.close();
//	System.out.println("Scanner Closed");
	//System.out.println(userFighter);
	}
	
	
	public static void main(String[] args ) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		restart();
		
	}
	
	}

