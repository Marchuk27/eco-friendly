package org.ecofriendly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {
    /**
     * Admin Вход
     */
    @GetMapping(value = "/admin")
    public String adminPage() {
        return "admin-sign";
    }

    @PostMapping(value = "/admin")
    public String adminSignIn() {
        return "admin-sign";
    }

    /**
     * Admin Заявки
     */
    @GetMapping(value = "/admin/requests")
    public String adminRequests() {
        return "admin-sign";
    }

    /**
     * Admin Редактор новостей
     */
    @GetMapping(value = "/admin/news")
    public String adminNews() {
        return "admin-news";
    }
}
