package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class CompanyForm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String street;
    private String house;
    private String building;
    private String floor;
    private String flat;

    //категории отходов
    private Boolean isPlastic;
    private Boolean isGlass;
    private Boolean isPaper;
    private Boolean isClothes;
    private Boolean isAccums;
    private Boolean isTech;
    private Boolean isMetal;
    private Boolean isDangerous;
    private Boolean isOther;

    private String phone;
    private String email;
    private Boolean isTaxi;
}
