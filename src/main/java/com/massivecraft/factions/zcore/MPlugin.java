package com.massivecraft.factions.zcore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.massivecraft.factions.zcore.util.PermUtil;
import com.massivecraft.factions.zcore.util.Persist;
import com.massivecraft.factions.zcore.util.TextUtil;

import net.redstoneore.legacyfactions.Factions;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;

@Deprecated
public abstract class MPlugin extends JavaPlugin {

    // Some utils
    public Persist persist;
    public TextUtil txt;
    public PermUtil perm;

    // Persist related
    public Gson gson;
    protected boolean loadSuccessful = false;

    public boolean getAutoSave() {
        return Factions.get().getAutoSave();
    }

    public void setAutoSave(boolean val) {
    	Factions.get().setAutoSave(val);
    }

    public String refCommand = "";


    // Our stored base commands
    //private List<MCommand<?>> baseCommands = new ArrayList<MCommand<?>>();

    // TODO: getBaseCommands
    //public List<MCommand<?>> getBaseCommands() {
    //    return this.baseCommands;
    //}

    @Deprecated
    public Map<UUID, Integer> stuckMap = new HashMap<UUID, Integer>();

    // -------------------------------------------- //
    // ENABLE
    // -------------------------------------------- //
    
    public boolean preEnable() {
    	return true;
    }

    public void postEnable() { }

    public void loadLang() { }

    public void onDisable() { }

    public void suicide() {  }

    public GsonBuilder getGsonBuilder() {
        return new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().serializeNulls().excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.VOLATILE);
    }

    // -------------------------------------------- //
    // LANG AND TAGS
    // -------------------------------------------- //

    // These are not supposed to be used directly.
    // They are loaded and used through the TextUtil instance for the plugin.
    public Map<String, String> rawTags = new LinkedHashMap<String, String>();

    public void addRawTags() {
        this.rawTags.put("l", "<green>"); // logo
        this.rawTags.put("a", "<gold>"); // art
        this.rawTags.put("n", "<silver>"); // notice
        this.rawTags.put("i", "<yellow>"); // info
        this.rawTags.put("g", "<lime>"); // good
        this.rawTags.put("b", "<rose>"); // bad
        this.rawTags.put("h", "<pink>"); // highligh
        this.rawTags.put("c", "<aqua>"); // command
        this.rawTags.put("p", "<teal>"); // parameter
    }

    public void initTXT() {


    }

    // -------------------------------------------- //
    // COMMAND HANDLING
    // -------------------------------------------- //

    // can be overridden by P method, to provide option
    public boolean logPlayerCommands() {
        return Factions.get().logPlayerCommands();
    }

    public boolean handleCommand(CommandSender sender, String commandString, boolean testOnly) {
    	return net.redstoneore.legacyfactions.Factions.get().handleCommand(sender, commandString, testOnly);
    }

    public boolean handleCommand(final CommandSender sender, String commandString, boolean testOnly, boolean async) {
    	return net.redstoneore.legacyfactions.Factions.get().handleCommand(sender, commandString, testOnly, async);

    }

    public boolean handleCommand(CommandSender sender, String commandString) {
    	return net.redstoneore.legacyfactions.Factions.get().handleCommand(sender, commandString);
    }

    public void preAutoSave() {

    }

    public void postAutoSave() {

    }

    public Map<UUID, Integer> getStuckMap() {
    	return net.redstoneore.legacyfactions.Factions.get().getStuckMap();
    }

    public Map<UUID, Long> getTimers() {
    	return net.redstoneore.legacyfactions.Factions.get().getTimers();
    }
    
    public void log(Object msg) {
        log(Level.INFO, msg);
    }

    public void log(String str, Object... args) {
        log(Level.INFO, this.txt.parse(str, args));
    }

    public void log(Level level, String str, Object... args) {
        log(level, this.txt.parse(str, args));
    }

    public void log(Level level, Object msg) {
        Bukkit.getLogger().log(level, "[FUUID-translator] " + msg);
    }
    
}
