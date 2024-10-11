package com.pubg.api.services;

import com.pubg.api.commons.entities.Weapon;

import java.util.Optional;


public interface WeaponService {


    Weapon saveWeapon(Weapon weaponRequest);


    Optional<Weapon> findWeaponByName(String name);

    }
    
