package com.massivecraft.factions.fake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.massivecraft.factions.FLocation;
import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.FPlayers;
import com.massivecraft.factions.Faction;
import com.massivecraft.factions.iface.RelationParticipator;
import com.massivecraft.factions.struct.Relation;
import com.massivecraft.factions.struct.Role;
import com.massivecraft.factions.util.LazyLocation;
import com.massivecraft.factions.zcore.util.TL;

import net.redstoneore.legacyfactions.Lang;
import net.redstoneore.legacyfactions.entity.FPlayerColl;
import net.redstoneore.legacyfactions.entity.FactionColl;
import net.redstoneore.legacyfactions.warp.FactionWarp;

@Deprecated
public class FakeFaction implements Faction {

	public FakeFaction(net.redstoneore.legacyfactions.entity.Faction faction) {
		this.faction = faction;
	}

	private final net.redstoneore.legacyfactions.entity.Faction faction;
	
	@Override
	public void msg(TL translation, Object... args) {
		this.faction.msg(Lang.valueOf(translation.name()).toString(), args);
	}

	@Override
	public HashMap<String, List<String>> getAnnouncements() {
		return this.faction.getAnnouncements();
	}

	@Override
	public ConcurrentHashMap<String, LazyLocation> getWarps() {
		ConcurrentHashMap<String, LazyLocation> warps = new ConcurrentHashMap<String, LazyLocation>();
		for (FactionWarp warp : this.faction.warps().getAll()) {
			warps.put(warp.getName(), LazyLocation.valueOf(warp.getLazyLocation()));
		}
		
		return warps;
	}

	@Override
	public LazyLocation getWarp(String name) {
		if (!this.faction.warps().get(name).isPresent()) return null;
		
		return LazyLocation.valueOf(this.faction.warps().get(name).get().getLazyLocation());
	}

	@Override
	public void setWarp(String name, LazyLocation loc) {
		this.faction.warps().setWarp(name, loc.toNewLazyLocation());
		
	}

	@Override
	public boolean isWarp(String name) {
		return this.faction.warps().get(name).isPresent();
	}

	@Override
	public boolean removeWarp(String name) {
		if (!this.faction.warps().get(name).isPresent()) return false;
		this.faction.warps().get(name).get().delete();		
		return true;
	}

	@Override
	public void clearWarps() {
		this.faction.warps().deleteAll();
	}

	@Override
	public int getMaxVaults() {
		return this.faction.getMaxVaults();
	}

	@Override
	public void setMaxVaults(int value) {
		this.faction.setMaxVaults(value);
	}

	@Override
	public void addAnnouncement(FPlayer fPlayer, String msg) {
		this.faction.addAnnouncement(FPlayerColl.get(fPlayer.getId()), msg);
	}

	@Override
	public void sendUnreadAnnouncements(FPlayer fPlayer) {
		this.faction.sendUnreadAnnouncements(FPlayerColl.get(fPlayer.getId()));
	}

	@Override
	public void removeAnnouncements(FPlayer fPlayer) {
		this.faction.removeAnnouncements(FPlayerColl.get(fPlayer.getId()));
	}

	@Override
	public Set<String> getInvites() {
		return this.faction.getInvites();
	}

	@Override
	public String getId() {
		return this.faction.getId();
	}

	@Override
	public void invite(FPlayer fplayer) {
		this.faction.invite(FPlayerColl.get(fplayer.getId()));
	}

	@Override
	public void deinvite(FPlayer fplayer) {
		this.faction.deinvite(FPlayerColl.get(fplayer.getId()));
	}

	@Override
	public boolean isInvited(FPlayer fplayer) {
		return this.faction.isInvited(FPlayerColl.get(fplayer.getId()));
	}

	@Override
	public boolean getOpen() {
		return this.faction.getOpen();
	}

	@Override
	public void setOpen(boolean isOpen) {
		this.faction.setOpen(isOpen);
	}

	@Override
	public boolean isPeaceful() {
		return this.faction.isPeaceful();
	}

	@Override
	public void setPeaceful(boolean isPeaceful) {
		this.faction.setPeaceful(isPeaceful);
	}

	@Override
	public void setPeacefulExplosionsEnabled(boolean val) {
		this.faction.setPeacefulExplosionsEnabled(val);
	}

	@Override
	public boolean getPeacefulExplosionsEnabled() {
		return this.faction.getPeacefulExplosionsEnabled();
	}

	@Override
	public boolean noExplosionsInTerritory() {
		return this.faction.noExplosionsInTerritory();
	}

	@Override
	public boolean isPermanent() {
		return this.faction.isPermanent();
	}

	@Override
	public void setPermanent(boolean isPermanent) {
		this.faction.setPermanent(isPermanent);
	}

	@Override
	public String getTag() {
		return this.faction.getTag();
	}

	@Override
	public String getTag(String prefix) {
		return this.faction.getTag(prefix);
	}

	@Override
	public String getTag(Faction otherFaction) {
		return this.faction.getTag(otherFaction.toNewFaction());
	}

