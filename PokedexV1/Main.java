package Pokedexs.PokedexV1;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Pokedex pokedex = Pokedex.getInstance();
        Scanner teclado = new Scanner(System.in);
        int option;
        while (true) 
        {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ver Pokédex");
            System.out.println("2 - Ver Equipe");
            System.out.println("3 - Encontrar Pokémon Selvagem");
            System.out.println("0 - Sair");
            option = teclado.nextInt();
            switch (option) 
            {
                case 1:
                    System.out.println("Opção 1 selecionada");
                    pokedex.verPokedex();
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada");
                    pokedex.verEquipe();
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada");
                    pokedex.encontrarPokemon();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    teclado.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println();
        }
    }
}
