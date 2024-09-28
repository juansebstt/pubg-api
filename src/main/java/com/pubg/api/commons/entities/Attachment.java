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

    @Enumerated(EnumType.STRING)
    private ScopeFeature scopeFeature;

    @Enumerated(EnumType.STRING)
    private MagazineFeature magazineFeature;

    @Enumerated(EnumType.STRING)
    private MuzzleFeature muzzleFeature;

    @Enumerated(EnumType.STRING)
    private GripFeature gripFeature;

    @Enumerated(EnumType.STRING)
    private StockFeture stockFeture;

}
