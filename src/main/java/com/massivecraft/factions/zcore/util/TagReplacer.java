package com.massivecraft.factions.zcore.util;

/**
 * Link between config and in-game messages<br> Changes based on faction / player<br> Interfaces the config lists with
 * {} variables to plugin
 */
@Deprecated
public enum TagReplacer {

    /**
     * Fancy variables, used by f show
     */
    ALLIES_LIST(TagType.FANCY, "{allies-list}"),
    ONLINE_LIST(TagType.FANCY, "{online-list}"),
    ENEMIES_LIST(TagType.FANCY, "{enemies-list}"),
    OFFLINE_LIST(TagType.FANCY, "{offline-list}"),

    /**
     * Player variables, require a player
     */
    PLAYER_GROUP(TagType.PLAYER, "{group}"),
    LAST_SEEN(TagType.PLAYER, "{lastSeen}"),
    PLAYER_BALANCE(TagType.PLAYER, "{balance}"),
    PLAYER_POWER(TagType.PLAYER, "{player-power}"),
    PLAYER_MAXPOWER(TagType.PLAYER, "{player-maxpower}"),
    PLAYER_KILLS(TagType.PLAYER, "{player-kills}"),
    PLAYER_DEATHS(TagType.PLAYER, "{player-deaths}"),

    /**
     * Faction variables, require at least a player
     */
    HOME_X(TagType.FACTION, "{x}"),
    HOME_Y(TagType.FACTION, "{y}"),
    HOME_Z(TagType.FACTION, "{z}"),
    CHUNKS(TagType.FACTION, "{chunks}"),
    WARPS(TagType.FACTION, "{warps}"),
    HEADER(TagType.FACTION, "{header}"),
    POWER(TagType.FACTION, "{power}"),
    MAX_POWER(TagType.FACTION, "{maxPower}"),
    POWER_BOOST(TagType.FACTION, "{power-boost}"),
    LEADER(TagType.FACTION, "{leader}"),
    JOINING(TagType.FACTION, "{joining}"),
    FACTION(TagType.FACTION, "{faction}"),
    PLAYER_NAME(TagType.FACTION, "{name}"),
    HOME_WORLD(TagType.FACTION, "{world}"),
    RAIDABLE(TagType.FACTION, "{raidable}"),
    PEACEFUL(TagType.FACTION, "{peaceful}"),
    PERMANENT(TagType.FACTION, "permanent"), // no braces needed
    TIME_LEFT(TagType.FACTION, "{time-left}"),
    LAND_VALUE(TagType.FACTION, "{land-value}"),
    DESCRIPTION(TagType.FACTION, "{description}"),
    CREATE_DATE(TagType.FACTION, "{create-date}"),
    LAND_REFUND(TagType.FACTION, "{land-refund}"),
    BANK_BALANCE(TagType.FACTION, "{faction-balance}"),
    ALLIES_COUNT(TagType.FACTION, "{allies}"),
    ENEMIES_COUNT(TagType.FACTION, "{enemies}"),
    ONLINE_COUNT(TagType.FACTION, "{online}"),
    OFFLINE_COUNT(TagType.FACTION, "{offline}"),
    FACTION_SIZE(TagType.FACTION, "{members}"),
    FACTION_KILLS(TagType.FACTION, "{faction-kills}"),
    FACTION_DEATHS(TagType.FACTION, "{faction-deaths}"),

    /**
     * General variables, require no faction or player
     */
    MAX_WARPS(TagType.GENERAL, "{max-warps}"),
    MAX_ALLIES(TagType.GENERAL, "{max-allies}"),
    MAX_ENEMIES(TagType.GENERAL, "{max-enemies}"),
    FACTIONLESS(TagType.GENERAL, "{factionless}"),
    TOTAL_ONLINE(TagType.GENERAL, "{total-online}");

    private TagType type;
    private String tag;

    protected enum TagType {
        FANCY(0), PLAYER(1), FACTION(2), GENERAL(3);
        public int id;

        TagType(int id) {
            this.id = id;
        }
    }

    TagReplacer(TagType type, String tag) {
        this.type = type;
        this.tag = tag;
    }

    /**
     * @param original raw line with variables
     * @param value    what to replace var in raw line with
     *
     * @return the string with the new value
     */
    public String replace(String original, String value) {
        return original.replace(tag, value);
    }

    /**
     * @param toSearch raw line with variables
     *
     * @return if the raw line contains this enums variable
     */
    public boolean contains(String toSearch) {
        return toSearch.contains(tag);
    }

    /**
     * Gets the tag associated with this enum that we should replace
     *
     * @return the {....} variable that is located in config
     */
    public String getTag() {
        return this.tag;
    }
}
