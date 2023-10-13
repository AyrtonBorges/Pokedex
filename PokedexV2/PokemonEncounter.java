package Pokedexs.PokedexV2;

import java.util.Random;

public class PokemonEncounter {
    Pokemon pokemon;
    private Random random = new Random();

    public PokemonEncounter(Pokemon pokemon) 
    {
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void capturar()
    {
        PokemonEntry pokemonEntry = pokemon.getPokemonEntry();
        if(random.nextInt(2) == 1)
        {
            pokemonEntry.setCapturado();
            pokemon.setPokemonEntry(pokemonEntry);
            System.out.println("Capturado!");
        }
        else
        {
            pokemon.setPokemonEntry(new PokemonEntry("Sem informação", 0, 0, "Sem informação"));
            System.out.println("Escapou!");
        }
    }

    public void fugir()
    {
        System.out.println("Você fugiu!");
    }

}
