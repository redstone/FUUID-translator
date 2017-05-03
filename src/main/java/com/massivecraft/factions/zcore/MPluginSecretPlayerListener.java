package com.massivecraft.factions.zcore;

import com.massivecraft.factions.FPlayers;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerLoginEvent;

@Deprecated
public class MPluginSecretPlayerListener implements Listener {

    private MPlugin p;

    public MPluginSecretPlayerListener(MPlugin p) {
        this.p = p;
    }


}
