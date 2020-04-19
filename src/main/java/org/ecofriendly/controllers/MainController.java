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
    @GetMapping()
    public String main() {
        return "main";
    }

    /**
     * Компаниям
     */
    @GetMapping("/for-companies") //TODO:rename
    public String forCompaniesController() {
        return "for-companies";
    }

    /**
     * FAQ
     */
    @GetMapping("/faq")
    public String faqController() {
        return "faq";
    }

    @GetMapping("/faq/categories")
    public String faqCategoriesController() {
        return "faq-categories";
    }

    @GetMapping("/faq/periods")
    public String faqPeriodsController() {
        return "faq-periods";
    }

    @GetMapping("/faq/marks")
    public String faqMarkersController() {
        return "faq-marks";
    }
}
