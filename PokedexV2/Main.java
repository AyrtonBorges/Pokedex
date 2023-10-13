package Pokedexs.PokedexV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {  
    static Pokedex pokedex = Pokedex.getInstance();
    static List<Pokemon> pokemons = new ArrayList<Pokemon>();
    static Random random = new Random(2425);
    static Scanner scanner = new Scanner(System.in);
    static Party party = Party.getInstance();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pokemons.add(new Pokemon(25, "Pikachu", new Type("Electric"), new Type("vazio"), new PokemonEntry("Mouse", 6.0, 0.4, "Pikachu is an Electric-type Pokémon.")));
        pokemons.add(new Pokemon(4, "Charmander", new Type("Fire"), new Type("vazio"), new PokemonEntry("Lizard", 8.5, 0.6, "Charmander is a Fire-type Pokémon.")));
        pokemons.add(new Pokemon(7, "Squirtle", new Type("Water"), new Type("vazio"), new PokemonEntry("Tiny Turtle", 9.0, 0.5, "Squirtle is a Water-type Pokémon.")));
        pokemons.add(new Pokemon(1, "Bulbasaur", new Type("Grass"), new Type("Poison"), new PokemonEntry("Seed", 6.9, 0.7, "Bulbasaur is a Grass/Poison-type Pokémon.")));
        pokemons.add(new Pokemon(39, "Jigglypuff", new Type("Normal"), new Type("Fairy"), new PokemonEntry("Balloon", 5.5, 0.5, "Jigglypuff is a Normal/Fairy-type Pokémon.")));
        pokemons.add(new Pokemon(74, "Geodude", new Type("Rock"), new Type("Ground"), new PokemonEntry("Rock", 20.0, 0.4, "Geodude is a Rock/Ground-type Pokémon.")));
        pokemons.add(new Pokemon(129, "Magikarp", new Type("Water"), new Type("vazio"), new PokemonEntry("Fish", 10.0, 0.9, "Magikarp is a Water-type Pokémon.")));
        pokemons.add(new Pokemon(63, "Abra", new Type("Psychic"), new Type("vazio"), new PokemonEntry("Psi", 19.5, 0.9, "Abra is a Psychic-type Pokémon.")));
        pokemons.add(new Pokemon(92, "Gastly", new Type("Ghost"), new Type("Poison"), new PokemonEntry("Gas", 0.1, 1.3, "Gastly is a Ghost/Poison-type Pokémon.")));
        pokemons.add(new Pokemon(95, "Onix", new Type("Rock"), new Type("Ground"), new PokemonEntry("Rock Snake", 210.0, 8.8, "Onix is a Rock/Ground-type Pokémon.")));
        while(true)
        {
            int opcao;
            
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Visualizar Pokédex");
            System.out.println("2 - Visualizar Equipe");
            System.out.println("3 - Encontrar Pokémon Selvagem");
            System.out.println("4 - Terminar o Jogo");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Visualizando Pokédex...");
                    visualizarPokedex();
                    break;
                case 2:
                    System.out.println("Visualizando Equipe...");
                    visualizarEquipe();
                    break;
                case 3:
                    System.out.println("Encontrando Pokémon Selvagem...");
                    encontrarPokemon();
                    break;
                case 4:
                    System.out.println("Terminando o Jogo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    public static void encontrarPokemon()
    {
        Pokemon pokemon = pokemons.get(random.nextInt(pokemons.size()));
        System.out.println("O pokemon "+pokemon.getNome()+" apareceu! Deseja capturá-lo? (S/N)");
        String resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("S")){
            PokemonEncounter pokemonEncounter = new PokemonEncounter(pokemon);
            pokemonEncounter.capturar();
            // System.out.println(pokemonEncounter.getPokemon().getPokemonEntry().getDescricao());
            pokedex.registrarPokemon(pokemonEncounter.getPokemon());
            if(pokemonEncounter.getPokemon().getPokemonEntry().isCapturado())
            {
                registrarEquipe(pokemonEncounter.getPokemon());
            }
        } else {
            pokemon.setPokemonEntry(new PokemonEntry("Sem informação", 0, 0, "Sem informação"));
            pokedex.registrarPokemon(pokemon);
            System.out.println("Você deixou o pokemon " + pokemon.getNome() + " fugir!");
        }
    }
    public static void registrarEquipe(Pokemon pokemon)
    {
        if(!party.estaCheia())
        {
            party.inserirPokemon(pokemon);
            System.out.println("O pokemon " + pokemon.getNome() + " foi adicionado à sua equipe!");
        }
        else
        {
            System.out.println("Sua equipe está cheia!");
            System.out.println("Deseja trocar algum pokemon? (S/N)");
            String resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("S"))
            {
                System.out.println("Escolha um pokemon para trocar:");
                for(int i = 0; i < party.getPokemons().size(); i++)
                {
                    System.out.println(i + " - " + party.getPokemons().get(i).getNome());
                }
                int opcao = scanner.nextInt();
                party.removerPokemon(opcao);
                party.inserirPokemon(pokemon);
            }
        }
    }
    public static void visualizarEquipe()
    {
        System.out.println("Número\t\tPokémon\t\tCategoria\t\tTipo 1\t\tTipo 2\t\tPeso\t\tAltura\t\tDescrição");
        if(party.getPokemons().size() > 0)
            for(int i = 0; i < party.getPokemons().size(); i++)
            {
                System.out.println(i + "\t\t" + party.getPokemons().get(i).getNome() + "\t\t" + party.getPokemons().get(i).getPokemonEntry().getCategoria() + "\t\t" + party.getPokemons().get(i).getTipo1().getNome() + "\t\t" + party.getPokemons().get(i).getTipo2().getNome() + "\t\t" + party.getPokemons().get(i).getPokemonEntry().getPeso() + "\t\t" + party.getPokemons().get(i).getPokemonEntry().getAltura() + "\t\t" + party.getPokemons().get(i).getPokemonEntry().getDescricao());
            }
    }
    public static void visualizarPokedex()
    {
        System.out.println("Número\t\tPokémon\t\tCategoria\t\tTipo 1\t\tTipo 2\t\tPeso\t\tAltura\t\tDescrição");
        if(pokedex.getAllPokemons().size() > 0)
            for(Pokemon p : pokedex.getAllPokemons())
            {
                System.out.println(p.getNumero() + "\t\t" + p.getNome() + "\t\t" + p.getPokemonEntry().getCategoria() + "\t\t" + p.getTipo1().getNome() + "\t\t" + p.getTipo2().getNome() + "\t\t" + p.getPokemonEntry().getPeso() + "\t\t" + p.getPokemonEntry().getAltura() + "\t\t" + p.getPokemonEntry().getDescricao());
            }
    }
}
