package pokemon;

public class Pokedex extends PokemonAbstactClass{

	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType();
	}
}
