package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.handbooks.News;

import javax.persistence.Entity;
import java.util.List;

//@Entity
@Getter
@Setter
public class NewsPage {

    List<News> newsThread;
}
