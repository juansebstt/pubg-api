package com.pubg.api.controller;

import com.pubg.api.commons.constants.ApiPathVariables;
import com.pubg.api.commons.entities.Weapon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.PUBG_ROUTE)
public interface WeaponApi {

    @PostMapping("/weapon")
    ResponseEntity<Weapon> saveWeapon(@RequestBody Weapon weapon);

}
