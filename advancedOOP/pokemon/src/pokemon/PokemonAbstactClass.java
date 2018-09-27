package pokemon;

public abstract class PokemonAbstactClass implements PokemonInterface{
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		int health = pokemon.getHealth() - 10;
		pokemon.setHealth(health);
	}
}
