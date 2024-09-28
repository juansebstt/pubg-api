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
@Table(name = "attachments")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Long magnificationFOV;
    private Long adsSpeed;
    private Long reloadSpeed;
    private Integer ammoCapacity;
    private String description;

    @Enumerated(EnumType.STRING)
    private ScopeFeature scopeFeature;

    @Enumerated(EnumType.STRING)
    private MagazineFeature magazineFeature;

    @Enumerated(EnumType.STRING)
    private MuzzleFeature muzzleFeature;

    @Enumerated(EnumType.STRING)
    private GripFeature gripFeature;

    @Enumerated(EnumType.STRING)
    private StockFeature stockFeature;

    @Getter
    public enum ScopeFeature {
        MAGNIFICATION_FOV,
        ADS_SPEED,
    }

    @Getter
    public enum MagazineFeature {
        RELOAD_SPEED,
        AMMO_CAPACITY,
    }

    @Getter
    public enum MuzzleFeature {
        RECOIL_CONTROL,
        RECOIL_PATTERN,
        HORIZONTAL_RECOIL_PATTERN,
        VERTICAL_RECOIL_PATTERN,
        WEAPON_SOUND,
        MUZZLE_FLASH,
        PELLET_SPREAD
    }

    @Getter
    public enum GripFeature {
        ADS_SPEED,
        VERTICAL_RECOIL_CONTROL,
        HORIZONTAL_RECOIL_CONTROL,
        WEAPON_STEADINESS,
        RECOIL_PATTERN,
        HORIZONTAL_RECOIL_PATTERN,
        VERTICAL_RECOIL_PATTERN,
        RECOIL_RECOVERY,
        ANIMATION_KICK,
        SWAY
    }

    @Getter
    public enum StockFeature {
        RELOAD_SPEED,
        RECOIL_KICK,
        VERTICAL_RECOIL_CONTROL,
        HORIZONTAL_RECOIL_CONTROL,
        STABILITY_SPEED,
        WEAPON_STEADINESS,
        WEAPON_STABILITY_AFTER_SHOT,
        SWAY,
    }

}
