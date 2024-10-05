package com.pubg.api.commons.enums;

import lombok.Getter;

@Getter
public enum WeaponTypeEnum {
    ASSAULT_RIFLES("Assault Rifles (ARs)"),
    DESIGNATED_MARKSMAN_RIFLES("Designated Marksman Rifles (DMRs)"),
    RIFLES("Rifles"),
    SUBMACHINE_GUNS("Submachine Guns (SMGs)"),
    SNIPER_RIFLES("Sniper Rifles (SRs)"),
    LIGHT_MACHINE_GUNS("Light Machine Guns (LMGs)"),
    SHOTGUNS("Shotguns"),
    BOWS("Bows"),
    PISTOLS("Pistols"),
    THROWABLES("Throwables"),
    MELEE_WEAPONS("Melee Weapons"),
    MISCELLANEOUS_WEAPONS("Miscellaneous Weapons");

    private final String description;

    WeaponTypeEnum(String description) {
        this.description = description;
    }
}
