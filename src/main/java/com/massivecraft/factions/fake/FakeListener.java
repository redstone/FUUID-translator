package com.massivecraft.factions.fake;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.massivecraft.factions.event.FactionDisbandEvent;

import net.redstoneore.legacyfactions.event.EventFactionsChange;

@Deprecated
public class FakeListener implements Listener {

	@EventHandler
	public void onEventFactionsChange(EventFactionsChange event) {
		if (event.getReason() == EventFactionsChange.ChangeReason.DISBAND) {
			FactionDisbandEvent fakeEvent = new FactionDisbandEvent(event.getFPlayer().getPlayer(), event.getFactionOld().getId());
			Bukkit.getPluginManager().callEvent(fakeEvent);
			event.setCancelled(fakeEvent.isCancelled());
		}
	}
}
