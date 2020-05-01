package org.ecofriendly.controllers;

import org.ecofriendly.forms.AdminSignForm;
import org.ecofriendly.service.AdminService;
import org.ecofriendly.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {
    private Integer uuid;
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
        uuid = SessionUtils.generateAdminSessionUUID();
        return "/admin/admin-sign";
    }

    @PostMapping(value = "/admin")
    public String adminSignIn(AdminSignForm adminSignForm, Model model) {
        model.addAttribute("adminSignForm", adminSignForm);
        if (adminService.authToAdminPanel(adminSignForm.getLogin(), adminSignForm.getPassword())) {
            SessionUtils.addParamToSessionMap(uuid, adminSignForm.getLogin());
            authFlag = true;
            return "/admin/admin-main";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Главная
     */
    @GetMapping(value = "/admin/main={code}")
    public String adminMainPage(@PathVariable String code) {
        if (authFlag && SessionUtils.validateAdminAccess(uuid, code, 1)) {
            return "/admin/admin-main";
        }
        return "/admin/admin-sign";
    }


    /**
     * Admin Заявки
     */
    @GetMapping(value = "/admin/requests={code}")
    public String adminRequests(@PathVariable String code) {
        if (authFlag && SessionUtils.validateAdminAccess(uuid, code, 2) ) {
            return "/admin/admin-requests";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Редактор новостей
     */
    @GetMapping(value = "/admin/news={code}")
    public String adminNews(@PathVariable String code) {
        if (authFlag && SessionUtils.validateAdminAccess(uuid, code, 3)) {
            return "/admin/admin-news";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Управление БД
     */
    @GetMapping(value = "/admin/db={code}")
    public String adminDatabase(@PathVariable String code) {
        if (authFlag && SessionUtils.validateAdminAccess(uuid, code, 4)) {
            return "/admin/admin-db";
        }
        return "/admin/admin-sign";
    }

    /**
     * Admin Выход из учетки
     */
    @GetMapping(value = "/admin/log-out")
    public String adminLogOut() {
        SessionUtils.deleteParamFromSessionMap(uuid);
        authFlag = false;
        return "/admin/admin-sign";
    }
}
