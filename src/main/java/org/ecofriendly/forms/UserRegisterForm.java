package org.ecofriendly.forms;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

/**
 * Класс со всеми полями формы регистрации пользователей
 * при прохождении всех проверок при регистрации entity-class UserAccount
 * обогащается значениями полей из этого класса, и они записываются в БД
 */
@Getter
@Setter
@NoArgsConstructor
public class UserRegisterForm {
    private String firstName;
    private String surname;
    private String fatherName;
    private Date dateOfBirth;

    private boolean isMan;
    private String email;
    private String password;
    private String repeatPassword;
}
