package com.pubg.api.services.impl;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.commons.exceptions.GlobalExceptionHandler;
import com.pubg.api.mappers.WeaponMapper;
import com.pubg.api.repositories.WeaponRepository;
import com.pubg.api.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeaponServiceImpl implements WeaponService {

    private final WeaponRepository weaponRepository;

    @Autowired
    public WeaponServiceImpl(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public WeaponDTO saveWeapon(WeaponDTO weaponRequest) {
        // Convert WeaponDTO to Weapon entity
        Weapon weapon = WeaponMapper.toWeaponEntity(weaponRequest);

        // Save the Weapon entity to the database
        Weapon savedWeapon = weaponRepository.save(weapon);

        // Convert the saved Weapon back to WeaponDTO and return
        return WeaponMapper.toWeaponDTO(savedWeapon);
    }

    @Override
    public Optional<WeaponDTO> findWeaponByName(String name) {
        return weaponRepository.findByNameIgnoreCase(name);
    }
}
