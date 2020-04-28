package org.ecofriendly.service.interfaces;

import org.ecofriendly.db.entity.UserAccount;

import java.util.List;

public interface IUserAccountService {

    List<UserAccount> getAllUsers();

    /**
     * @return true - есть такой пользователь; false - нет
     */
    Boolean isUserAlreadyExists(String email);

    /**
     * @return true - если введенные в поля значения паролей совпадают и значение пароля:
     *   -не менее 6 символов
     *   -есть хотя бы 1 цифра
     */
    Boolean checkCorrectInputForPasswords(UserAccount account);

    /**
     * @return true - если пользователь прошел все прроверки
     */
    Boolean checkFormData(UserAccount userForm);
}
