package com.massivecraft.factions.fake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.massivecraft.factions.Faction;
import com.massivecraft.factions.Factions;

import net.redstoneore.legacyfactions.entity.FactionColl;

@Deprecated
public class FakeFactions extends Factions {

	private Map<String, FakeFaction> factionMap = new HashMap<String, FakeFaction>();
	
	@Override
	public Faction getFactionById(String id) {
		if (!this.factionMap.containsKey(id)) {
			this.factionMap.put(id, new FakeFaction(FactionColl.get(id)));
		}
		return this.factionMap.get(id);
	}

	@Override
	public Faction getByTag(String str) {
		return this.getFactionById(FactionColl.get().getByTag(str).getId());
	}

	@Override
	public Faction getBestTagMatch(String start) {
		return this.getFactionById(FactionColl.get().getBestTagMatch(start).getId());
	}

	@Override
	public boolean isTagTaken(String str) {
		return FactionColl.get().isTagTaken(str);
	}

	@Override
	public boolean isValidFactionId(String id) {
		return FactionColl.get().isValidFactionId(id);
	}

	@Override
	public Faction createFaction() {
		return this.getFactionById(FactionColl.get().createFaction().getId());
	}

	@Override
	public void removeFaction(String id) {
		FactionColl.get().removeFaction(id);
	}

	@Override
	public Set<String> getFactionTags() {
		return FactionColl.get().getFactionTags();
	}

	@Override
	public ArrayList<Faction> getAllFactions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Faction getNone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Faction getWilderness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Faction getSafeZone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Faction getWarZone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forceSave() {
		FactionColl.get().forceSave();
	}

	@Override
	public void forceSave(boolean sync) {
		FactionColl.get().forceSave(sync);
		
	}

	@Override
	public void load() {
		FactionColl.get().load();
	}

}
