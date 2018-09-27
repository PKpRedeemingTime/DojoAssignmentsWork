package objectMaster;

public class Human {
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 100;
	public void attack(Human h) {
		System.out.println("Human attack");
		h.health-=this.strength;
	}
	public void displayHealth() {
		System.out.println("Health: " + health);
	}
}
