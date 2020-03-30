package org.ecofriendly.db.handbooks.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String address;
	private Double latitude;
	private Double longitude;
	@ManyToMany
	@JsonIgnore
	private Set<Company> company;
}
