package com.pubg.api.services.impl;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.mappers.WeaponMapper;
import com.pubg.api.repositories.WeaponRepository;
import com.pubg.api.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
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
        Weapon weapon = WeaponMapper.toWeaponEntity(weaponRequest);
        Weapon savedWeapon = weaponRepository.save(weapon);

        return WeaponMapper.toWeaponDTO(savedWeapon);

    }

    @Override
    public Optional<WeaponDTO> findWeaponByName(String name) {
        return weaponRepository.findByNameIgnoreCase(name)
                .map(WeaponMapper::toWeaponDTO);  // Map Weapon to WeaponDTO
    }
}
