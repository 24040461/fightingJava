import java.util.Scanner;

public class Main {

	
	
	static void restart() throws InterruptedException{
	Scanner scan = new Scanner(System.in);
	Fighters AJ = new Fighters("Antony Joshua",9,4,4,7,8,100);
	Fighters Tyson = new Fighters("Tyson Fury",8,9,9,7,7,100);

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
		
		AJ.powershot(AJ.power,   Tyson.power,  AJ.health, Tyson.health);
		AJ.lightshot(AJ.light,   Tyson.light,  AJ.health, Tyson.health);
		AJ.block(    AJ.defence, Tyson.defence,AJ.health, Tyson.health);
		AJ.powershot(AJ.power,   Tyson.power,  AJ.health, Tyson.health);
	} 
	if(userFighter == 2 && userFighter2 == 1) {
		System.out.println("###################################################################");
		System.out.println("The boxing fight is: Player 1: Tyson Fury V Player 2: Antony Joshua");
		System.out.println("###################################################################");
		
		Tyson.powershot(Tyson.power,   AJ.power,   Tyson.health,   Tyson.health);
		Tyson.lightshot(Tyson.light,   AJ.light,   Tyson.health,   Tyson.health);
		Tyson.block(    Tyson.defence, AJ.defence, Tyson.health,   Tyson.health);
		Tyson.powershot(Tyson.power,   AJ.power,   Tyson.health,   Tyson.health);
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

