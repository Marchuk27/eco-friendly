package org.ecofriendly.service;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.db.entity.UserAccount;
import org.ecofriendly.forms.UserRegisterForm;
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
    public Boolean checkCorrectInputForPasswords(UserRegisterForm userForm) {
        return StringUtils.hasFieldOneMoreNumOrLetter(userForm.getPassword()) &&
                StringUtils.checkFieldForCorrectLength(userForm.getPassword()) &&
                StringUtils.checkIdentityForPasswordFields(userForm);
    }

    @Override
    public Boolean checkFormData(UserRegisterForm userForm) {
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

    @Override
    public void setAccountFields(UserRegisterForm userForm, UserAccount account) {
        account.setFirstName(userForm.getFirstName());
        account.setSurname(userForm.getSurname());
        account.setFatherName(userForm.getFatherName());
        account.setDateOfBirth(userForm.getDateOfBirth());

        account.setMan(userForm.isMan());
        account.setEmail(userForm.getEmail());
        account.setPassword(userForm.getPassword());
    }
}
