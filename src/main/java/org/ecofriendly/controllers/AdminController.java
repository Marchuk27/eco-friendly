package org.ecofriendly.controllers;

import org.ecofriendly.forms.AdminSignForm;
import org.ecofriendly.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {
    private boolean authFlag = false;
    private AdminService adminService;

    @Autowired
    private void setAdminService(AdminService adminService) {
        this.adminService = adminService;
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
            authFlag = true;
            return "/admin/admin-main";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Главная
     */
    @GetMapping(value = "/admin/main")
    public String adminMainPage() {
        if (authFlag) {
            return "/admin/admin-main";
        }
        return "/admin/admin-sign";
    }


    /**
     * Admin Заявки
     */
    @GetMapping(value = "/admin/requests")
    public String adminRequests() {
        if (authFlag) {
            return "/admin/admin-requests";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Редактор новостей
     */
    @GetMapping(value = "/admin/news")
    public String adminNews() {
        if (authFlag) {
            return "/admin/admin-news";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Управление БД
     */
    @GetMapping(value = "/admin/db")
    public String adminDatabase() {
        if (authFlag) {
            return "/admin/admin-db";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Выход из учетки
     */
    @GetMapping(value = "/admin/log-out")
    public String adminLogOut() {
        authFlag = false;
        return "/admin/admin-sign";
    }
}
