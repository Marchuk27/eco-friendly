package org.ecofriendly.service.interfaces;

import org.ecofriendly.db.entity.user.Account;

import java.util.List;

public interface IUserAccountService {

    List<Account> getAllUsers();

    /**
     * @return true - есть такой пользователь; false - нет
     */
    Boolean isUserAlreadyExists(String email);

    /**
     * @return true - если введенные в поля значения паролей совпадают и значение пароля:
     * -не менее 6 символов
     * -есть хотя бы 1 цифра
     */
    Boolean checkCorrectInputForPasswords(Account account);

    /**
     * @return true - если пользователь прошел все прроверки
     */
    Boolean checkFormData(Account userForm);
}
