package org.ecofriendly.model.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.model.Company;

import javax.persistence.*;
import java.util.Set;

@Entity @Setter @Getter
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
