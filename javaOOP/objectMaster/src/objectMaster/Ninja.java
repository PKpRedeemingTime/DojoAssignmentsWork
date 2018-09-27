package objectMaster;

public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;
	}
	public void steal(Human h) {
		System.out.println("Ninja steal");
		h.health-=this.stealth;
		this.health+=this.stealth;
		h.displayHealth();
		this.displayHealth();
	}
	public void runAway() {
		System.out.println("Ninja run away");
		this.health-=10;
		this.displayHealth();
	}
}
