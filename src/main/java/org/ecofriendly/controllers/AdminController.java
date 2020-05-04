package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.company.News;
import org.ecofriendly.forms.AdminSignForm;
import org.ecofriendly.db.repository.NewsRepository;
import org.ecofriendly.service.AdminService;
import org.ecofriendly.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {
    private AdminService adminService;
    private NewsRepository newsRepository;
    private NewsService newsService;

    @Autowired
    private void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    @Autowired
    private void setNewsRepository(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Autowired
    private void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }

    /**
     * Admin Вход
     */
    @GetMapping(value = "/admin")
    public String adminPage() {
        return "/admin/admin-sign";
    }

    @PostMapping(value = "/admin")
    public String adminSignIn(AdminSignForm adminSignForm, Model model) {
        model.addAttribute("adminSignForm", adminSignForm);
        if (adminService.authToAdminPanel(adminSignForm.getLogin(), adminSignForm.getPassword())) {
            return "/admin/admin-requests";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Заявки
     */
    @GetMapping(value = "/admin/requests")
    public String adminRequests() {
        return "/admin/admin-requests";
    }

    /**
     * Admin Редактор новостей
     */
    @GetMapping(value = "/admin/news")
    public String adminNews() {
        return "/admin/admin-news";
    }

    @PostMapping(value = "/admin/news")
    public String addNewsToSite(News newsObject, Model model) {
        newsService.prepareNewsObjectForPublishing(newsObject);
        if (newsService.checkForNullFields(newsObject)) {
            return "/admin/admin-news";
        }
        model.addAttribute("newsObject", newsObject);
        newsRepository.save(newsObject);
        return "/admin/admin-news-success";
    }

    /**
     * Admin Управление БД
     */
    @GetMapping(value = "/admin/db")
    public String adminDatabase() {
        return "/admin/admin-db";
    }

    /**
     * Admin Выход из учетки
     */
    @GetMapping(value = "/admin/log-out")
    public String adminLogOut() {
        return "/admin/admin-sign";
    }
}
