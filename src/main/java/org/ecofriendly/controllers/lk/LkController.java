package org.ecofriendly.controllers.lk;

import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.repository.CheckListRepository;
import org.ecofriendly.db.repository.TrackerRepository;
import org.ecofriendly.service.CheckListService;
import org.ecofriendly.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class LkController {
    private TrackerService trackerService;
    private CheckListService checkListService;
    @Autowired
    private TrackerRepository trackerRepository;
    @Autowired
    private CheckListRepository checkListRepository;

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
    public String calculateTracker(Tracker trackerForm, Model model, Principal principal) {
        model.addAttribute("trackerForm", trackerForm);
        Tracker existTracker = trackerRepository.getTrackerByAccount_Username(principal.getName());
        trackerService.setFieldsFromFormToExistTracker(trackerForm, existTracker);
        trackerService.calculateValuesFromTracker(existTracker, principal.getName());
        model.asMap().clear();
        trackerRepository.save(existTracker);
        return "redirect:/lk/tracker";
    }

    /**
     * Личный кабинет - Чеклист
     */
    @GetMapping(value = "/lk/checklist")
    public String checklistPage() {
        return "/lk/lk-checklist";
    }

    @PostMapping(value = "/lk/checklist")
    public String fillCheckList(CheckList checkListForm, Model model, Principal principal) {
        model.addAttribute("checkListForm", checkListForm);
        CheckList existCheckList = checkListRepository.getCheckListByAccount_Username(principal.getName());
        List<String> ideaList = checkListService.getIdeaListByAccount_Username(principal.getName());
        if (!ideaList.contains(checkListForm.getIdeaInput())) {
            ideaList.add(checkListForm.getIdeaInput());
        }
        existCheckList.setSavedIdeas(ideaList);
        checkListForm.setIdeaInput(null);
        existCheckList.setIdeaInput(null);
        model.asMap().clear();
        checkListRepository.save(existCheckList);
        return "redirect:/lk/checklist";
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

