package org.ecofriendly.controllers.api;

import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.entity.company.News;
import org.ecofriendly.db.repository.NewsRepository;
import org.ecofriendly.db.repository.TrackerRepository;
import org.ecofriendly.service.CheckListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * Контроллер для формирования ответов в виде JSON на фронт
 * для функционала Личного Кабинета
 */
@RestController
public class JSReqLkController {
    @Autowired
    private TrackerRepository trackerRepository;
    @Autowired
    private CheckListService checkListService;
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping(value = "/tracker/")
    @ResponseBody
    public Tracker trackerForUser(@RequestParam String username) {
        return trackerRepository.getTrackerByAccount_Username(username);
    }

    @GetMapping(value = "/checklist/")
    @ResponseBody
    public List<String> checkListForUser(@RequestParam String username) {
        return checkListService.getIdeaListByAccount_Username(username);
    }

    @GetMapping(value = "/news/")
    public Iterable<News> newsData() {
        return newsRepository.findAll();
    }

    @GetMapping(value = "/session+user+name/")
    @ResponseBody
    public String getUserNameFromSession(Principal principal) {
        return principal.getName();
    }
}
