package com.massivecraft.factions.fake;

import java.util.ArrayList;
import java.util.Set;

import com.massivecraft.factions.Board;
import com.massivecraft.factions.FLocation;
import com.massivecraft.factions.Faction;

@Deprecated
public class FakeBoard extends Board {

	@Override
	public String getIdAt(FLocation flocation) {
		return net.redstoneore.legacyfactions.entity.Board.get().getIdAt(flocation.toNewFLocation());
	}

	@Override
	public Faction getFactionAt(FLocation flocation) {
		return com.massivecraft.factions.Factions.getInstance().getFactionById(net.redstoneore.legacyfactions.entity.Board.get().getIdAt(flocation.toNewFLocation()));
	}

	@Override
	public void setIdAt(String id, FLocation flocation) {
		net.redstoneore.legacyfactions.entity.Board.get().setIdAt(id, flocation.toNewFLocation());
	}

	@Override
	public void setFactionAt(Faction faction, FLocation flocation) {
		net.redstoneore.legacyfactions.entity.Board.get().setFactionAt(faction.toNewFaction(), flocation.toNewFLocation());

	}

	@Override
	public void removeAt(FLocation flocation) {
		net.redstoneore.legacyfactions.entity.Board.get().removeAt(flocation.toNewFLocation());
	}

	@Override
	public Set<FLocation> getAllClaims(String factionId) {
		return FLocation.toOldSetLocation(net.redstoneore.legacyfactions.entity.Board.get().getAllClaims(factionId));
	}

	@Override
	public Set<FLocation> getAllClaims(Faction faction) {
		return FLocation.toOldSetLocation(net.redstoneore.legacyfactions.entity.Board.get().getAllClaims(faction.toNewFaction()));
	}

	@Override
	public void clearOwnershipAt(FLocation flocation) {
		net.redstoneore.legacyfactions.entity.Board.get().clearOwnershipAt(flocation.toNewFLocation());
	}

	@Override
	public void unclaimAll(String factionId) {
		net.redstoneore.legacyfactions.entity.Board.get().unclaimAll(factionId);
	}

	@Override
	public boolean isBorderLocation(FLocation flocation) {
		return net.redstoneore.legacyfactions.entity.Board.get().isBorderLocation(flocation.toNewFLocation());
	}

	@Override
	public boolean isConnectedLocation(FLocation flocation, Faction faction) {
		return net.redstoneore.legacyfactions.entity.Board.get().isConnectedLocation(flocation.toNewFLocation(), faction.toNewFaction());
	}

	@Override
	public boolean hasFactionWithin(FLocation flocation, Faction faction, int radius) {
		return net.redstoneore.legacyfactions.entity.Board.get().hasFactionWithin(flocation.toNewFLocation(), faction.toNewFaction(), radius);
	}

	@Override
	public void clean() {
		net.redstoneore.legacyfactions.entity.Board.get().clean();
	}

	@Override
	public int getFactionCoordCount(String factionId) {
		return net.redstoneore.legacyfactions.entity.Board.get().getFactionCoordCount(factionId);
	}

	@Override
	public int getFactionCoordCount(Faction faction) {
		return net.redstoneore.legacyfactions.entity.Board.get().getFactionCoordCount(faction.toNewFaction());
	}

	@Override
	public int getFactionCoordCountInWorld(Faction faction, String worldName) {
		return net.redstoneore.legacyfactions.entity.Board.get().getFactionCoordCountInWorld(faction.toNewFaction(), worldName);
	}

	@Override
	public ArrayList<String> getMap(Faction faction, FLocation flocation, double inDegrees) {
		return net.redstoneore.legacyfactions.entity.Board.get().getMap(faction.toNewFaction(), flocation.toNewFLocation(), inDegrees);
	}

	@Override
	public void forceSave() {
		net.redstoneore.legacyfactions.entity.Board.get().forceSave();
	}

	@Override
	public void forceSave(boolean sync) {
		net.redstoneore.legacyfactions.entity.Board.get().forceSave(sync);
	}

	@Override
	public boolean load() {
		return net.redstoneore.legacyfactions.entity.Board.get().load();
	}

}
