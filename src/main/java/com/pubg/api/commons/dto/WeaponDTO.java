package com.pubg.api.commons.dto;

import com.pubg.api.commons.enums.AmmoTypeEnum;
import com.pubg.api.commons.enums.FiringModeEnum;
import com.pubg.api.commons.enums.WeaponTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeaponDTO {

    private long id;
    private String name;
    private String weaponType;
    private int hitDamage;
    private double damagePerSecond;
    private double initialBulletSpeed;
    private String ammoType;
    private String weaponDescription;
    private int attachmentPoints;
    private int magazineSize;
    private int extendedMagazineSize;
    private String rarity;
    private String firingMode;

}