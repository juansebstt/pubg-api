package com.pubg.api.mappers;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.commons.enums.AmmoTypeEnum;
import com.pubg.api.commons.enums.FiringModeEnum;
import com.pubg.api.commons.enums.WeaponTypeEnum;

public class WeaponMapper {

    public static WeaponDTO toWeaponDTO(Weapon weapon) {
        return new WeaponDTO(
                weapon.getId(),
                weapon.getName(),
                weapon.getWeaponType().name(),
                weapon.getHitDamage(),
                weapon.getDamagePerSecond(),
                weapon.getInitialBulletSpeed(),
                weapon.getAmmoType().name(),
                weapon.getWeaponDescription(),
                weapon.getAttachmentPoints(),
                weapon.getMagazineSize(),
                weapon.getExtendedMagazineSize(),
                weapon.getRarity(),
                weapon.getFiringMode().name()
        );
    }

    public static Weapon toWeaponEntity(WeaponDTO weaponDTO) {
        Weapon weapon = new Weapon();
        weapon.setId(weaponDTO.getId());
        weapon.setName(weaponDTO.getName());
        weapon.setWeaponType(WeaponTypeEnum.valueOf(weaponDTO.getWeaponType()));
        weapon.setHitDamage(weaponDTO.getHitDamage());
        weapon.setDamagePerSecond((int) weaponDTO.getDamagePerSecond());
        weapon.setInitialBulletSpeed(weaponDTO.getInitialBulletSpeed());
        weapon.setAmmoType(AmmoTypeEnum.valueOf(weaponDTO.getAmmoType()));
        weapon.setWeaponDescription(weaponDTO.getWeaponDescription());
        weapon.setAttachmentPoints(weaponDTO.getAttachmentPoints());
        weapon.setMagazineSize(weaponDTO.getMagazineSize());
        weapon.setExtendedMagazineSize(weaponDTO.getExtendedMagazineSize());
        weapon.setRarity(weaponDTO.getRarity());
        weapon.setFiringMode(FiringModeEnum.valueOf(weaponDTO.getFiringMode()));

        return weapon;
    }
}
