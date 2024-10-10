package com.pubg.api.services.impl;

import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.commons.exceptions.GlobalExceptionHandler;
import com.pubg.api.repositories.WeaponRepository;
import com.pubg.api.services.WeaponService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeaponServiceImpl implements WeaponService {

    private final WeaponRepository weaponRepository;

    public WeaponServiceImpl(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    @Override
    public Weapon saveWeapon(Weapon weaponRequest) {

        return Optional.of(weaponRequest)
                .map(weaponRepository::save)
                .orElseThrow(() -> new GlobalExceptionHandler(HttpStatus.BAD_REQUEST));
    }
}
