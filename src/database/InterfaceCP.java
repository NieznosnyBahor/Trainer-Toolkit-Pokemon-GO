/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author NB
 */
public interface InterfaceCP {

    public static int countCP(int base_att, int base_def, int base_sta,
            int iv_att, int iv_def, int iv_sta,
            double lvl) {
        int CP;
        double attack = base_att + iv_att;
        double defence = Math.sqrt(base_def + iv_def);
        double stamina = Math.sqrt(base_sta + iv_sta);
        double level = Math.pow(Database.levelMultiplier.get(lvl), 2);
        double s = ((attack * defence * stamina) / 10) * level;
        CP = (int) s;
        if (CP < 10) {
            CP = 10;
        }

        return CP;
    }

    public static int countCP(Pokemon pokemon, int iv_att, int iv_def, int iv_sta,
            double lvl) {
        int CP;
        double attack = pokemon.getStat_att() + iv_att;
        double defence = Math.sqrt(pokemon.getStat_def() + iv_def);
        double stamina = Math.sqrt(pokemon.getStat_sta() + iv_sta);
        double level = Math.pow(Database.levelMultiplier.get(lvl), 2);
        double s = ((attack * defence * stamina) / 10) * level;
        CP = (int) s;
        if (CP < 10) {
            CP = 10;
        }

        return CP;
    }

    public static int countCP(int id, int iv_att, int iv_def, int iv_sta,
            double lvl) {
        int CP;
        double attack = Database.pokemonList.get(id).getStat_att() + iv_att;
        double defence = Math.sqrt(Database.pokemonList.get(id).getStat_def() + iv_def);
        double stamina = Math.sqrt(Database.pokemonList.get(id).getStat_sta() + iv_sta);
        double level = Math.pow(Database.levelMultiplier.get(lvl), 2);
        double s = ((attack * defence * stamina) / 10) * level;
        CP = (int) s;
        if (CP < 10) {
            CP = 10;
        }

        return CP;
    }
}
