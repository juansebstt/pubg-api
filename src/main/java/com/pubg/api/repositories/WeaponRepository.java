package com.pubg.api.repositories;

import com.pubg.api.commons.entities.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {

    Optional<Weapon> findByNameIgnoreCase(String name);

}
