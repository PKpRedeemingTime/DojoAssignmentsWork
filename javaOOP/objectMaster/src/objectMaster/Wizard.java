package objectMaster;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human h) {
		System.out.println("Wizard heal");
		h.health+=this.intelligence;
		h.displayHealth();
	}
	public void fireball(Human h) {
		System.out.println("Wizard fireball");
		h.health-=(this.intelligence*3);
		h.displayHealth();
	}
}
