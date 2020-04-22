package org.ecofriendly.controllers;

import org.ecofriendly.forms.CompanyForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
    @GetMapping(value = "/for-companies") //TODO:rename
    public String forCompaniesController() {
        return "for-companies";
    }

    @PostMapping("/for-companies")
    public String sendCompanyRequest(CompanyForm companyform, Model model) {
        model.addAttribute("companyForm", companyform);
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
