package com.pubg.api.services;

import com.pubg.api.commons.entities.Weapon;

public interface WeaponService {

    Weapon saveWeapon(String id, Weapon weaponRequest);

}
