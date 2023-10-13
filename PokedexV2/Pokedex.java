package Pokedexs.PokedexV2;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private static Pokedex pokedex;
    private List<Pokemon> pokemons = new ArrayList<Pokemon>();
    private Pokedex() {}
    public static Pokedex getInstance()
    {
        if(pokedex == null)
            pokedex = new Pokedex();
        return pokedex;
    }

    public void registrarPokemon(Pokemon pokemon)
    {
        boolean existe = false;
        for(int i = 0; i < pokemons.size(); i++)
        {
            if(pokemons.get(i).getNumero() == pokemon.getNumero())
            {
                existe = true;
                if(!pokemon.getPokemonEntry().isCapturado())
                {
                    pokemons.remove(i);
                    pokemons.add(pokemon);
                }
            }
        }
        if(!existe)
            pokemons.add(pokemon);
    }

    public List<Pokemon> pegarPokemons()
    {
        if(pokemons.size() > 0)
            return pokemons;
        else
            return null;
    }

    public List<Pokemon> getAllPokemons()
    {
        return pokemons;
    }
}
