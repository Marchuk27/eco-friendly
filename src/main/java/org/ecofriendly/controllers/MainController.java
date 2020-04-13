package org.ecofriendly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    /**
     * Главная страница
     */
    @GetMapping(value = "/main")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @PostMapping(value = "/main")
    public ModelAndView mainPageSearch() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    /**
     * Личный кабинет
     */
    @GetMapping(value = "/personal-cabinet")
    public ModelAndView profileCabinetController() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("personal-cabinet");
        return modelAndView;
    }

    @PostMapping(value = "/personal-cabinet")
    public ModelAndView profileSignInController() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("personal-cabinet");
        return modelAndView;
    }

    @GetMapping(value = "/personal-cabinet/registration")
    public ModelAndView registrationController() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @PostMapping(value = "/personal-cabinet/registration")
    public ModelAndView registerUserController() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    /**
     * Компаниям
     */
    @GetMapping(value = "/for-companies")
    public ModelAndView forCompaniesController() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("for-companies");
        return modelAndView;
    }

    /**
     * FAQ
     */
    @GetMapping(value = "/faq")
    public ModelAndView faqController() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("faq");
        return modelAndView;
    }
}
