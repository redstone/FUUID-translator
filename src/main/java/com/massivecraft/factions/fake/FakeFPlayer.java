package com.massivecraft.factions.fake;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.massivecraft.factions.FLocation;
import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.Faction;
import com.massivecraft.factions.Factions;
import com.massivecraft.factions.iface.RelationParticipator;
import com.massivecraft.factions.struct.ChatMode;
import com.massivecraft.factions.struct.Relation;
import com.massivecraft.factions.struct.Role;
import com.massivecraft.factions.util.WarmUpUtil.Warmup;
import com.massivecraft.factions.zcore.util.TL;

import net.redstoneore.legacyfactions.Lang;

@Deprecated
public class FakeFPlayer implements FPlayer {

	public FakeFPlayer(net.redstoneore.legacyfactions.entity.FPlayer player) {
		this.player = player;
	}
	
	private final net.redstoneore.legacyfactions.entity.FPlayer player;

	@Override
	public void msg(TL translation, Object... args) {
		this.player.msg(Lang.valueOf(translation.name()).toString(), args);
	}

	@Override
	public void login() {
		this.player.login();
	}

	@Override
	public void logout() {
		this.player.logout();
	}

	@Override
	public Faction getFaction() {
		return Factions.getInstance().getFactionById(this.getFactionId());
	}

	@Override
	public String getFactionId() {
		return this.player.getFactionId();
	}

	@Override
	public boolean hasFaction() {
		return this.player.hasFaction();
	}

	@Override
	public void setFaction(Faction faction) {
		this.player.setFaction(Factions.getInstance().getFactionById(faction.getId()).toNewFaction());
	}

	@Override
	public boolean willAutoLeave() {
		return this.player.willAutoLeave();
	}

	@Override
	public void setAutoLeave(boolean autoLeave) {
		this.player.setAutoLeave(autoLeave);
	}

	@Override
	public long getLastFrostwalkerMessage() {
		return this.player.getLastFrostwalkerMessage();
	}

	@Override
	public void setLastFrostwalkerMessage() {
		this.player.setLastFrostwalkerMessage();
	}

	@Override
	public void setMonitorJoins(boolean monitor) {
		this.player.setMonitorJoins(monitor);		
	}

	@Override
	public boolean isMonitoringJoins() {
		return this.player.isMonitoringJoins();
	}

	@Override
	public Role getRole() {
		return Role.valueOf(this.player.getRole());
	}

	@Override
	public void setRole(Role role) {
		if (role == Role.ADMIN) {
			this.player.setRole(net.redstoneore.legacyfactions.Role.ADMIN);
		} else if (role == Role.MODERATOR) {
			this.player.setRole(net.redstoneore.legacyfactions.Role.MODERATOR);
		} else if (role == Role.NORMAL) {
			this.player.setRole(net.redstoneore.legacyfactions.Role.NORMAL);
		} else {
			this.player.setRole(null);
		}
	}

	@Override
	public double getPowerBoost() {
		return this.player.getPowerBoost();
	}

	@Override
	public void setPowerBoost(double powerBoost) {
		this.player.setPowerBoost(powerBoost);
	}

	@Override
	public Faction getAutoClaimFor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAutoClaimFor(Faction faction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAutoSafeClaimEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsAutoSafeClaimEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAutoWarClaimEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsAutoWarClaimEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdminBypassing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVanished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsAdminBypassing(boolean val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChatMode(ChatMode chatMode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChatMode getChatMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIgnoreAllianceChat(boolean ignore) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isIgnoreAllianceChat() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSpyingChat(boolean chatSpying) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSpyingChat() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean showScoreboard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setShowScoreboard(boolean show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetFactionData(boolean doSpoutUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetFactionData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getLastLoginTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLastLoginTime(long lastLoginTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMapAutoUpdating() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setMapAutoUpdating(boolean mapAutoUpdating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasLoginPvpDisabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FLocation getLastStoodAt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLastStoodAt(FLocation flocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameAndSomething(String something) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameAndTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameAndTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameAndTitle(Faction faction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameAndTitle(FPlayer fplayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getChatTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getChatTag(Faction faction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getChatTag(FPlayer fplayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getKills() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeaths() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String describeTo(RelationParticipator that, boolean ucfirst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String describeTo(RelationParticipator that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relation getRelationTo(RelationParticipator rp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relation getRelationTo(RelationParticipator rp, boolean ignorePeaceful) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relation getRelationToLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChatColor getColorTo(RelationParticipator rp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void heal(int amnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPower() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void alterPower(double delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPowerMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPowerMin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPowerRounded() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPowerMaxRounded() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPowerMinRounded() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void losePowerFromBeingOffline() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDeath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInOwnTerritory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInOthersTerritory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInAllyTerritory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInNeutralTerritory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInEnemyTerritory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendFactionHereMessage(Faction from) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leave(boolean makePay) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canClaimForFaction(Faction forFaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canClaimForFactionAtLocation(Faction forFaction, Location location, boolean notifyFailure) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean attemptClaim(Faction forFaction, Location location, boolean notifyFailure) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void msg(String str, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOnline() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(List<String> messages) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isOnlineAndVisibleTo(Player me) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isOffline() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWarmingUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Warmup getWarmupType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWarmup(Warmup warmup, int taskId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopWarmup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearWarmup() {
		// TODO Auto-generated method stub
		
	}
}
