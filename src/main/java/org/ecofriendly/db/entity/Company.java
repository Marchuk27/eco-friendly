package org.ecofriendly.db.entity;


import lombok.Data;
import org.ecofriendly.db.entity.company.Address;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.handbooks.Phone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long          id;
	@NotNull
	private String        name;
	@ManyToMany(mappedBy = "company")
	private Set<Address>  address;
	@OneToMany
	private Set<Email>    email;
	@OneToMany
	private Set<Phone>    phone;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "company_category",
			joinColumns = @JoinColumn(name = "company_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
	private Set<Category> categories;
}
