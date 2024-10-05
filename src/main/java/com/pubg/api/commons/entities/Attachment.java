package com.pubg.api.commons.entities;

import com.pubg.api.commons.enums.AttachmentTypeEnum;
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
    private Double magnificationFov;
    private Double adsSpeed;
    private Double reloadSpeed;
    private Integer ammoCapacity;
    private Double recoilControl;
    private String recoilPattern;
    private String horizontalRecoilPattern;
    private String verticalRecoilPattern;
    private String weaponSound;
    private String muzzleFlash;
    private String pelletSpread;
    private Double verticalRecoilControl;
    private Double horizontalRecoilControl;
    private Double weaponSteadiness;
    private Double recoilRecovery;
    private String animationKick;
    private String sway;
    private Double recoilKick;
    private Double stabilitySpeed;
    private Double weaponStabilityAfterShot;
    private String description;

    @Enumerated(EnumType.STRING)
    private AttachmentTypeEnum attachmentType;


}