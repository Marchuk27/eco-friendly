package org.ecofriendly.controllers;

import org.ecofriendly.forms.MainPageForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/main")
    public String searchReceive(Model model) {
        MainPageForm mainPageForm = new MainPageForm();
        model.addAttribute("mainPageForm", mainPageForm);
        return "main";
    }

    @PostMapping("/main")
    public String searchSend(Model model, @ModelAttribute("mainPageForm") MainPageForm mainPageForm) {
        boolean isPlasticChosen = mainPageForm.isPlastic();
        boolean isPaperChosen = mainPageForm.isPaper();
        boolean isGlassChosen = mainPageForm.isGlass();
        boolean isClothesChosen = mainPageForm.isClothes();
        boolean isBatteriesChosen = mainPageForm.isBatteries();
        boolean isElectornicsChosen = mainPageForm.isElectornics();
        boolean isMetalChosen = mainPageForm.isMetal();
        boolean isDangerousChosen = mainPageForm.isDangerous();
        boolean isOtherChosen = mainPageForm.isOther();

        return "main";
    }
}
