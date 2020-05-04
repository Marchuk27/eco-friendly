package org.ecofriendly.controllers.lk;

import org.ecofriendly.db.entity.company.News;
import org.ecofriendly.db.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForData {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping(value = "/news/")
    public Iterable<News> newsData() {
        return newsRepository.findAll();
    }

}
