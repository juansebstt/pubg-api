package com.pubg.api.commons.entities;

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
@Table(name = "consumables")
public class Consumable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Long castTime;

    @Enumerated(EnumType.STRING)
    private ConsumableType consumableType;

    private String description;

    private Integer healthLimit;
    private Integer boostAmount;
    private Integer maxRepairAmount;

    @Getter
    public enum ConsumableType {
        HEALING,
        BOOST,
        REPAIR,
    }
}
