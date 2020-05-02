package org.ecofriendly.service;

import org.apache.commons.lang3.StringUtils;
import org.ecofriendly.db.dictionaries.News;
import org.ecofriendly.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class NewsService {

    public void prepareNewsObjectForPublishing(News newsObject) {
        DateUtils.setDateToPublication(newsObject);
        newsObject.setLikeAmount(0);
    }

    public boolean checkForNullFields(News newsObject) {
        return Objects.isNull(newsObject.getDateOfPublish())
                || Objects.isNull(newsObject.getTextContent())
                || StringUtils.isEmpty(newsObject.getTextContent());
    }
}
