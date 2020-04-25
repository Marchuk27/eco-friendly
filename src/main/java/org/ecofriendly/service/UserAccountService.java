package org.ecofriendly.service;

import org.ecofriendly.db.entity.UserAccount;
import org.ecofriendly.repository.UserAccountRepository;
import org.ecofriendly.service.interfaces.IUserAccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserAccountService implements IUserAccountService {

    private final UserAccountRepository userRepository;

    public UserAccountService(UserAccountRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Boolean isUerAlreadyExists(String email) {
        return Objects.nonNull(userRepository.findUserAccountByEmail(email));
    }

    @Override
    public Boolean checkFormData(UserAccount userForm) {
        if (isUerAlreadyExists(userForm.getEmail())) {
            return false;
        }
        //TODO: Еще проверки по введенным данным в форму регистрации
        return true;
    }
}
