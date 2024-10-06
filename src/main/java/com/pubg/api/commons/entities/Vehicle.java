package com.pubg.api.commons.entities;

import com.pubg.api.commons.enums.VehicleCategoryEnum;
import com.pubg.api.commons.enums.VehicleTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private VehicleTypeEnum vehicleType;

    private int maxSpeed;
    private int maxPassengerCapacity;
    private int hitPoints;
    private String description;

    @Enumerated(EnumType.STRING)
    private VehicleCategoryEnum vehicleCategory;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "vehicle_map",
            joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "map_id")
    )
    private Set<Map> maps; // Set of maps where the vehicle can spawn

}
