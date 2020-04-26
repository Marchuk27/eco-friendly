package org.ecofriendly.utils;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.forms.UserRegisterForm;

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

    public static boolean checkIdentityForPasswordFields(UserRegisterForm registerForm) {
        return registerForm.getPassword().equals(registerForm.getRepeatPassword());
    }
}
