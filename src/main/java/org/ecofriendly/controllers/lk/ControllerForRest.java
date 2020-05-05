package org.ecofriendly.controllers.lk;

import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.entity.company.News;
import org.ecofriendly.db.repository.CheckListRepository;
import org.ecofriendly.db.repository.NewsRepository;
import org.ecofriendly.db.repository.TrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForRest {
    @Autowired
    private TrackerRepository trackerRepository;
    @Autowired
    private CheckListRepository checkListRepository;
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping(value = "/tracker/")
    @ResponseBody
    public Tracker trackerForUser(@RequestParam String username) {
        return trackerRepository.getTrackerByAccount_Username(username);
    }

    @GetMapping(value = "/checklist/")
    @ResponseBody
    public CheckList checkListForUser(@RequestParam String username) {
        return checkListRepository.getCheckListByAccount_Username(username);
    }

    @GetMapping(value = "/news/")
    public Iterable<News> newsData() {
        return newsRepository.findAll();
    }
}
