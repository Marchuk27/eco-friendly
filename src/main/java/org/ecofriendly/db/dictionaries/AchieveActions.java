package org.ecofriendly.db.dictionaries;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
//@Entity
public class AchieveActions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /** "Безумец" - сдал что-то из категории "Опасное" */
    private Boolean hasDangerInTracker;

    /**
     * "Начинающий сортировщик" >= 500 в общем единиц в трекере
     * "Продвинутый сортировщик" >= 1000
     * "Ярый сортировщик" >= 5000
     * "Я из Швеции" >= 10000
     * */
    private Integer generalUnitAmountInTracker;

    /**
     * "Начинающий стекольщик" >= 30
     * "Продвинутый стекольщик" >= 500
     * "Ярый стекольщик" >= 2000
     * */
    private Integer glassAmountInTracker;

    /**
     * «Рекрут-краснолюд» - сдать более 10 единиц металла
     * «Краснолюд» - сдать более 500 единиц металла
     * «Мастер краснолюдов» - сдать более 2000 единиц металла
     */
    private Integer metalAmountInTracker;

    /** «Все и сразу» - отметить в трекере все категории за один раз */
    private Boolean allInputsAreFilledInTracker;

    /** "Идейный" - закрепить 2 идеи в чеклисте*/
    private Boolean hasTwoIdeasInCheckList;

    /**
     * "Турист" - просмотреть на карте 10 компаний*
     * "Матёрый географ" - 70 компаний
     * "Географ глобус сдал" - 250 компаний
     * "Экскурсовод" - 700 компаний
     */
    private Integer amountOfCompaniesViewed;

    /**
     * "Пока учусь" - зайти 5 раз на страницу FAQ
     * "Студент" - 30 раз
     * "Исследователь" - 100 раз
     * "Вместо Гугл" - 500 раз
     * */
    private Integer amountOfVisitedFAQ;

    /**
     * "Интересуюсь" - зайти 5 раз на страницу Новости
     * "Событийный" - 30 раз на страницу Новости
     * "Газета подождёт" - 70 раз
     * "На лавке у подьезда" - 150 раз
     * */
    private Integer amountOfVisitedNews;
}
