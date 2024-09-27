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
}
