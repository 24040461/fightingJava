
public class Fighters {
	String name;
	int power;
	int light;
	int movement;
	int stamina;
	int defence;
	int health;
	
	public Fighters(String Name, int Power,int Light,int Movement,int Stamina,int Defence,int Health) {
		name = Name;
		power = Power;
		light = Light;
		movement = Movement;
		stamina = Stamina;
		defence = Defence;
		health = Health;
	}
	
	void powershot(int fighter1Pow,int fighter2Pow, int fighter1Health, int fighter2Health) throws InterruptedException {
		if(fighter1Pow > fighter2Pow) {
			fighter2Health -= 5;
			Thread.sleep(500);
			System.out.println("Player one landed a power shot, 'That was outragous': Player 2 HP " + fighter2Health + " /100");
			
			
		} else {
			fighter1Health -= 5;
			Thread.sleep(500);
			System.out.println("Player Two was to powerful for the shot, 'Simply Simply Lovely': Player 1 HP " + fighter1Health + " /100");
		}
	}
	void lightshot(int fighter1Light , int fighter2Light, int fighter1Health , int fighter2Health) throws InterruptedException {
		if(fighter1Light > fighter2Light) {
			fighter2Health -= 5;
			Thread.sleep(2000);
			System.out.println("Player one landed a light shot: Player 2 HP " + fighter2Health + " /100");
			
		} else {
			fighter1Health -= 5;
			Thread.sleep(2000);
			System.out.println("Player Two was to quick for the shot: Player 1 HP " + fighter1Health + " /100");
		
		}
		
	}
	void block(int fighter1Block, int fighter2Block, int fighter1Health, int fighter2Health) throws InterruptedException {
		if(fighter1Block > fighter2Block) {
			fighter2Health -= 5;
			Thread.sleep(2000);
			System.out.println("Player one blocked the shot: Player 2 HP" + fighter1Health + " /100");
		} else {
			fighter1Health -= 5;
			Thread.sleep(2000);
			System.out.println("Player Two went through the shot: Player 1 HP " + fighter1Health + " /100");
		}
	}

}
