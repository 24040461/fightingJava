
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
	


	void powershot(Fighters fighter2) throws InterruptedException {
		

		
		if(this.power > fighter2.power) {
			fighter2.health -= 5;
			
			System.out.println("\n");
			System.out.println(this.name + " landed a power shot, 'That was outragous': " + fighter2.name + " HP " + fighter2.health + " /100");
			int min = 1;
			int max = 10;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
			fighter2.power = random_int;
			this.power = random_int2;
			if(this.health <= 0){
				System.out.println("\n");
				System.out.println(this.name + " has been knocked out!!!!");
			}
			
		} else {
			
			this.health -= 5;
			
			System.out.println("\n");
			System.out.println(fighter2.name + " was to powerful for the shot, 'Simply Simply Lovely': " + this.name +  " HP " + this.health + " /100");
			int min = 1;
			int max = 10;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
			fighter2.power = random_int;
			this.power = random_int2;
			System.out.println(this.power);
			System.out.println(fighter2.power);
			if(fighter2.health < 0){
				System.out.println("\n");
				System.out.println(fighter2.name + " has been knocked out!!!!");
			}
		}
	}
	
	
	void lightshot(Fighters fighter2) throws InterruptedException {
		if(this.light > fighter2.light) {
			fighter2.health -= 5;
			System.out.println("\n");
			System.out.println(this.name + " landed a light shot: "+ fighter2.name + " HP " + fighter2.health + " /100");
			int min = 1;
			int max = 10;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
			fighter2.light = random_int;
			this.light = random_int2;
			if(this.health <= 0){
				System.out.println("\n");
				System.out.println(this.name + " has been knocked out!!!!");
			}
		} else {
			this.health -= 5;
			
			System.out.println("\n");
			System.out.println(fighter2.name +" was to quick for the shot: Player 1 HP " + this.health + " /100");
			int min = 1;
			int max = 10;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
			fighter2.light = random_int;
			this.light = random_int2;
			if(fighter2.health < 0){
				System.out.println("\n");
				System.out.println(fighter2.name + " has been knocked out!!!!");
			}
		}
		
	}
	void block(Fighters fighter2) throws InterruptedException {
		if(this.defence > fighter2.defence) {
			fighter2.defence -= 5;
			
			System.out.println(this.name + " blocked the shot: " + fighter2.name +" HP " + this.health + " /100");
		} else {
			this.health -= 5;
			
			System.out.println(fighter2.name +" went through the shot: "+ this.name + " HP " + this.health + " /100");
		}
		
		
	}
	void move(String move, Fighters fighter2) throws InterruptedException {
		if(move.equals("powershot")) {
			this.powershot(fighter2);
			
		}
	}

}
