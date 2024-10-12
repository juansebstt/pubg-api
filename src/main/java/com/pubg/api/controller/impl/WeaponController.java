package com.pubg.api.controller.impl;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.controller.WeaponApi;
import com.pubg.api.mappers.WeaponMapper;
import com.pubg.api.services.WeaponService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WeaponController implements WeaponApi {

    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @Override
    public ResponseEntity<WeaponDTO> saveWeapon(@RequestBody WeaponDTO weapon) {
        var weaponCreated = this.weaponService.saveWeapon(weapon);
        return ResponseEntity.ok(weaponCreated);
    }

    @Override
    public ResponseEntity<WeaponDTO> getWeaponsByName(@RequestParam String name) {
        Optional<Weapon> weapon = weaponService.findWeaponByName(name);

        return weapon.map(value -> ResponseEntity.ok(WeaponMapper.toWeaponDTO(value)))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
