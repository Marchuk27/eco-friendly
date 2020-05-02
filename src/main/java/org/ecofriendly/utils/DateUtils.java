package org.ecofriendly.utils;

import org.ecofriendly.db.dictionaries.News;

import java.sql.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    /**
     * Метод для установки в качестве даты публикации новости текущей даты
     * */
    public static void setDateToPublication(News newsObj) {
        Date currentDate = new Date(GregorianCalendar.getInstance().getTime().getTime());
        newsObj.setDateOfPublish(currentDate);
    }
}
