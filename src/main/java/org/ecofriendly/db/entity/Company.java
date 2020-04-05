package org.ecofriendly.db.entity;


import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.entity.company.Address;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.db.handbooks.Phone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<Email> getEmail() {
		return email;
	}

	public void setEmail(Set<Email> email) {
		this.email = email;
	}

	public Set<Phone> getPhone() {
		return phone;
	}

	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}

	public Set<Category> getCategory() {
		return category;
	}

	public void setCategory(Set<Category> category) {
		this.category = category;
	}

	public Company(){}
	public Company(
				   String 		 name,
				   Set<Address>  address,
				   Set<Email> 	 email,
				   Set<Phone> 	 phone,
				   Set<Category> category){
		this.name	  = name;
		this.address  = address;
		this.email	  = email;
		this.phone	  = phone;
		this.category = category;
	}
}
