package org.ecofriendly.service;

import org.ecofriendly.db.entity.user.Account;
import org.ecofriendly.db.repository.AccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.mockito.MockitoAnnotations.initMocks;

@DataJpaTest
class AccountServiceTest {


	@Mock
	AccountRepository  accountRepository;
	@InjectMocks
	UserAccountService userAccountService;

	@BeforeEach
	public void setup() {
		initMocks(this);
	}

	private Account prepareAccount() {
		Account account = new Account();
		//account.setDateOfBirth(LocalDate.of(1990, 12, 31));
		account.setEmail("valid-mail@example.com");
		account.setMiddleName("Blaine");
		account.setFirstName("Hubert");
		account.setLastName("Wolfeschlegelsteinhausenbergerdorff");
		account.setSex("M");
		account.setPassword("ALLYOURBASEAREBELONGTOUS");
		return account;
	}

	@Test
	void shouldSaveUserAccount() {
		Account account = prepareAccount();
		Assertions.assertFalse(userAccountService.isUserAlreadyExists(account.getEmail()));
		accountRepository.delete(account);
	}

	@Test
	void shouldNotSaveAlreadyExistingUserAccount() {
		accountRepository.deleteAll();
		Account account = new Account();
		//account.setDateOfBirth(LocalDate.of(1990, 12, 31));
		account.setEmail("valid-mail@example.com");
		account.setMiddleName("Blaine");
		account.setFirstName("Hubert");
		account.setLastName("Wolfeschlegelsteinhausenbergerdorff");
		account.setSex("M");
		account.setPassword("ALLYOURBASEAREBELONGTOUS");
		account.setUsername("someUsername");
		accountRepository.save(account);
		Assertions.assertTrue(userAccountService.isUserAlreadyExists(account.getEmail()));
		Account account2 = new Account();
		account2.setUsername("someUsername2");
		account2.setEmail(account.getEmail());

		//userAccountRepository.saveAndFlush(account);
		Assertions.assertFalse(userAccountService.isUserAlreadyExists(account2.getEmail()));
		accountRepository.delete(account);
	}
}