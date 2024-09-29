package com.pubg.api.commons.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "weapons")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private WeaponType weaponType;

    private int hitDamage;
    private int damagePerSecond;
    private double initialBulletSpeed;

    @Enumerated(EnumType.STRING)
    private AmmoType ammoType;

    private String weaponDescription;
    private int attachmentPoints;
    private int magazineSize;
    private int extendedMagazineSize;
    private String rarity;

    @Enumerated(EnumType.STRING)
    private FiringMode firingMode;

    @Getter
    public enum FiringMode {
        SINGLE,
        BURST,
        AUTO
    }

    @Getter
    public enum AmmoType {
        THREE_HUNDRED_MAGNUM(".300 Magnum"),
        FIVE_FIVE_SIX("5.56mm"),
        SEVEN_SIX_TWO("7.62mm"),
        TWELVE_GAUGE("12 Gauge"),
        FORTY_FIVE_ACP(".45 ACP"),
        FORTY_MM("40 mm"),
        FIVE_SEVEN("5.7 mm"),
        SIXTY_MM("60 mm "),
        NINE_MM("9 mm"),
        BOLT("Bolt"),
        FLARE("Flare");

        private final String description;

        AmmoType(String description) {
            this.description = description;
        }

    }

    @Getter
    public enum WeaponType {
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

        WeaponType(String description) {
            this.description = description;
        }
    }

    public String getAmmoTypeDescription() {
        return ammoType.getDescription();
    }

    public String getWeaponTypeDescription() {
        return weaponType.getDescription();
    }
}
