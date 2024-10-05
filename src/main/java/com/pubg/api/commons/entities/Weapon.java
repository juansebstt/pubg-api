package com.pubg.api.commons.entities;

import com.pubg.api.commons.enums.AmmoTypeEnum;
import com.pubg.api.commons.enums.FiringModeEnum;
import com.pubg.api.commons.enums.WeaponTypeEnum;
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
    private WeaponTypeEnum weaponType;

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

    public String getAmmoTypeDescription() {
        return ammoType.getDescription();
    }

    public String getWeaponTypeDescription() {
        return weaponType.getDescription();
    }
}
