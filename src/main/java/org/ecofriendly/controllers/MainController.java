package org.ecofriendly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/")
public class MainController {
    /**
     * Главная страница
     */
    @RequestMapping()
    public String main() {
        return "main";
    }

    /**
     * Компаниям
     */
    @GetMapping(value = "/for-companies") //TODO:rename
    public String forCompaniesController() {
        return "for-companies";
    }

    /**
     * FAQ
     */
    @GetMapping(value = "/faq")
    public String faqController() {
        return "faq";
    }

    @GetMapping(value = "/faq/categories")
    public String faqCategoriesController() {
        return "faq-categories";
    }

    @GetMapping(value = "/faq/periods")
    public String faqPeriodsController() {
        return "faq-periods";
    }

    @GetMapping(value = "/faq/marks")
    public String faqMarkersController() {
        return "faq-marks";
    }
}
