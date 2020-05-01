package org.ecofriendly.utils;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.constants.AdminConstants;
import org.ecofriendly.db.entity.UserAccount;

import static org.ecofriendly.constants.AdminConstants.ADMIN_LOGIN;
import static org.ecofriendly.constants.AdminConstants.ADMIN_PASSW;

/**
 * Class-helper for strings in this project
 */
@Slf4j
public class StringUtils {

    public static boolean hasFieldOneMoreNumOrLetter(String fieldValue) {
        if (fieldValue == null || fieldValue.equals("")) {
            log.error("Empty or null password field in registration form");
            return false;
        }
        char[] charArray = fieldValue.toCharArray();
        boolean hasAtLeastOneLetter = false;
        boolean hasAtLeastOneNumber = false;
        for (Character c : charArray) {
            if (Character.isLetter(c)) {
                hasAtLeastOneLetter = true;
            }
            if (Character.isDigit(c)) {
                hasAtLeastOneNumber = true;
            }
        }
        return hasAtLeastOneLetter && hasAtLeastOneNumber;
    }

    public static boolean checkFieldForCorrectLength(String fieldValue) {
        return fieldValue.length() >= 6;
    }

    public static boolean checkIdentityForPasswordFields(UserAccount registerForm) {
        return registerForm.getPassword().equals(registerForm.getRepeatPassword());
    }

    /**
     * Проверка данных формы для входа в панель администратора
     * @param login Логин, введенный при входе в админскую учетку
     * @param password Пароль, введенный при входе в админскую учетку
     * @return true - доступ разрешен / false - отказано в доступе
     */
    public static boolean checkAdminAuth(String login, String password) {
        if (login.equals(ADMIN_LOGIN) && password.equals(ADMIN_PASSW)) {
            return true;
        }
        log.warn("!!!!  Попытка доступа к панели администрирования  !!!!");
        return false;
    }

    public static boolean equalsForOperationUuid(String receivedCode, String operationUuid) {
        return operationUuid.equals(receivedCode);
    }
}
