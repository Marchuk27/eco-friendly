package org.ecofriendly.controllers.lk;

import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.repository.TrackerRepository;
import org.ecofriendly.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LkController {
    private TrackerRepository trackerRepository;
    private TrackerService trackerService;

    @Autowired
    private void setTrackerService(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @Autowired
    private void setTrackerRepository(TrackerRepository trackerRepository) {
        this.trackerRepository = trackerRepository;
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
}

