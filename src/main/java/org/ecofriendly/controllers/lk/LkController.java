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

@Controller
public class LkController {
    private TrackerService trackerService;
    private CheckListService checkListService;

    @Autowired
    private void setTrackerService(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @Autowired
    private void setCheckListService(CheckListService checkListService) {
        this.checkListService = checkListService;
    }

    /**
     * ЛК-Профиль
     */
    @GetMapping("/lk/")
    public String lk() {
        return "/lk/lk-profile";
    }

    @GetMapping("/lk/account")
    public String lkAccount() {
        return "/lk/lk-profile-account";
    }

    /**
     * ЛК-Карта
     */
    @GetMapping("/lk/map")
    public String mapPage() {
        return "/lk/lk-map";
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

    /**
     * Личный кабинет - Новости
     */
    @GetMapping(value = "/lk/news")
    public String newsPage() {
        return "/lk/lk-news";
    }


    /**
     * Личный кабинет - FAQ
     */
    @GetMapping(value = "/lk/faq")
    public String faqPage() {
        return "/lk/lk-faq";
    }

//    @GetMapping(value = "/lk/faq-types")
//    public String faqTypesPage() {
//        return "/lk/lk-faq-types";
//    }

    @GetMapping(value = "/lk/faq-periods")
    public String faqPeriodsPage() {
        return "/lk/lk-faq-periods";
    }

    @GetMapping(value = "/lk/faq-marks")
    public String faqMarksPage() {
        return "/lk/lk-faq-marks";
    }
}

