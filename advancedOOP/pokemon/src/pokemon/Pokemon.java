package pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getType() {
		return type;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void getCount() {
		System.out.println(count);
	}
}
