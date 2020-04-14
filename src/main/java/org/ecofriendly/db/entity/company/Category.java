package org.ecofriendly.db.entity.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.ecofriendly.db.entity.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long         id;
	private String       name;
	@ManyToMany(mappedBy = "categories")
	@JsonIgnore
	private Set<Company> companySet;
}
