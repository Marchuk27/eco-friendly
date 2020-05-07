package org.ecofriendly.controllers.api;

import org.ecofriendly.db.dictionaries.Achievement;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.entity.company.News;
import org.ecofriendly.db.repository.NewsRepository;
import org.ecofriendly.db.repository.TrackerRepository;
import org.ecofriendly.db.repository.AchievementRepository;
import org.ecofriendly.service.CheckListService;
import org.ecofriendly.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
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
    @Autowired
    private UserAccountService accountService;
    @Autowired
    private AchievementRepository achievementRepository;


    @GetMapping(value = "/session+user+name/")
    @ResponseBody
    public String getUserNameFromSession(Principal principal) {
        return principal.getName();
    }

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

    @GetMapping(value = "/achievements/")
    @ResponseBody
    public List<Achievement> getAchievementsForUser(@RequestParam String username) {
        List<Achievement> achievementList = new ArrayList<>();
        List<Integer> achievementIdList = accountService.getUserAchievements(username);
        for (Integer id : achievementIdList) {
            if (achievementRepository.existsAchievementById(id)) {
                achievementList.add(achievementRepository.findAchievementById(id));
            }
        }
        return achievementList;
    }
}
