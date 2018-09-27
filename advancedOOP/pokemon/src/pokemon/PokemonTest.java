package pokemon;

public class PokemonTest {
	
	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("Pikachu", 100, "electric");
		Pokemon charmander = new Pokemon("Charmander", 120, "fire");
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 120, "grass");
		
		System.out.println(pikachu.getName());
		System.out.println(charmander.getHealth());
		System.out.println(bulbasaur.getType());
		
		Pokedex pokedex = new Pokedex();
		Pokemon squirtle = pokedex.createPokemon("Squirtle", 120, "water");
		pokedex.attackPokemon(squirtle);
		System.out.println(pokedex.pokemonInfo(squirtle));
		pikachu.getCount();
	}

}
