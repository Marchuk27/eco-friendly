package org.ecofriendly.enumeration;

import lombok.Getter;
import lombok.Setter;

public enum Months {
    January("Январь"),
    February("Февраль"),
    March("Март"),
    April("Апрель"),
    May("Май"),
    June("Июнь"),
    July("Июль"),
    August("Август"),
    September("Сентябрь"),
    October("Октябрь"),
    November("Ноябрь"),
    December("Декабрь");

    @Getter
    private String name;

    Months(String name) {
        this.name = name;
    }
}
