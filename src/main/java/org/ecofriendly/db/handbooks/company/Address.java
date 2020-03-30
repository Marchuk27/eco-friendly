package org.ecofriendly.db.handbooks.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.ecofriendly.db.entity.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String address;
	private double latitude;
	private double longitude;
	@ManyToMany
	@JsonIgnore
	private Set<Company> company;
}
