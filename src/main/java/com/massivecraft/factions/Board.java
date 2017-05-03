package com.massivecraft.factions;

import com.massivecraft.factions.fake.FakeBoard;

import java.util.ArrayList;
import java.util.Set;


@Deprecated
public abstract class Board {
	
    protected static Board fakeBoard = new FakeBoard();
    public static Board getInstance() { return fakeBoard; }
    
    public abstract String getIdAt(FLocation flocation);
    
    public abstract Faction getFactionAt(FLocation flocation);

    public abstract void setIdAt(String id, FLocation flocation);

    public abstract void setFactionAt(Faction faction, FLocation flocation);

    public abstract void removeAt(FLocation flocation);

    public abstract Set<FLocation> getAllClaims(String factionId);

    public abstract Set<FLocation> getAllClaims(Faction faction);

    public abstract void clearOwnershipAt(FLocation flocation);

    public abstract void unclaimAll(String factionId);

    public abstract boolean isBorderLocation(FLocation flocation);

    public abstract boolean isConnectedLocation(FLocation flocation, Faction faction);

    public abstract boolean hasFactionWithin(FLocation flocation, Faction faction, int radius);

    public abstract void clean();

    public abstract int getFactionCoordCount(String factionId);

    public abstract int getFactionCoordCount(Faction faction);

    public abstract int getFactionCoordCountInWorld(Faction faction, String worldName);

    public abstract ArrayList<String> getMap(Faction faction, FLocation flocation, double inDegrees);

    public abstract void forceSave();

    public abstract void forceSave(boolean sync);

    public abstract boolean load();
    
}