	@Override
	public String getTag(FPlayer otherFplayer) {
		return this.faction.getTag(FPlayerColl.get(otherFplayer.getId()));
	}

	@Override
	public void setTag(String str) {
		this.faction.setTag(str);
	}

	@Override
	public String getComparisonTag() {
		return this.faction.getComparisonTag();
	}

	@Override
	public String getDescription() {
		return this.faction.getDescription();
	}

	@Override
	public void setDescription(String value) {
		this.faction.setDescription(value);
	}

	@Override
	public void setHome(Location home) {
		this.faction.setHome(home);
	}

	@Override
	public boolean hasHome() {
		return this.faction.hasHome();
	}

	@Override
	public Location getHome() {
		return this.faction.getHome();
	}

	@Override
	public long getFoundedDate() {
		return this.faction.getFoundedDate();
	}

	@Override
	public void setFoundedDate(long newDate) {
		this.faction.setFoundedDate(newDate);
	}

	@Override
	public void confirmValidHome() {
		this.faction.confirmValidHome();
	}

	@Override
	public String getAccountId() {
		return this.faction.getAccountId();
	}

	@Override
	public Integer getPermanentPower() {
		return this.faction.getPermanentPower();
	}

	@Override
	public void setPermanentPower(Integer permanentPower) {
		this.faction.setPermanentPower(permanentPower);
	}

	@Override
	public boolean hasPermanentPower() {
		return this.faction.hasPermanentPower();
	}

	@Override
	public double getPowerBoost() {
		return this.faction.getPowerBoost();
	}

	@Override
	public void setPowerBoost(double powerBoost) {
		this.faction.setPowerBoost(powerBoost);
	}

	@Override
	public boolean noPvPInTerritory() {
		return this.faction.noPvPInTerritory();
	}

	@Override
	public boolean noMonstersInTerritory() {
		return this.faction.noMonstersInTerritory();
	}

	@Override
	public boolean isNormal() {
		return this.faction.isNormal();
	}

	@Override
	public boolean isNone() {
		return this.faction.isNone();
	}

	@Override
	public boolean isWilderness() {
		return this.faction.isWilderness();
	}

	@Override
	public boolean isSafeZone() {
		return this.faction.isSafeZone();
	}

	@Override
	public boolean isWarZone() {
		return this.faction.isWarZone();
	}

	@Override
	public boolean isPlayerFreeType() {
		return this.faction.isPlayerFreeType();
	}

	@Override
	public boolean isPowerFrozen() {
		return this.faction.isPowerFrozen();
	}

	@Override
	public void setLastDeath(long time) {
		this.faction.setLastDeath(time);
	}

	@Override
	public int getKills() {
		return this.faction.getKills();
	}

	@Override
	public int getDeaths() {
		return this.faction.getDeaths();
	}

	@Override
	public String describeTo(RelationParticipator that, boolean ucfirst) {
		return "faction"; // TODO: RelationParticipator conversion
	}

	@Override
	public String describeTo(RelationParticipator that) {
		return "faction"; // TODO: RelationParticipator conversion
	}

	@Override
	public Relation getRelationTo(RelationParticipator rp) {
		return Relation.NEUTRAL; // TODO: RelationParticipator conversion
	}

	@Override
	public Relation getRelationTo(RelationParticipator rp, boolean ignorePeaceful) {
		return Relation.NEUTRAL; // TODO: RelationParticipator conversion
	}

	@Override
	public ChatColor getColorTo(RelationParticipator rp) {
		return ChatColor.GRAY; // TODO: RelationParticipator conversion
	}

	@Override
	public Relation getRelationWish(Faction otherFaction) {
		return Relation.valueOf(this.faction.getRelationWish(otherFaction.toNewFaction()).name());
	}

	@Override
	public void setRelationWish(Faction otherFaction, Relation relation) {
		this.faction.setRelationWish(otherFaction.toNewFaction(), net.redstoneore.legacyfactions.Relation.valueOf(relation.name()));
	}

	@Override
	public int getRelationCount(Relation relation) {
		return this.faction.getRelationCount(net.redstoneore.legacyfactions.Relation.valueOf(relation.name()));
	}

	@Override
	public double getPower() {
		return this.faction.getPower();
	}

	@Override
	public double getPowerMax() {
		return this.faction.getPowerMax();
	}

	@Override
	public int getPowerRounded() {
		return this.faction.getPowerMaxRounded();
	}

	@Override
	public int getPowerMaxRounded() {
		return this.faction.getPowerMaxRounded();
	}

	@Override
	public int getLandRounded() {
		return this.faction.getLandRounded();
	}

	@Override
	public int getLandRoundedInWorld(String worldName) {
		return this.faction.getLandRoundedInWorld(worldName);
	}

	@Override
	public boolean hasLandInflation() {
		return this.faction.hasLandInflation();
	}

	@Override
	public void refreshFPlayers() {
		this.faction.refreshFPlayers();
	}

