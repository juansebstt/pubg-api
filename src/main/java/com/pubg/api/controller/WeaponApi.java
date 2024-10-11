package com.pubg.api.controller;

import com.pubg.api.commons.constants.ApiPathVariables;
import com.pubg.api.commons.entities.Weapon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.PUBG_ROUTE)
public interface WeaponApi {

    @PostMapping("/weapon")
    ResponseEntity<Weapon> saveWeapon(@RequestBody Weapon weapon);

    @GetMapping("/weapons")
    ResponseEntity<Weapon> getWeaponsByName(@RequestParam String name);

}
