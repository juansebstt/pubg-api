package com.pubg.api.commons.entities;

import com.pubg.api.commons.enums.AmmoTypeEnum;
import com.pubg.api.commons.enums.FiringModeEnum;
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
    private AmmoTypeEnum ammoType;

    private String weaponDescription;
    private int attachmentPoints;
    private int magazineSize;
    private int extendedMagazineSize;
    private String rarity;

    @Enumerated(EnumType.STRING)
    private FiringModeEnum firingMode;

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
