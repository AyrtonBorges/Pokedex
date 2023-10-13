package Pokedexs.PokedexV2;

public class Pokemon {
    private int numero;
    private String nome;
    private Type tipo1, tipo2;
    private PokemonEntry pokemonEntry;

    public Pokemon(int numero, String nome, Type tipo1, Type tipo2, PokemonEntry pokemonEntry) {
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.pokemonEntry = pokemonEntry;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Type getTipo1() {
        return tipo1;
    }

    public void setTipo1(Type tipo1) {
        this.tipo1 = tipo1;
    }

    public Type getTipo2() {
        return tipo2;
    }

    public void setTipo2(Type tipo2) {
        this.tipo2 = tipo2;
    }

    public PokemonEntry getPokemonEntry() {
        return pokemonEntry;
    }

    public void setPokemonEntry(PokemonEntry pokemonEntry) {
        this.pokemonEntry = pokemonEntry;
    }
    
}
