package org.ecofriendly.db.dictionaries;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Справочник, в котором будут храниться достижения
 * Аналитика по достижениям будет указана внизу класса, а также
 * в Trello будет прикреплен соответствующий документ
 * Также в javadoc будет указано место инкрементации/проверки достижения в коде (Класс, Метод)
 */
@Getter
@Setter
@Entity
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;
    private String urlToIcon;

    /**
     *  Формат: Нэйминг достижения / Текстовка /  Место в коде
     *
     * 1 "Эко-энтузиаст" / Зарегистрируйтесь в личном кабинете
     * / UserAccountController.class; method = registerUser();
     *
     * 2 "Безумец" / Сдайте что-либо из категории "Опасное" /
     * AchievementUtils.class; method = checkDangerInputForAchieves();
     *
     * 3 "Начинающий сортировщик" / Сдать более 500 единиц отходов /
     * TrackerService.class; method = checkTotalValueForAchievements();
     *
     * 4 "Продвинутый сортировщик" / Сдать более 500 единиц отходов /
     * TrackerService.class; method = checkTotalValueForAchievements();
     *
     * 5 "Ярый сортировщик" / Сдать более 500 единиц отходов /
     * TrackerService.class; method = checkTotalValueForAchievements();
     *
     * 6 "Я из Швеции" / Сдать более 500 единиц отходов /
     * TrackerService.class; method = checkTotalValueForAchievements();
     *
     * 7 "Начинающий стекольщик" / Сдать 30 единиц стекла /
     * AchievementUtils.class; method = checkGlassInputsForAchieves();
     *
     * 8 "Продвинутый стекольщик" / Сдать 500 единиц стекла /
     * AchievementUtils.class; method = checkGlassInputsForAchieves();
     *
     * 9 "Ярый стекольщик" / Сдать 2000 единиц стекла /
     * AchievementUtils.class; method = checkGlassInputsForAchieves();
     *
     * 10 "Идейный" / Закрепите 2 идеи в Чеклисте /
     * AchievementUtils.class; method = checkCheckListForAchieves();
     *
     *  //TODO: Доделать оставшующся аналитику
     *
     * «Рекрут-краснолюд» - сдать более 10 единиц металла
     * «Краснолюд» - сдать более 500 единиц металла
     * «Мастер краснолюдов» - сдать более 2000 единиц металла
     *
     * «Все и сразу» - отметить в трекере все категории за один раз
     *

     *
     *
     * "Турист" - просмотреть на карте 10 компаний*
     * "Матёрый географ" - 70 компаний
     * "Географ глобус сдал" - 250 компаний
     * "Экскурсовод" - 700 компаний
     *
     * "Пока учусь" - зайти 5 раз на страницу FAQ
     * "Студент" - 30 раз
     * "Исследователь" - 100 раз
     * "Вместо Гугл" - 500 раз
     *
     * "Интересуюсь" - зайти 5 раз на страницу Новости
     * "Событийный" - 30 раз на страницу Новости
     * "Газета подождёт" - 70 раз
     * "На лавке у подьезда" - 150 раз
     */
}