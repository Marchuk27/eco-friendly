package org.ecofriendly.controllers.lk;

import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.entity.company.News;
import org.ecofriendly.db.repository.CheckListRepository;
import org.ecofriendly.db.repository.NewsRepository;
import org.ecofriendly.db.repository.TrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Tracker trackerForUser(@RequestParam Long id){
        return trackerRepository.getTrackerByUserAccount_Id(id);
    }

    @GetMapping(value = "/checklist/")
    @ResponseBody
    public CheckList checkListForUser(@RequestParam Long id){
        return checkListRepository.getCheckListByUserAccount_Id(id);
    }

    @GetMapping(value = "/news/")
    public Iterable<News> newsData() {
        return newsRepository.findAll();
    }
}
