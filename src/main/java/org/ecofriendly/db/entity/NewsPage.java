package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.dictionaries.News;

import java.util.List;

//@Entity
@Getter
@Setter
public class NewsPage {

    List<News> newsThread;
}
