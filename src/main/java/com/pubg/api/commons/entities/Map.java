package com.pubg.api.commons.entities;

import com.pubg.api.commons.enums.LocationEnum;
import com.pubg.api.commons.enums.MapsEnum;
import com.pubg.api.commons.enums.TypeOfCombatEnum;
import com.pubg.api.commons.enums.WeatherEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "maps")
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private MapsEnum maps;

    private String size;

    @ManyToMany(mappedBy = "maps", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Vehicle> vehicles = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private LocationEnum location;

    @Enumerated(EnumType.STRING)
    private TypeOfCombatEnum typeOfCombat;

    private String mapDescription;

    @Enumerated(EnumType.STRING)
    private WeatherEnum weather;

    // Method to get cities for the specific map
    public List<String> getCities() {
        return maps.getCities();
    }

    @Getter
    public enum Weather {
        SUNNY,
        FOGGY,
        RAINY,
        OVERCAST,
        SUNSET,
        MOONLIGHT,
        STORMY,
        WINDY
    }

    @Getter
    public enum Location {
        NORTH_AMERICA,
        SOUTH_AMERICA,
        EUROPE,
        ANTARCTICA,
        AFRICA,
        ASIA,
        OCEANIA
    }

    @Getter
    public enum TypeOfCombat {
        CLOSE_QUARTER_COMBAT,
        MEDIUM_RANGE,
        LONG_RANGE,
    }
}
