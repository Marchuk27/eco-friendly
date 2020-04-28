package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

//@Entity
@Getter
@Setter
public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //левая часть страницы - формы для ввода
    @Transient private String plasticInput;
    @Transient private String glassInput;
    @Transient private String paperInput;
    @Transient private String clothesInput;
    @Transient private String accumsInput;
    @Transient private String technInput;
    @Transient private String metalInput;
    @Transient private String dangerInput;
    @Transient private String otherInput;

    //правая часть страница - вычисляемые (на фронте) значения, которые кладутся в базу
    private String total;
    private String plasticTotal;
    private String glassTotal;
    private String paperTotal;
    private String clothesTotal;
    private String accumsTotal;
    private String technTotal;
    private String metalTotal;
    private String dangerTotal;
    private String otherTotal;
}
