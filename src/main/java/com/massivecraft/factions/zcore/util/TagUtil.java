package com.massivecraft.factions.zcore.util;


import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.Faction;

@Deprecated
public class TagUtil {


    /**
     * Replaces all variables in a plain raw line for a faction
     *
     * @param faction for faction
     * @param line    raw line from config with variables to replace for
     *
     * @return clean line
     */
    public static String parsePlain(Faction faction, String line) {

        return line;
    }

    /**
     * Replaces all variables in a plain raw line for a player
     *
     * @param fplayer for player
     * @param line    raw line from config with variables to replace for
     *
     * @return clean line
     */
    public static String parsePlain(FPlayer fplayer, String line) {

        return line;
    }

    /**
     * Replaces all variables in a plain raw line for a faction, using relations from fplayer
     *
     * @param faction for faction
     * @param fplayer from player
     * @param line    raw line from config with variables to replace for
     *
     * @return clean line
     */
    public static String parsePlain(Faction faction, FPlayer fplayer, String line) {

        return line;
    }


    /**
     * Checks if a line has fancy variables
     *
     * @param line raw line from config with variables
     *
     * @return if the line has fancy variables
     */
    public static boolean hasFancy(String line) {
        return false;
    }

}
