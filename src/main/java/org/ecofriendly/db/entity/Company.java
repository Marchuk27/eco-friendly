package org.ecofriendly.db.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.company.Address;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.handbooks.Phone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Getter
@Setter
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long          id;
	@NotNull
	private String        name;
	@ManyToMany
	private Set<Address>  address;
	@OneToMany
	private Set<Email>    email;
	@OneToMany
	private Set<Phone>    phone;
	@ManyToMany(fetch = FetchType.EAGER)
	@JsonManagedReference
	private Set<Category> category;
}
