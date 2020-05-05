package org.ecofriendly.controllers.lk;

import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.service.CheckListService;
import org.ecofriendly.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Controller
public class LkController {
    private TrackerService   trackerService;
    private CheckListService checkListService;

    @Autowired
    private void setTrackerService(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @Autowired
    private void setCheckListService(CheckListService checkListService) {
        this.checkListService = checkListService;
    }

    @GetMapping("/lk/")/*тут нужен будет параметр - id пользователя лк*/
    public String lk() {
        return "/lk/lk-profile";
    }

    /**
     * Личный кабинет - Трэкер
     */
    @GetMapping(value = "/lk/tracker")
    public String trackerPage() {
        return "/lk/lk-tracker";
    }

    @PostMapping(value = "/lk/tracker")
    public String calculateTracker(Tracker trackerPage, Model model) {
        model.addAttribute("trackerPage", trackerPage);
        trackerService.calculateValuesFromTracker(trackerPage);
        //trackerRepository.save(trackerPage);
        return "/lk/lk-tracker";
    }

    @GetMapping(value = "/tracker/")
    public Map<String, String> trackerData(Long userAccountId) {
        return trackerService.getTrackerValuesByAccountId(userAccountId);
    }

    /**
     * Личный кабинет - Чеклист
     */
    @GetMapping(value = "/lk/checklist")
    public String checklistPage() {
        return "/lk/lk-checklist";
    }

    @PostMapping(value = "/lk/checklist")
    public String fillCheckList(CheckList checkListPage, Model model) {
        model.addAttribute("checkListPage", checkListPage);
        checkListService.saveIdeaToProductList(checkListPage);
        //checkListRepository.save(checkListPage);
        return "/lk/lk-checklist";
    }

    @GetMapping(value = "/checklist/")
    public List<String> checklistData(Long userAccountId) {
        return checkListService.getCheckListByAccountId(userAccountId);
    }

    /**
     * Личный кабинет - Новости
     */
    @GetMapping(value = "/lk/news")
    public String newsPage() {
        return "/lk/lk-news";
    }
}
