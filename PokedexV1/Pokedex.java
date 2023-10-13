package Pokedexs.PokedexV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pokedex 
{
    private static Pokedex pokedex;
    private List<String> pokemons = Arrays.asList("Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Eevee", "Jigglypuff", "Snorlax", "Mewtwo", "Chikorita", "Cyndaquil", "Totodile", "Togepi", "Marill", "Hoothoot", "Lugia", "Ho-Oh", "Raikou", "Entei", "Suicune", "Treecko", "Torchic", "Mudkip", "Rayquaza", "Groudon", "Kyogre");
    private List<String> categorias = Arrays.asList("Semente", "Lagarto", "Tartaruga", "Rato", "Evolução", "Fada", "Dorminhoco", "Genético", "Folha", "Fogo", "Água", "Fada", "Aquático", "Noturno", "Lendário", "Lendário", "Lendário", "Lendário", "Lendário", "Folha", "Fogo", "Água", "Lendário", "Lendário", "Lendário");
    private List<Double> pesos = Arrays.asList(6.9, 8.5, 9.0, 6.0, 6.5, 5.5, 460.0, 122.0, 6.4, 7.9, 9.5, 1.5, 8.5, 21.2, 216.0, 199.0, 178.0, 198.0, 187.0, 5.0, 8.5, 7.6, 206.5, 950.0, 352.0);
    private List<Double> alturas = Arrays.asList(0.7, 0.6, 0.5, 0.4, 0.3, 0.5, 2.1, 2.0, 0.9, 0.9, 0.6, 0.3, 0.4, 0.7, 5.2, 3.8, 1.9, 2.0, 2.0, 0.5, 0.6, 0.4, 7.0, 3.5, 3.5);
    private List<String> descricoes = Arrays.asList("Bulbasaur pode ser visto cochilando sob a luz do sol. Há uma semente em suas costas que cresce gradualmente maior.", "Charmander prefere lugares quentes. Quando chove, diz-se que o vapor jorra da ponta da cauda.", "Squirtle é um Pokémon que parece uma pequena tartaruga. Sua concha cresce mais dura à medida que envelhece.", "Pikachu, um dos Pokémon mais populares, é conhecido por ser o mais fiel companheiro de Ash Ketchum.", "Eevee é um Pokémon com muitas possibilidades evolutivas. Ele se adapta facilmente a qualquer ambiente.", "Jigglypuff tem uma voz que pode colocar qualquer pessoa para dormir. Seu canto é tão eficaz que pode fazer seu ouvinte dormir em segundos.", "Snorlax é um Pokémon muito forte e pesado. Ele pode bloquear caminhos inteiros sem se mover.", "Mewtwo é um Pokémon criado por manipulação genética. No entanto, apesar das aparências, ele é capaz de sentir emoções humanas.", "Chikorita é um Pokémon muito amigável e carinhoso. Ele gosta de se aconchegar com seu treinador.", "Cyndaquil é um Pokémon com um fogo ardente dentro de seu corpo. Ele pode inflamar suas costas e atacar seus inimigos.", "Totodile é um Pokémon muito forte e ágil. Ele pode morder seus inimigos com suas mandíbulas poderosas.", "Togepi é um Pokémon muito pequeno e adorável. Ele pode usar sua habilidade de Charme para acalmar seus inimigos.", "Marill é um Pokémon muito amigável e carinhoso. Ele gosta de se aconchegar com seu treinador.", "Hoothoot é um Pokémon muito inteligente. Ele pode girar sua cabeça 360 graus sem mover seu corpo.", "Lugia é um Pokémon lendário que pode controlar o vento. Ele é muito poderoso e raramente é visto por humanos.", "Ho-Oh é um Pokémon lendário que pode controlar o fogo. Ele é muito poderoso e raramente é visto por humanos.", "Raikou é um Pokémon lendário que pode controlar o trovão. Ele é muito poderoso e raramente é visto por humanos.", "Entei é um Pokémon lendário que pode controlar o fogo. Ele é muito poderoso e raramente é visto por humanos.", "Suicune é um Pokémon lendário que pode controlar a água. Ele é muito poderoso e raramente é visto por humanos.", "Treecko é um Pokémon muito ágil e rápido. Ele pode escalar paredes e árvores com facilidade.", "Torchic é um Pokémon com um fogo ardente dentro de seu corpo. Ele pode inflamar suas costas e atacar seus inimigos.", "Mudkip é um Pokémon muito forte e ágil. Ele pode morder seus inimigos com suas mandíbulas poderosas.", "Rayquaza é um Pokémon lendário que pode controlar o ar. Ele é muito poderoso e raramente é visto por humanos.", "Groudon é um Pokémon lendário que pode controlar a terra. Ele é muito poderoso e raramente é visto por humanos.", "Kyogre é um Pokémon lendário que pode controlar a água. Ele é muito poderoso e raramente é visto por humanos.");
    
    private List<String> registroNaoCapturado = new ArrayList<String>(25); // Pensei na possibilidade de usar números também
    private List<String> registroCapturado = new ArrayList<String>(25); // Nesse aqui também
    private String[] equipe = new String[6];

    private Random gerador = new Random();
    private Scanner teclado = new Scanner(System.in);

    private Pokedex() {}
    public static Pokedex getInstance()
    {
        if(pokedex == null)
            pokedex = new Pokedex();
        return pokedex;
    }

    public void verPokedex()
    {
        System.out.println("Número\t\tPokémon\t\tCategoria\t\tPeso\t\tAltura\t\tDescrição");
        for(int i = 0; i < pokemons.size(); i++)
        {
            for(int y = 0; y < registroCapturado.size(); y++)
            {
                if(registroCapturado.get(y) == pokemons.get(i))
                {
                    System.out.println(i+"\t\t"+pokemons.get(i)+"\t\t"+categorias.get(i)+"\t\t"+pesos.get(i)+"\t\t"+alturas.get(i)+"\t\t"+descricoes.get(i));
                }
            }
            for(int y = 0; y < registroNaoCapturado.size(); y++)
            {
                if(registroNaoCapturado.get(y) == pokemons.get(i))
                {
                    System.out.println(i+"\t\t"+pokemons.get(i)+"\t\t");
                }
            }
        }
        System.out.println();
    }
    public void verEquipe()
    {
        System.out.println("Número\t\tPokémon\t\tCategoria\t\tPeso\t\tAltura\t\tDescrição");
        for(int i = 0; i < equipe.length; i++)
        {
            for(int y = 0; y < pokemons.size(); y++)
            {
                if(equipe[i] == pokemons.get(y))
                {
                    System.out.println(i+"\t\t"+pokemons.get(y)+"\t\t"+categorias.get(y)+"\t\t"+pesos.get(y)+"\t\t"+alturas.get(y)+"\t\t"+descricoes.get(y));
                }
            }
        }
        System.out.println();
    }

    private void adicionarEquipe(int numero)
    {
        System.out.println("Seus pokemons atuais são:");
        for(int i = 0; i < equipe.length; i++)
        {
            if(equipe[i] != null)
            {
                System.out.println(i+" - "+equipe[i]);
            }
        }
        while(true)
        {
            System.out.println("Escolha um número de 0 a 5 para adicionar o "+pokemons.get(numero)+" à sua equipe");
            int option = teclado.nextInt();
            if(equipe[option] == null)
            {
                equipe[option] = pokemons.get(numero);
                System.out.println("Você adicionou o "+pokemons.get(numero)+" à sua equipe");
                break;
            }else
            {
                System.out.println("Você já tem um Pokémon nessa posição");
            }
        }
    }

    private void capturarPokemon(int numero)
    {
        System.out.println("Você capturou um "+pokemons.get(numero)+"!");
        if(registroNaoCapturado.indexOf(pokemons.get(numero)) > -1)
        {
            registroNaoCapturado.remove(pokemons.get(numero));
            registroCapturado.add(pokemons.get(numero));
        }else if(registroCapturado.indexOf(pokemons.get(numero)) == -1)
            registroCapturado.add(pokemons.get(numero));
        System.out.println("Deseja adicioná-lo à sua equipe?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int option = teclado.nextInt();
        switch(option)
        {
            case 1:
                adicionarEquipe(numero);
                break;
            case 2:
                System.out.println("Você não adicionou o "+pokemons.get(numero)+" à sua equipe");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
    }
    public void encontrarPokemon()
    {
        int numero = gerador.nextInt(25);
        System.out.println("Um "+pokemons.get(numero)+" selvagem apareceu!");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Capturar");
        System.out.println("2 - Fugir");
        
        int option = teclado.nextInt();
        switch(option)
        {
            case 1:
                capturarPokemon(numero);
                break;
            case 2:
                System.out.println("Você fugiu!");
                if(registroNaoCapturado.indexOf(pokemons.get(numero)) == -1)
                {
                    registroNaoCapturado.add(pokemons.get(numero));
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
