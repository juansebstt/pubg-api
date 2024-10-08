package com.pubg.api.commons.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum MapsEnum {
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
            ("Ho San", "Buk San Sa", "Samil", "Palace", "Shipyard", "Army Base", "Wol Song", "Airport",
                    "Terminal", "Young Cheon", "Go Dok", "Hae Moo Sa", "Kang Neung", "Ho San", "Fishing Camp",
                    "Ha Po", "Ho San Prison", "School", "Song Am", "Hospital", "Oh Hyang")),

    VIKENDI(Arrays.asList
            ("Castle", "Cosmodrome", "Volnova", "Observatory", "Coal Mine", "Dinoland", "Naros",
                    "Laveni", "Villa", "Train Station", "Trika", "Lumber Yard", "Naznova", "Deka Mesto",
                    "Cave", "Pavilka", "Winery", "Kranik")),

    SANHOK(Arrays.asList
            ("Bootcamp", "Paradise Resort", "Ruins", "Pai Nan", "Camp Alpha", "Camp Bravo", "Camp Charlie",
                    "Ruins", "Ha Tihn", "Tat Mok", "Khao", "Mongnai", "Bhan", "Lakawi", "Quarry", "Kampong",
                    "Tambang", "Cave", "Docks", "Ban Tar", "Sahmee", "Na Kham")),

    DESTON(Arrays.asList
            ("Ten Forts", "Swamp", "Concert", "Carpenter's End ", "Assembly", "Wind Farm", "Ripton", "Arena",
                    "Buxley", "Los Arcos", "Construction Site", "Turrita", "Barclift", "Lodge", "Sancarna",
                    "Hydroelectric Dam", "El Koro", "Holston Meadows")),

    KARAKIN(Arrays.asList
            ("Al Habar", "Bahr Sahir", "Bashara", "Hadiqa Nemo", "Al Hayik", "Cargo Ship")),

    PARAMO(Arrays.asList
            ("Capaco", "Lab", "Hellipad", "Atahul", "Makalpa")),

    HAVEN(Arrays.asList
            ("Industrial Park", "Rail Yard", "Coal Yards", "Carbon Steelworks", "Docks", "Residential")),

    RONDO(Arrays.asList
            ("Kun Xia", "Rai An", "Nan Chuan", "Min Hu", "Mu Ho Pan", "Hemay Town", "Bei Li", "Stadium",
                    "Bamboo", "Test Track", "Neox Factory", "Mey Ran", "Lo Hua Xing", "Jao Tin", "Yu Lin",
                    "Fong Tun", "Lan Po", "Dan Ching", "Tu Ling", "Jadena City", "Tin Long Gardens",
                    "Hung Shang", "Rin Jiang", "Long Ho"));

    private final List<String> cities;

    // Enum constructor
    MapsEnum(List<String> cities) {
        this.cities = cities;
    }
}