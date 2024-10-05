package com.pubg.api.commons.enums;

import lombok.Getter;

@Getter
public enum AmmoTypeEnum {
    THREE_HUNDRED_MAGNUM(".300 Magnum"),
    FIVE_FIVE_SIX("5.56mm"),
    SEVEN_SIX_TWO("7.62mm"),
    TWELVE_GAUGE("12 Gauge"),
    FORTY_FIVE_ACP(".45 ACP"),
    FORTY_MM("40 mm"),
    FIVE_SEVEN("5.7 mm"),
    SIXTY_MM("60 mm"),
    NINE_MM("9 mm"),
    BOLT("Bolt"),
    FLARE("Flare");

    private final String description;

    AmmoTypeEnum(String description) {
        this.description = description;
    }
}
