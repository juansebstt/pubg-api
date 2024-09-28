package com.pubg.api.commons.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private EquipmentType equipmentType;

    private String description;

    @Getter
    public enum EquipmentType {
        BACKPACK,
        HELMET,
        ARMOR,
        ATTACHMENT
    }
}
