package org.ecofriendly.repository;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.repository.company.CategoryRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;


@RunWith(SpringRunner.class)
@DataJpaTest
class CompanyRepositoryTest {
	@Autowired
	private CompanyRepository  repository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Test
	public void findAllByName() {
		Company company = new Company();
		company.setName("test");
		repository.save(company);
		ArrayList<Company> found = (ArrayList<Company>) repository.findAllByName("test");
		Assert.assertThat(found, hasItem(company));
		repository.delete(company);
	}

	@Test
	public void findOneCompanyByOneCategory() {
		Company company = new Company();
		company.setName("company1");
		Category category = new Category();
		category.setName("category");
		categoryRepository.save(category);
		Set<Category> set = new HashSet<>();
		set.add(category);
		company.setCategory(set);
		repository.save(company);
		ArrayList<Company> found = (ArrayList<Company>) repository.findAllByCategory(category);
		Assert.assertThat(found, hasItem(company));
		categoryRepository.deleteAll();
		repository.deleteAll();
	}

	public void findMultipleCompaniesByOneCategory() {
		Company company1 = new Company(), company2 = new Company();
		company1.setName("company1");
		company2.setName("company2");
		Category category = new Category();
		category.setName("category");
		categoryRepository.save(category);
		Set<Category> set = new HashSet<>();
		set.add(category);
		company1.setCategory(set);
		company2.setCategory(set);
		repository.save(company1);
		repository.save(company2);
		ArrayList<Company> found = (ArrayList<Company>) repository.findAllByCategory(category);
		Assert.assertThat(found, hasItems(company1, company2));
		categoryRepository.deleteAll();
		repository.deleteAll();
	}
}