	@Override
	public boolean addFPlayer(FPlayer fplayer) {
		return this.faction.addFPlayer(FPlayerColl.get(fplayer.getId()));
	}

	@Override
	public boolean removeFPlayer(FPlayer fplayer) {
		return this.faction.removeFPlayer(FPlayerColl.get(fplayer.getId()));
	}

	@Override
	public int getSize() {
		return this.faction.getSize();
	}

	@Override
	public Set<FPlayer> getFPlayers() {
		Set<FPlayer> fplayers = new HashSet<FPlayer>();
		
		for (net.redstoneore.legacyfactions.entity.FPlayer fplayer : this.faction.getFPlayers()) {
			fplayers.add(FPlayers.getInstance().getById(fplayer.getId()));
		}
		return fplayers;
	}

	@Override
	public Set<FPlayer> getFPlayersWhereOnline(boolean online) {
		Set<FPlayer> fplayers = new HashSet<FPlayer>();
		
		for (net.redstoneore.legacyfactions.entity.FPlayer fplayer : this.faction.getFPlayersWhereOnline(online)) {
			fplayers.add(FPlayers.getInstance().getById(fplayer.getId()));
		}
		return fplayers;	
	}

	@Override
	public FPlayer getFPlayerAdmin() {
		return FPlayers.getInstance().getById(this.faction.getFPlayerAdmin().getId());
	}

	@Override
	public ArrayList<FPlayer> getFPlayersWhereRole(Role role) {
		ArrayList<FPlayer> fplayers = new ArrayList<FPlayer>();
		
		for (net.redstoneore.legacyfactions.entity.FPlayer fplayer : this.faction.getFPlayersWhereRole(net.redstoneore.legacyfactions.Role.valueOf(role.name()))) {
			fplayers.add(FPlayers.getInstance().getById(fplayer.getId()));
		}
		return fplayers;
	}

	@Override
	public ArrayList<Player> getOnlinePlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPlayersOnline() {
		return this.faction.hasPlayersOnline();
	}

	@Override
	public void memberLoggedOff() {
		this.faction.memberLoggedOff();
	}

	@Override
	public void promoteNewLeader() {
		this.faction.promoteNewLeader();
	}

	@Override
	public void msg(String message, Object... args) {
		this.faction.msg(message, args);
	}

	@Override
	public void sendMessage(String message) {
		this.faction.sendMessage(message);
	}

	@Override
	public void sendMessage(List<String> messages) {
		this.faction.sendMessage(messages);		
	}

	@Override
	public Map<FLocation, Set<String>> getClaimOwnership() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearAllClaimOwnership() {
		this.faction.clearAllClaimOwnership();
	}

	@Override
	public void clearClaimOwnership(FLocation loc) {
		this.faction.clearClaimOwnership(loc.toNewFLocation());
	}

	@Override
	public void clearClaimOwnership(FPlayer player) {
		this.faction.clearClaimOwnership(FPlayerColl.get(player.getId()));
	}

	@Override
	public int getCountOfClaimsWithOwners() {
		return this.faction.getCountOfClaimsWithOwners();
	}

	@Override
	public boolean doesLocationHaveOwnersSet(FLocation loc) {
		return this.faction.doesLocationHaveOwnersSet(loc.toNewFLocation());
	}

	@Override
	public boolean isPlayerInOwnerList(FPlayer player, FLocation loc) {
		return this.faction.isPlayerInOwnerList(FPlayerColl.get(player.getId()), loc.toNewFLocation());
	}

	@Override
	public void setPlayerAsOwner(FPlayer player, FLocation loc) {
		this.faction.setPlayerAsOwner(FPlayerColl.get(player.getId()), loc.toNewFLocation());
	}

	@Override
	public void removePlayerAsOwner(FPlayer player, FLocation loc) {
		this.faction.removePlayerAsOwner(FPlayerColl.get(player.getId()), loc.toNewFLocation());
	}

	@Override
	public Set<String> getOwnerList(FLocation loc) {
		return this.faction.getOwnerList(loc.toNewFLocation());
	}

	@Override
	public String getOwnerListString(FLocation loc) {
		return this.faction.getOwnerListString(loc.toNewFLocation());
	}

	@Override
	public boolean playerHasOwnershipRights(FPlayer fplayer, FLocation loc) {
		return this.faction.playerHasOwnershipRights(FPlayerColl.get(fplayer.getId()), loc.toNewFLocation());
	}

	@Override
	public void remove() {
		this.faction.remove();
	}

	@Override
	public Set<FLocation> getAllClaims() {
		Set<FLocation> claims = new HashSet<FLocation>();
		
		for (net.redstoneore.legacyfactions.FLocation location : this.faction.getAllClaims()) {
			claims.add(FLocation.fromString(location.toString()));
		}
		return claims;
	}

	@Override
	public void setId(String id) {
		this.faction.setId(id);
	}

	@Override
	public net.redstoneore.legacyfactions.entity.Faction toNewFaction() {
		return FactionColl.get().getFactionById(this.faction.getId());
	}
	
}
