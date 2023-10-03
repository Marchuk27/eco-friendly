package org.ecofriendly.db.entity.company;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long         id;
	private String       name;
	@ManyToMany(mappedBy = "category", fetch = FetchType.LAZY)
	@JsonBackReference
	private Set<Company> company;
}
