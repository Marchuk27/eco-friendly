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
import java.util.List;
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
	public void getAllCompanies() {
		Company company1 = new Company(), company2 = new Company();
		company1.setName("company1");
		company2.setName("company2");
		repository.save(company1);
		repository.save(company2);
		List<Company> found = repository.findAll();
		Assert.assertThat(found, hasItems(company1));
		Assert.assertThat(found, hasItem(company2));
		repository.deleteAll();
	}

	@Test
	public void findAllByName() {
		repository.deleteAll();
		Company company = new Company();
		company.setName("test");
		repository.save(company);
		List<Company> found = (List<Company>) repository.findAllByName("test");
		Assert.assertThat(found, hasItem(company));
		repository.delete(company);
	}

	/**
	 * Test for findAllByCategoriesIn
	 * One Company - One Category
	 */
	@Test
	public void findOneByCategory() {
		Company company = new Company();
		company.setName("company1");
		Category category = new Category();
		category.setName("category1");
		Set<Category> categorySet = new HashSet<>();
		categorySet.add(category);
		company.setCategory(categorySet);
		//Set<Company>  companySet  = new HashSet<>();|
		//companySet.add(company);		              | Causes StackOverflow Exception
		//category.setCompanySet(companySet);		  |
		categoryRepository.save(category);
		repository.save(company);
		List<Category> categories = new ArrayList<>();
		categories.add(category);
		List<Company> found = (List<Company>) repository.findAllByCategoryIn(categories);
		Assert.assertThat(found, hasItem(company));
		categoryRepository.deleteAll();
		repository.deleteAll();
	}

	/**
	 * Test for findAllByCategoriesIn
	 * Two Companies, One Category
	 */
	@Test
	public void findAllByCategory() {
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
		List<Category> categories = new ArrayList<>();
		categories.add(category);
		List<Company> found = (List<Company>) repository.findAllByCategoryIn(categories);
		Assert.assertThat(found, hasItems(company1, company2));
		categoryRepository.deleteAll();
		repository.deleteAll();
	}

	@Test
	public void findAllByCategoriesIn() {
		Company company1 = new Company(), company2 = new Company();
		company1.setName("company1");
		company2.setName("company2");

		Category category1 = new Category(), category2 = new Category();
		category1.setName("cat1");
		category2.setName("cat2");

		categoryRepository.save(category1);
		categoryRepository.save(category2);

		Set<Category> set1 = new HashSet<>(), set2 = new HashSet<>();
		set1.add(category1);
		set2.add(category2);

		company1.setCategory(set1);
		company2.setCategory(set2);

		repository.save(company1);
		repository.save(company2);

		List<Category> categories = new ArrayList<>();
		categories.add(category1);
		categories.add(category2);

		List<Company> found = (List<Company>)repository.findAllByCategoryIn(categories);
		Assert.assertThat(found, hasItems(company1, company2));
		categoryRepository.deleteAll();
		repository.deleteAll();
	}

	@Test
	public void findAllByCategoryIs() {
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
		List<Company> found = repository.findAllByCategoryIs(category);
		Assert.assertThat(found, hasItems(company1, company2));
		categoryRepository.deleteAll();
		repository.deleteAll();
	}
}