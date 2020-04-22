package org.ecofriendly.forms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyForm {
    private String name;
    private String street;
    private Integer house;
    private String building;
    private Integer floor;
    private Integer flat;

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
