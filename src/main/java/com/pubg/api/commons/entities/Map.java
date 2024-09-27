package com.pubg.api.commons.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
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
    private MapName mapName;

    private String size;

    @ManyToMany(mappedBy = "maps")
    private Set<Vehicle> vehicles = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Location location;

    @Enumerated(EnumType.STRING)
    private TypeOfCombat typeOfCombat;

    private String mapDescription;

    @Enumerated(EnumType.STRING)
    private Weather weather;

    @Getter
    public enum MapName {
        ERANGEL(Arrays.asList
                ("Pochinki", "Rozhok", "Yasnaya Polyana", "Mylta", "Georgopol", "Severny", "Shooting Range",
                        "Kameshki", "Zharki", "Mansion", "Lipovka", "Prison", "Shelter", "Mylta Power",
                        "Farm", "Ferry Pier", "Primorsk", "Quarry", "Gatka", "Ruins", "Boatyard", "Hospital")),

        MIRAMAR(Arrays.asList
                ("Los Leones", "El Pozo", "Monte Nuevo", "Pecado", "Oasis", "Campo Militar", "Tierra Bronca",
                        "Cruz del Valle", "Water Treatment", "La Cobreria", "Alcantara", "Crater Fields",
                        "San Martin", "Hacienda del Patron", "Truck Stop", "El Azahar", "Impala", "Cantera",
                        "Graveyard", "Power Grid", "Brick Yard", "Chumacera", "Puerto Paraiso", "Resort",
                        "Patrona", "Southern Island", "Prison", "Valle del Mar")),

        TAEGO(Arrays.asList
                ("Hosan", "Buk San Sa", "Samil", "Palace")),

        VIKENDI(Arrays.asList
                ("Dobro Mesto", "Castle", "Cosmodrome", "Volnova")),

        SANHOK(Arrays.asList
                ("Bootcamp", "Paradise Resort", "Ruins", "Pai Nan")),

        DESTON(Arrays.asList
                ()),

        KARAKIN(Arrays.asList
                ("Al Habar", "Bahr Sahir", "Bashara", "Hadiqa Nemo", "Al Hayik", "Cargo Ship")),

        PARAMO(Arrays.asList
                ()),
        HAVEN(Arrays.asList
                ()),
        RONDO(Arrays.asList
                ());


        private final List<String> cities;

        // Enum constructor
        MapName(List<String> cities) {
            this.cities = cities;
        }
    }

}
