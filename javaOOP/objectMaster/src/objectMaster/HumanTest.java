package objectMaster;

public class HumanTest {

	public static void main(String[] args) {
		Human fred = new Human();
		Human ted = new Human();
		fred.attack(ted);
		ted.displayHealth();
		fred.displayHealth();
		Ninja snakeEyes = new Ninja();
		Wizard gandalf = new Wizard();
		Samurai hanzo = new Samurai();
		Samurai takamori = new Samurai();
		snakeEyes.steal(hanzo);
		snakeEyes.runAway();
		gandalf.heal(hanzo);
		gandalf.fireball(takamori);
		hanzo.deathBlow(snakeEyes);
		takamori.meditate();
		takamori.howMany();
	}

}
