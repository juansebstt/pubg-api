package com.pubg.api.services;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;

import java.util.Optional;


public interface WeaponService {


    WeaponDTO saveWeapon(WeaponDTO weaponRequest);


    Optional<WeaponDTO> findWeaponByName(String name);

    }

