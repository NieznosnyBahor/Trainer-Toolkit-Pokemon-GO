/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import maintenance.Konsola;

/**
 *
 * @author NB
 */
public abstract class Database implements InterfaceCandies, InterfaceCP {

//    
//    
//   Pola, zmienne i stałe:
//    
//  
    public static int NUMBER_OF_POKEMON;
    public static final Map<Double, Double> levelMultiplier = new HashMap<Double, Double>();
    public static ArrayList<Pokemon> pokemonList;
    public static ArrayList<AttackFast> attackFastList;
    public static ArrayList<AttackCharge> attackChargeList;
    public static Map<String, AttackFast> mapAttackFast = new HashMap<String, AttackFast>();
    public static Map<String, AttackCharge> mapAttackCharge = new HashMap<String, AttackCharge>();
    
    private static void test()
    {
//        System.out.println(InterfaceCP.countCP(NUMBER_OF_POKEMON, NUMBER_OF_POKEMON, NUMBER_OF_POKEMON, NUMBER_OF_POKEMON, NUMBER_OF_POKEMON));
//        System.out.println(levelMultiplier.get(2.0));
//        System.out.println(InterfaceCP.countCP(270, 228, 205, 15, 11, 15, 35.0));
    }
    
    public static void load() {
        Konsola.print("Load procedure has been started.");
        loadNumberOfPokemon();      // +
        createPokemonList();        // +
        loadPokemonNumbers();       // +
        loadPokemonNames();         // +
        loadPokemonStats();         // +
        loadPokemonTypes();         // -
        loadPokemonAttacks();       // -
        loadLevelMultipliers();     // +
        test();
        Konsola.print("Load procedure has been ended.");
    }
//    
//    
//   Metody i funkcje do ładowania:
//    
//    

    private static void loadNumberOfPokemon() {
        Konsola.print("Load Number of Pokemon procedure has been started.");
        int x = 0;
        InputStream stream = Database.class.getResourceAsStream("/sourcefiles/PokemonStats");
        Scanner sc = new Scanner(stream);
        while (sc.hasNextLine()) {
            x++;
            sc.nextLine();
        }
        NUMBER_OF_POKEMON = x;
        sc.close();
        Konsola.print("Load Number of Pokemon procedure has been ended.");
        
    }

    private static void createPokemonList() {
        pokemonList = new ArrayList<Pokemon>();
        for (int i = 0; i < NUMBER_OF_POKEMON; i++) {
            pokemonList.add(new Pokemon(i));
        }

    }

    private static void loadPokemonNumbers() {
        Konsola.print("Load Pokemon Numbers procedure has been started.");
        
        InputStream stream = Database.class.getResourceAsStream("/sourcefiles/PokemonNumbers");
        Scanner sc = new Scanner(stream);
        int numberOfLine = 0;
        while (sc.hasNextLine()) {
            String parts[] = sc.nextLine().split("\t"); // 0-id 1-number
            pokemonList.get(numberOfLine).setNumber(Integer.parseInt(parts[1]));
            numberOfLine++;
        }
        sc.close();
        Konsola.print("Load Pokemon Numbers procedure has been ended.");
        
    }

    private static void loadPokemonNames() {
        Konsola.print("Load Pokemon Names procedure has been started.");
        InputStream stream = Database.class.getResourceAsStream("/sourcefiles/PokemonNames");
        Scanner sc = new Scanner(stream);
        int numberOfLine = 0;
        while (sc.hasNextLine()) {
            String parts[] = sc.nextLine().split("\t"); // 0-id 1-name
            pokemonList.get(numberOfLine).setName(parts[1]);
            numberOfLine++;
        }
        sc.close();
        Konsola.print("Load Pokemon Names procedure has been ended.");
        
    }

    private static void loadPokemonStats() {
        Konsola.print("Load pokemon stats procedure has been started.");
        InputStream stream = Database.class.getResourceAsStream("/sourcefiles/PokemonStats");
        Scanner sc = new Scanner(stream);
        int numberOfLine = 0;
        while (sc.hasNextLine()) {
            String parts[] = sc.nextLine().split("\t"); // 0-id 1-hp 2-att 3-def
            pokemonList.get(numberOfLine).setStat_sta(Integer.parseInt(parts[1]));
            pokemonList.get(numberOfLine).setStat_att(Integer.parseInt(parts[2]));
            pokemonList.get(numberOfLine).setStat_def(Integer.parseInt(parts[3]));

            numberOfLine++;
        }
        sc.close();
        Konsola.print("Load pokemon stats procedure has been ended.");
    }

    private static void loadPokemonTypes() {
    }

    private static void loadPokemonAttacks() {
    }

    private static void loadLevelMultipliers() {
        Konsola.print("Load Level multipliers procedure has been started.");
        InputStream stream = Database.class.getResourceAsStream("/sourcefiles/LevelMultipliers");
        Scanner sc = new Scanner(stream);
        int numberOfLine = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String parts[] = line.split("\t");
            levelMultiplier.put(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
        }
        sc.close();
        Konsola.print("Load Level multipliers procedure has been ended.");
    }

}
