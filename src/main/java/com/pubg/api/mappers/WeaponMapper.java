package com.pubg.api.mappers;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.commons.enums.AmmoTypeEnum;
import com.pubg.api.commons.enums.FiringModeEnum;
import com.pubg.api.commons.enums.WeaponTypeEnum;

public class WeaponMapper {

    public static WeaponDTO toWeaponDTO(Weapon weapon) {

        WeaponDTO weaponDTO = new WeaponDTO();
        weaponDTO.setId(weapon.getId());
        weaponDTO.setName(weapon.getName());
        weaponDTO.setWeaponType(String.valueOf(weapon.getWeaponType()));
        weaponDTO.setHitDamage(weapon.getHitDamage());
        weaponDTO.setDamagePerSecond(weapon.getDamagePerSecond());
        weaponDTO.setInitialBulletSpeed(weapon.getInitialBulletSpeed());
        weaponDTO.setAmmoType(String.valueOf(weapon.getAmmoType()));
        weaponDTO.setWeaponDescription(weapon.getWeaponDescription());
        weaponDTO.setAttachmentPoints(weapon.getAttachmentPoints());
        weaponDTO.setMagazineSize(weapon.getMagazineSize());
        weaponDTO.setExtendedMagazineSize(weapon.getExtendedMagazineSize());
        weaponDTO.setRarity(weapon.getRarity());
        weaponDTO.setFiringMode(String.valueOf(weapon.getFiringMode()));

        return weaponDTO;
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
