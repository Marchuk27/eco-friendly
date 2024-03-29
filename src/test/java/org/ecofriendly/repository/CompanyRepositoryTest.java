package org.ecofriendly.repository;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Address;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.handbooks.Phone;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.hamcrest.CoreMatchers.hasItem;


@RunWith(SpringRunner.class)
@DataJpaTest
class CompanyRepositoryTest {
	@Autowired
	private CompanyRepository repository;

	@Test
	public void findAllByName() {
		Company company = new Company();
		company.setName("test");
		repository.save(company);
		ArrayList<Company> found = (ArrayList<Company>) repository.findAllByName("test");
		Assert.assertThat(found, hasItem(company));
		repository.delete(company);
	}

}