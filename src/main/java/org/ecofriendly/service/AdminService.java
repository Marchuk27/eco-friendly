package org.ecofriendly.service;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class AdminService {

    public boolean authToAdminPanel(String login, String password) {
        if (Objects.isNull(login) || Objects.isNull(password)) {
            log.error("NULL DATA IN ADMIN SIGN-IN FORM !!!");
            return false;
        }
        return StringUtils.checkAdminAuth(login, password);
    }
}
