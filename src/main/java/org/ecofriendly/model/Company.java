package org.ecofriendly.model;

import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.model.company.Address;
import org.ecofriendly.model.company.Category;
import org.ecofriendly.model.company.Email;
import org.ecofriendly.model.company.Phone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity @Setter @Getter
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String name;
	@ManyToMany(mappedBy = "company")
	private Set<Address> address;
	@OneToMany
	private Set<Email> email;
	@OneToMany
	private Set<Phone> phone;
	@ManyToMany(mappedBy = "company")
	private Set<Category> category;
}
