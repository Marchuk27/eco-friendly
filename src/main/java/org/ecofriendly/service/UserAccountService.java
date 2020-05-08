package org.ecofriendly.service;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.db.entity.user.Account;
import org.ecofriendly.db.repository.AccountRepository;
import org.ecofriendly.service.interfaces.IUserAccountService;
import org.ecofriendly.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class UserAccountService implements IUserAccountService {

    private final AccountRepository accountRepository;

    public UserAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllUsers() {
        return accountRepository.findAll();
    }

    @Override
    public Boolean isUserAlreadyExists(String email) {
        return Objects.nonNull(accountRepository.findAccountByEmail(email));
    }

    @Override
    public Boolean checkCorrectInputForPasswords(Account account) {
        return StringUtils.hasFieldOneMoreNumOrLetter(account.getPassword()) &&
                StringUtils.checkFieldForCorrectLength(account.getPassword()) &&
                StringUtils.checkIdentityForPasswordFields(account);
    }

    @Override
    public Boolean checkFormData(Account userForm) {
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
    public List<Integer> getUserAchievements(String username) {
        Account account = accountRepository.findAccountByUsername(username);
        return account.getAchievementList();
    }

    public Account getUserInfoByUsername(String username) {
        return accountRepository.findAccountByUsername(username);
    }

}
