package Pokedexs.PokedexV2;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private static Party party;

    private List<Pokemon> pokemons = new ArrayList<Pokemon>();

    private Party() {}
    public static Party getInstance()
    {
        if(party == null)
            party = new Party();
        return party;
    }

    public boolean estaCheia()
    {
        if(pokemons.size() < 6)
            return false;
        else
            return true;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public Pokemon getPokemon(int numero) {
        return pokemons.get(numero);
    }

    public boolean inserirPokemon(Pokemon pokemons) {
        if(this.pokemons.size() < 6)
        {
            this.pokemons.add(pokemons);
            return true;
        }
        else
            System.out.println("Sua party está cheia!");
        return false;
    }

    public void removerPokemon(int numero) {
        if(this.pokemons.size() > 0)
            this.pokemons.remove(numero);
        else
            System.out.println("Sua party está vazia!");
    }
    
}
