package com.pubg.api.controller.impl;

import com.pubg.api.commons.entities.Weapon;
import com.pubg.api.controller.WeaponApi;
import com.pubg.api.services.WeaponService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeaponController implements WeaponApi {

    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @Override
    public ResponseEntity<Weapon> saveWeapon(@RequestBody Weapon weapon) {
        var weaponCreated = this.weaponService.saveWeapon(weapon);
        return ResponseEntity.ok(weaponCreated);
    }
}
