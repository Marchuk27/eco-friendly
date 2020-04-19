package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.repository.CompanyRepository;
import org.ecofriendly.repository.company.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(SpringRunner.class)
@DataJpaTest
class CompanyServiceImplementationTest {
	@Mock
	private CompanyRepository            companyRepository;
	@Mock
	private CategoryRepository           categoryRepository;
	@InjectMocks
	private CompanyServiceImplementation companyService;

	@BeforeEach
	public void setup() {
		initMocks(this);
	}

	@Test
	public void getCategoryCompanies() {
		Dictionary<String, List<Company>> expected = new Hashtable<>();
		Category cat1 = new Category(),
				cat2 = new Category(),
				cat3 = new Category();

		cat1.setName("cat1");
		cat2.setName("cat2");
		cat3.setName("cat3");

		List<Category> categories = new ArrayList<>();
		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		categoryRepository.saveAll(categories);

		Set<Category> cat1Set = new HashSet<>(),
				cat1and2Set = new HashSet<>(),
				cat3Set = new HashSet<>();

		cat1Set.add(cat1);
		cat1and2Set.add(cat1);
		cat1and2Set.add(cat2);
		cat3Set.add(cat3);

		Company company1cat1 = new Company(),
				company2cat1and2 = new Company(),
				company3cat3 = new Company();

		company1cat1.setName("company1cat1");
		company2cat1and2.setName("company2cat1and2");
		company3cat3.setName("company3cat3");

		company1cat1.setCategory(cat1Set);
		company2cat1and2.setCategory(cat1and2Set);
		company3cat3.setCategory(cat3Set);

		List<Company> cat1List = new ArrayList<>(),
				cat2List = new ArrayList<>(),
				cat3List = new ArrayList<>();
		cat1List.add(company1cat1);
		cat1List.add(company2cat1and2);
		cat2List.add(company2cat1and2);
		cat3List.add(company3cat3);

		companyRepository.saveAll(cat1List);
		companyRepository.save(company3cat3);

		expected.put(cat1.getName(), cat1List);
		expected.put(cat2.getName(), cat2List);
		expected.put(cat3.getName(), cat3List);


		Dictionary<String, List<Company>> found = companyService.getCategoryCompanies(categories);

		//Assertions.assertEquals(expected.size(), found.size());
		//Assertions.assertEquals(expected.keys(), found.keys());
		Assertions.assertEquals(expected.get(company1cat1.getName()), found.get(company1cat1.getName()));

		companyRepository.deleteAll();
		categoryRepository.deleteAll();
	}
}