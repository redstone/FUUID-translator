package com.massivecraft.factions.struct;

import com.massivecraft.factions.Conf;
import com.massivecraft.factions.zcore.util.TL;

@Deprecated
public enum Role {
    ADMIN(2, TL.ROLE_ADMIN),
    MODERATOR(1, TL.ROLE_MODERATOR),
    NORMAL(0, TL.ROLE_NORMAL);

    public final int value;
    public final String nicename;
    public final TL translation;

    private Role(final int value, final TL translation) {
        this.value = value;
        this.nicename = translation.toString();
        this.translation = translation;
    }

    public boolean isAtLeast(Role role) {
        return this.value >= role.value;
    }

    public boolean isAtMost(Role role) {
        return this.value <= role.value;
    }

    @Override
    public String toString() {
        return this.nicename;
    }

    public TL getTranslation(){
        return translation;
    }

    public String getPrefix() {
        if (this == Role.ADMIN) {
            return Conf.prefixAdmin;
        }

        if (this == Role.MODERATOR) {
            return Conf.prefixMod;
        }

        return "";
    }
    
    public static Role valueOf(net.redstoneore.legacyfactions.Role role) {
    	if (role == net.redstoneore.legacyfactions.Role.ADMIN ){
    		return Role.ADMIN;
    	}
    	if (role == net.redstoneore.legacyfactions.Role.MODERATOR ){
    		return Role.MODERATOR;
    	}
    	if (role == net.redstoneore.legacyfactions.Role.NORMAL ){
    		return Role.NORMAL;
    	}
    	return null;
    }
}
