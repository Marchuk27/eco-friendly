package org.ecofriendly.db.handbooks.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String category;
	@ManyToMany
	@JsonIgnore
	private Set<Company> company;
}
