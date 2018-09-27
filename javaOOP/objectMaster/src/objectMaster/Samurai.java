package objectMaster;

public class Samurai extends Human{
	private static int samurais = 0;
	public Samurai() {
		this.health = 200;
		samurais++;
		System.out.println("There are currently " + samurais + " samurais");
	}
	public void deathBlow(Human h) {
		System.out.println("Samurai death blow");
		h.health = 0;
		this.health = this.health/2;
		h.displayHealth();
		this.displayHealth();
	}
	public void meditate() {
		System.out.println("Samurai meditate");
		this.health+=(this.health/2);
		this.displayHealth();
	}
	public static void howMany() {
		System.out.println("There are " + samurais + " samurais");
	}
}
