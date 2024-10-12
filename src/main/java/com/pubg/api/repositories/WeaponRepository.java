package com.pubg.api.repositories;

import com.pubg.api.commons.dto.WeaponDTO;
import com.pubg.api.commons.entities.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeaponRepository extends JpaRepository<WeaponDTO, Long> {

    Optional<WeaponDTO> findByNameIgnoreCase(String name);

}
