package com.pubg.api.commons.entities;

import com.pubg.api.commons.enums.EquipmentLevelEnum;
import com.pubg.api.commons.enums.EquipmentTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Long damageReduction;
    private Long capacity;

    @Enumerated(EnumType.STRING)
    private EquipmentTypeEnum equipmentType;

    @Enumerated(EnumType.STRING)
    private EquipmentLevelEnum equipmentLevel;

    private String description;

}
