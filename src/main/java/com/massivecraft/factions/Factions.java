package com.massivecraft.factions;

import java.util.ArrayList;
import java.util.Set;

import com.massivecraft.factions.fake.FakeFactions;

@Deprecated
public abstract class Factions {
	
    protected static Factions fakeFactions = new FakeFactions();
    public static Factions getInstance() { return fakeFactions; }
    
    public abstract Faction getFactionById(String id);

    public abstract Faction getByTag(String str);

    public abstract Faction getBestTagMatch(String start);

    public abstract boolean isTagTaken(String str);

    public abstract boolean isValidFactionId(String id);

    public abstract Faction createFaction();

    public abstract void removeFaction(String id);

    public abstract Set<String> getFactionTags();

    public abstract ArrayList<Faction> getAllFactions();

    public abstract Faction getNone();

    public abstract Faction getWilderness();

    public abstract Faction getSafeZone();

    public abstract Faction getWarZone();

    public abstract void forceSave();

    public abstract void forceSave(boolean sync);
    
    public abstract void load();
}
