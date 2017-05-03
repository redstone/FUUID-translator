package com.massivecraft.factions;

import com.google.gson.GsonBuilder;
import com.massivecraft.factions.fake.FakeListener;
import com.massivecraft.factions.zcore.MPlugin;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Set;
import java.util.logging.Level;

@Deprecated
public class P extends MPlugin {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new FakeListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
    public static P p = new P();
    
    public boolean getLocked() {
        return net.redstoneore.legacyfactions.Factions.get().isLocked();
    }

    public void setLocked(boolean val) {
    	 net.redstoneore.legacyfactions.Factions.get().setLocked(val);
    }

    // Commands
    // TODO: command bridge
    //public FCmdRoot cmdBase = new FCmdRoot();
    //public CmdAutoHelp cmdAutoHelp = new CmdAutoHelp();

    @Override
    public GsonBuilder getGsonBuilder() {
    	 return net.redstoneore.legacyfactions.Factions.get().getGsonBuilder();
    }

    public void startAutoLeaveTask(boolean restartIfRunning) {
    	 net.redstoneore.legacyfactions.Factions.get().startAutoLeaveTask(restartIfRunning);
    }

    @Override
    public void postAutoSave() {
    	 net.redstoneore.legacyfactions.entity.Conf.save();
    }

    @Override
    public boolean logPlayerCommands() {
        return net.redstoneore.legacyfactions.entity.Conf.logPlayerCommands;
    }

    @Override
    public boolean handleCommand(CommandSender sender, String commandString, boolean testOnly) {
    	return net.redstoneore.legacyfactions.Factions.get().handleCommand(sender, commandString);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
    	return net.redstoneore.legacyfactions.Factions.get().onCommand(sender, command, label, split);
    }

    public int hookSupportVersion() {
        return 3;
    }

    public void handleFactionTagExternally(boolean notByFactions) {
    	 net.redstoneore.legacyfactions.entity.Conf.chatTagHandledByAnotherPlugin = notByFactions;
    }

    public boolean shouldLetFactionsHandleThisChat(AsyncPlayerChatEvent event) {
        return event != null && ( net.redstoneore.legacyfactions.Factions.get().isPlayerFactionChatting(event.getPlayer()) ||  net.redstoneore.legacyfactions.Factions.get().isFactionsCommand(event.getMessage()));
    }
    public boolean isPlayerFactionChatting(Player player) {
        return  net.redstoneore.legacyfactions.Factions.get().isPlayerFactionChatting(player);
    }

    public boolean isFactionsCommand(String check) {
        return !(check == null || check.isEmpty()) && net.redstoneore.legacyfactions.Factions.get().handleCommand(null, check, true);
    }

    public String getPlayerFactionTag(Player player) {
        return net.redstoneore.legacyfactions.Factions.get().getPlayerFactionTag(player);
    }

    public String getPlayerFactionTagRelation(Player speaker, Player listener) {
    	return net.redstoneore.legacyfactions.Factions.get().getPlayerFactionTagRelation(speaker, listener);
    }

    public String getPlayerTitle(Player player) {
    	return net.redstoneore.legacyfactions.Factions.get().getPlayerTitle(player);    
    }

    public Set<String> getFactionTags() {
    	return net.redstoneore.legacyfactions.entity.FactionColl.get().getFactionTags();
    }

    public Set<String> getPlayersInFaction(String factionTag) {
    	return  net.redstoneore.legacyfactions.Factions.get().getPlayersInFaction(factionTag);    
    }

    public Set<String> getOnlinePlayersInFaction(String factionTag) {
    	return net.redstoneore.legacyfactions.Factions.get().getOnlinePlayersInFaction(factionTag);
    }

    public boolean isHookedPlayervaults() {
        return false;
    }

    public String getPrimaryGroup(OfflinePlayer player) {
    	return null;
    }

    public void debug(Level level, String s) {
    	 net.redstoneore.legacyfactions.Factions.get().debug(level, s);
    }

    public void debug(String s) {
    	 net.redstoneore.legacyfactions.Factions.get().debug(s);
    }
    
}
