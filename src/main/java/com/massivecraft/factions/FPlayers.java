package com.massivecraft.factions;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.massivecraft.factions.fake.FakeFPlayers;

import java.util.Collection;

@Deprecated
public abstract class FPlayers {

	protected static FPlayers fakeFPlayers = new FakeFPlayers();
    public static FPlayers getInstance() { return fakeFPlayers; }

    public abstract void clean();

    public abstract Collection<FPlayer> getOnlinePlayers();

    public abstract FPlayer getByPlayer(Player player);

    public abstract Collection<FPlayer> getAllFPlayers();

    public abstract void forceSave();

    public abstract void forceSave(boolean sync);

    public abstract FPlayer getByOfflinePlayer(OfflinePlayer player);

    public abstract FPlayer getById(String string);

    public abstract void load();
    
}
