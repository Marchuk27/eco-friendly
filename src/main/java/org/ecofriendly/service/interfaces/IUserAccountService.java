package org.ecofriendly.service.interfaces;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.ecofriendly.db.entity.UserAccount;

import java.util.List;

public interface IUserAccountService {

    List<UserAccount> getAllUsers();

    /**
     * @return true - есть такой пользователь; false - нет
     */
    Boolean isUerAlreadyExists(String email);

    /**
     * @return true - если пользователь прошел все прроверки
     */
    Boolean checkFormData(UserAccount userForm);
}
