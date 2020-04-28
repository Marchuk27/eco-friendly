package org.ecofriendly.service;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.db.entity.UserAccount;
import org.ecofriendly.repository.UserAccountRepository;
import org.ecofriendly.service.interfaces.IUserAccountService;
import org.ecofriendly.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
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
    public Boolean isUserAlreadyExists(String email) {
        return Objects.nonNull(userRepository.findUserAccountByEmail(email));
    }

    @Override
    public Boolean checkCorrectInputForPasswords(UserAccount account) {
        return StringUtils.hasFieldOneMoreNumOrLetter(account.getPassword()) &&
                StringUtils.checkFieldForCorrectLength(account.getPassword()) &&
                StringUtils.checkIdentityForPasswordFields(account);
    }

    @Override
    public Boolean checkFormData(UserAccount userForm) {
        if (isUserAlreadyExists(userForm.getEmail())) {
            log.error("Такой email уже существует " + userForm.getEmail());
            return false;
        }
        if (!checkCorrectInputForPasswords(userForm)) {
            log.error("Некорректный ввод пароля " + userForm.getPassword());
            return false;
        }
        //TODO: Еще проверки по введенным данным в форму регистрации
        return true;
    }
}
